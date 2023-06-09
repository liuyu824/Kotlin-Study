data class Country (
    val countryName:String,
    val countryContinent:String,
    val population:Int
)
// 创建了所有国家的数据库，想通过一下方法对欧洲的国家进行筛选
class CountryApp01 {
    fun filterCountries(countries:List<Country>):List<Country>{
        val res = mutableListOf<Country>()
        for (c in countries){
            if (c.countryContinent == "EU"){
                res.add(c)
            }
        }
        return res
    }
}

// 改进: 通过以下方法，可以根据不同的洲进行筛选, 实现了方法复用
class CountryApp02 {
    fun filterCountries(countries: List<Country>,continent:String):List<Country>{
        val res = mutableListOf<Country>()
        for(country in countries){
            if (country.countryContinent == continent ){
                res.add(country)
            }
        }
        return res
    }
}

// 想筛选有一定人口规模的国家
class CountryApp03 {
    fun filterCountries(countries: List<Country>,continent:String,population: Int):List<Country>{
        val res = mutableListOf<Country>()
        for(country in countries){
            if (country.countryContinent == continent && country.population >= population){
                res.add(country)
            }
        }
        return res
    }
}

// 问题：如果存在更多的筛选条件会作为方法参数不断增加，业务逻辑也高度耦合
// Kotlin支持高阶函数，可把筛选的逻辑变成方法来传入，思路更简单
// 写一个测试类
class CountryTest{
    fun isBigEUCountry(country: Country):Boolean{
        return country.countryContinent == "EU" && country.population >= 10000
    }
}

// 调用此方法可以判断一个国家是否为欧洲大国
// 如何将此方法 引用作为参数传递给 filterCountries
// 增加了一个函数类型的参数
class CountryApp{
    fun filterCountries(
        countries: List<Country>,
        test:(Country)->Boolean):List<Country>{
        val res = mutableListOf<Country>()
        for (c in countries){
            if (test(c)){
                res.add(c)
            }
        }
        return res
    }
}

fun main() {
    // 如何把清单中 isBigEUCountry 方法
// 传递给 filterCountries
    val countryApp = CountryApp()
    val countryTest = CountryTest()
    val country = Country("China","Asia",10000000)
    val countries = mutableListOf(country)
    println(countryApp.filterCountries(countries,countryTest::isBigEUCountry))
}


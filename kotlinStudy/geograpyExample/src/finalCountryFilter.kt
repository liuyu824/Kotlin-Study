fun main() {

    val countries = mutableListOf<Country>()
    val finalCountryApp = FinalCountryApp()

    val country1 = Country("China","EU",10000)
    val country2 = Country("America","EU",1000000)
    val country3 = Country("Korea","EU",22)
    countries.add(country1)
    countries.add(country2)
    countries.add(country3)

    // 简化之前
    finalCountryApp.filterCountry(countries,fun(country:Country):Boolean{
        return country.countryContinent == "EU" && country.population >= 1000
    })

    // 简化之后
    finalCountryApp.filterCountry(countries) {
        it.countryContinent == "EU" && it.population >= 1000
    }
}

class FinalCountryApp{
    fun filterCountry(
        countries:List<Country>,
        test:(Country)->Boolean):List<Country>{
        val res = mutableListOf<Country>()
        for (c in countries){
            if (test(c)){
                res.add(c)
            }
        }
        println(res)
        return res
    }
}
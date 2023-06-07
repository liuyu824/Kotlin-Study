### Kotlin介绍

JetBrains

- Android Studio
- IntelliJ IDEA

#### Kotlin跨平台特性

kotlin可以支持编写代码在虚拟机上运行，而且还是一门跨平台的通用型语言，我们可以用kotlin开发应用。

例如，Android、macOS、Windows、JavaScript应用。

Kotlin可以脱离虚拟机层，直接编译成可以在Windows、Linux和macOS平台上运行的<a style="color:red">原生二进制代码</a>

#### Kotlin 与 JVM

![截屏2023-06-07 08.55.52](/Users/liuyu/Library/Application Support/typora-user-images/截屏2023-06-07 08.55.52.png)

#### Kotlin最佳学习方式

- 与java语言对比，提高学习效率
- 知识点尽量覆盖全面，不留认知缺陷
- 课程不断更新迭代



### 语言声明变量与内置数据类型

```kotlin
var maximumAge:Int = 5
```

| 类型    | 描述             | 示例                                              |
| ------- | ---------------- | ------------------------------------------------- |
| String  | 字符串           | "Hello World"                                     |
| Char    | 单字符           | 'A'                                               |
| Boolean | true/false       | true false                                        |
| Int     | 整数             | 5                                                 |
| Double  | 小数             | 3.14                                              |
| List    | 元素集合         | 1,8,10<br/>"Jack","Jason","Jacky"                 |
| Set     | 无重复元素的集合 | "Jack","Jason","Jacky"                            |
| Map     | 键值对集合       | "small" to 5,<br/>"medium" to 8,<br/>"large" to 9 |

在kotlin中存在**类型推断**：

变量声明时赋值了stirng或int，就不必再指定变量类型，允许使用时省略对变量的声明定义。

kotlin是编译型的语言，自带的编译器非常强大。



### 编译时常量

- 只读变量 并非绝对只读
- <a style="color:red">**编译时常量只能在函数之外定义**</a>，因为编译时常量必须在编译时赋值，而函数都是在运行时才调用，函数内的变量也是在运行时赋值，编译时常量要在这些变量赋值前就已存在。
- 编译时常量只能是常见的基本数据类型：String, Int, Double, Float, Long, Short, Byte, Char, Boolean。

<img src="/Users/liuyu/Library/Application Support/typora-user-images/截屏2023-06-07 10.56.37.png" align="left" style="zoom:75%;" />



#### Kotlin字节码

- 查看Kotlin编译之后的字节码，有助于我们深入理解Kotlin语言。
- 两种方式
  - Shift键两次，输入show kotlin
  - Tools -> Kotlin -> Show Kotlin Bytecode



### 引用类型和基本数据类型

- java有两种数据类型：引用类型与基本数据类型
- Kotlin只提供引用类型这一种数据类型，出于更高性能的需要，Kotlin编译器会在java字节码文件中<a style="color:red">改用基本数据类型</a>



### 表达式

#### if/else if表达式 (java相同)

#### range表达式

- in A...B, in关键字用来检查某个值是否在指定范围之内。

```kotlin
fun main(){
    val age = 50
    ageCondition(age);
}

fun ageCondition(age:Int){
    if (age in 0..3){
        println("婴幼儿")
    } else if (age in 4..18){
        println("青少年")
    } else {
        println("成年人")
    }
}
```



#### when表达式

- 允许你编写条件式，在某个条件满足时，执行对应的代码
- 只要代码中包含else if分支，都建议改用when表达式

```kotlin
val level :Any = when (school){
        "幼儿园" -> "幼儿"
        "小学" -> "小学生"
        "初中" -> "少年"
        "研究生" -> "青年"
        else->{
            println("未知等级")
        }
    }
    println(level)
```



### string模板

- 模版支持在字符串的引号内放入变量值；
- 还支持字符串里计算表达式的值并插入结果，添加在${}中的任何表达式，都会作为字符串的一部分求值。

```kotlin
fun main(){
    var stu_name = "刘宇"
    var stu_pNum = 13611244680
    println("$stu_name 的手机号码是 $stu_pNum")
  
    var flag = false;
    println("${if (flag)"我可以" else "我不行"}")
}
```



### 函数头

![截屏2023-06-07 13.13.26](/Users/liuyu/Library/Application Support/typora-user-images/截屏2023-06-07 13.13.26.png)

```kotlin
private fun doSomething(age:Int,flag:Boolean):String{
    return "他的$age 是${if (flag) "真实" else "不真实"}的"
}
```



### 函数参数

#### 默认值参

- 如果不打算传入值参，可以预先给参数指定默认值

```kotlin
public fun fix(stuName:String,stuAge:Int=2):String{
    return "学生的名字是$stuName,学生的年龄是$stuAge"
}
```

**例**：stuAge已经传入了2的值。

调用这个方法的时候，如果不给stuAge赋值，那就默认是2；

如果赋值了，那就按照赋的值进行方法调用。



#### 具名函数参数

- 如果使用命名值参，就可以不用管值参的顺序

使用方法中命名的名称直接赋值，就可以不用考虑顺序了。

```kotlin
fix(stuAge = 100, stuName = "刘宇")
```



### Unit函数

- 不是所有函数都有返回值，Kotlin中没有返回值的函数叫Unit函数
- 即，返回类型是Unit。
- 在java中，函数不返回任何值用void描述，即忽略类型。
- 但是void这种解决方案无法解释现代语言的一个重要特征，泛型。



### Nothing类型



### 反引号中的函数名

- Kotlin可以使用空格和特殊字符对函数命名，不过函数名要用一对反引号括起来。
- 为了支持Kotlin和java互操作，而kotlin和java各自有不同的保留关键字，不能作为函数名使用，使用反引号括住函数名就能避免任何冲突。

<img src="/Users/liuyu/Library/Application Support/typora-user-images/截屏2023-06-07 16.46.37.png" align="left" style="zoom:105%"/>



### 匿名函数

- 定义时不取名字的函数，我们称之为匿名函数，匿名函数通常整体传递给其他函数，或者从其他函数返回。
- 匿名函数对于Kotlin来说很重要，有了它，我们能够根据需要指定特殊规则，轻松定制标准库里的内置函数。

```kotlin
fun main() {
    val total = "Mississippi".count()
    val totals = "Mississippi".count { letter -> letter == 's' }

    println(total)
    println(totals)
}
```



### 函数类型与隐式返回

- 匿名函数也有类型，匿名函数可以当作变量赋值给函数类型变量。就像其他变量一样，匿名函数就可以在代码中传递了。变量有类型，变量可以等于函数，函数也会有类型。**<a style="color:red">函数的类型，由传入的参数和返回值类型决定</a>**。
- 和具名函数不一样，除了极少数情况外，匿名函数不需要return关键字来返回数据，匿名函数会隐式或**<a style="color:red">自动返回函数体最后一行语句的结果</a>**。

```kotlin
// 变量的类型是一个匿名函数
    val blessingFunction:()->String = {
        val holiday = "New Year."
        "Happy $holiday"
    }
    println(blessingFunction())
```



### 函数参数



it关键字

匿名函数的类型推断

什么是lambda

定义参数是函数的函数

简略写法

函数内联

函数引用

函数类型作为返回类型

val intArray = intArrayOf(1,2,3,4,5)
fun main() {
    // intArray = []
    // 报错，intArray cannot be resigned
    // please change the type into var

    intArray[0] = 10
    for(i in intArray){
        print("$i,")}
}
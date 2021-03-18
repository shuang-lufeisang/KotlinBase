package simple02.s01

// TODO: 2021/3/3 simple02 比较和数组
// 比较
//  比较值本身 1. == （Kotlin 推荐）2. equals（同java）
//  比较对象地址 1. ===; (java 中使用 == 比较对象地址)
fun main(){
    val name1:String = "路飞"
    val name2:String = "路飞"

    // --- 比较值本身
    // 推荐 == 等价 Java 的 equals
    println(name1.equals(name2))
    println(name1 == name2)

    // --- 比较对象地址: ===
    val test1:Int? = 10000
    val test2:Int? = 10000
    println(test1 === test2) // false - 地址不同

}
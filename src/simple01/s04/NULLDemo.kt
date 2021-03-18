package simple01.s04

// TODO: 2021/2/16-2021/3/3 NULL 检查机制
fun main() {

    // Kotlin的空安全设计对于声明可为空的参数，在使用时要进行判空处理
    // 方案一: ? 如果修饰的对象为null,就不执行其后的方法,就不会触发空指针异常。（打印输出null）
    // 方案二: !! 调用者自己确保该对象不为null,不管是否真的为null 都会强制执行,如若为null 会像Java一样抛出空异常
    // 方案三: 使用前提前判断是否为空（同java）
    // ?: 前修饰的参数为null 时，执行后面的语句，否则不执行后面的语句。
    var info: String? = null
//    println("方案一 ?修饰 ${info?.length}") // 补救方案一: ?, 如果info是null，就不执行.length
//    println(info?.length)
    println(info?.length ?: "确定是null啊") // ?: 前修饰的参数为null 时，执行后面的语句，否则不执行后面的语句。

    info ="路飞"
    println(info?.length ?: "确定是null啊")

    // 补救方案二: !!
//    println(info!!.length)

    // 补救方案三: 提前判空（同java）, 自己负责info不为null
//    if (info != null)
//        println(info.length)

    // 测试允许返回null 的函数 ////////////////////
    println(testMethod("zs"))
    println("测试允许返回null 的函数1: ${testMethod("zs")}")
    println("测试允许返回null 的函数2: ${testMethod("lu")}")
    println(testMethod("lu"))
}

// ?允许函数返回null
fun testMethod(name:String): Int?{
    if (name == "zs"){
        return 999
    }
    return null
}
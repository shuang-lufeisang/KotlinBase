package simple01.s04

// TODO: 2021/2/16 NULL 检查机制
fun main() {

    // Kotlin的空安全设计对于声明可为空的参数，在使用时要进行判空处理
    // 方案一: ?
    // 方案二: !!, 像Java一样抛出空异常
    var info: String? = null
    println(info?.length) // 补救方案一: ?, 如果info是null，就不执行.length
}
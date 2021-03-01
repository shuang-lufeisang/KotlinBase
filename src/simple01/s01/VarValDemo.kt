package simple01.s01
// TODO: 2021/2/14 var 与 val
fun main() {

// 可变变量定义 : var 关键字
// var <标识符> : <类型> = <初始化值>

// 不可变变量定义 : val 关键字, 只能赋值一次的变量
// val <标识符> : <类型> = <初始化值>

    // var
    var name: String = "Luffy"
    name = "Suolong"
    name = "Robin"

    // val 不可修改
    val age: Int = 22
//    age = 23 // 报错

    var info1 = "AAAA" // 类型推导 String
    var info2 = 'A'    // 类型推导 Char
    var info3 = 22     // 类型推导 Int

    // 静态语言 编译期就决定了数据类型
    var info4 = "路飞"
    // info4 = 22 // info 确定了为String类型， 但是JavaScript可行（动态解释性语言）


}

class Test {
    // 可修改 get set
    var info1 : String = "A"
    // 只读  get
    val info2 : String = "B"
}


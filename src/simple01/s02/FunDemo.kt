package simple01.s02

// TODO: 2021/2/16  函数
// kotlin '函数'（一级公民） 不同于 Java '方法'必须写在类的里面
// 返回类型 void == :Unit
// 可变参数 vararg (参数长度不固定)
// lambda 表达式函数

fun main() :Unit {

    println("两数之和: ${add(1,2)}") // 打印函数返回值
    println(add3(1,2))

//    println("可变参数的函数:")
//    lenMethod(1,3,5,7,9)

    // lambda表达式函数 (传进来两个Int) -> 返回值也是Int {形参的名字 -> 返回值}
    val addMethod : (Int, Int) -> Int = {number1, number2 -> number1 + number2}

    // lambda表达式函数 addMethod的使用
    val result : Int = addMethod(9, 9)
    println(result)
    println("lambda表达式函数: ${addMethod(8, 8)}")


}

// 两数之和 返回类型 Int
fun add(number1: Int, number2:Int) : Int{
    return number1 + number2
}

// 两数之和 返回类型 - 类型推导 Int
fun add2(number1: Int, number2:Int) = number1 + number2

// 两数之和 返回类型 - 类型推导 String
fun add3(number1: Int, number2:Int) = "两数之和: $number1 + $number2 = ${add2(number1,number2)}"

// 可变参数
fun lenMethod(vararg value:Int){
    for (i in value) {
        println(i)
    }
}
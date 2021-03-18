package simple02.s02

// TODO: 2021/2/13-2021/3/3 集合 数组
// 形式一: arrayOf(element1, element2, ...)
// 形式二: Array(size-循环次数){元素表达式}
fun main() {

    // 第一种形式
    val numbers:Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val numbers1 = arrayOf(1, 2, 3, 4, 5)
//    println(numbers[0])
//    println(numbers[4])
    for (number in numbers) {
//        println(number)
    }

    // 第二种形式 value 默认从0开始， size:循环20次
    //{ value: Int -> (value + 1000) }
    //value: Int 表示定义一个Int类型的变量value
    //-> 表示拿前面的变量去做后面的运算
    val numbers2 = Array(20) { value: Int -> (value + 1000) }
    val numbers3 = Array(20) { a: Int -> (a+100) }
    val numbers4 = Array(20) { a: Int -> (a*100) }


    for (value:Int in numbers4) {
        println(value)
    }

}
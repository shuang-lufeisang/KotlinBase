package simple02.s02

// TODO: 2021/2/13 数组
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
    val numbers2 = Array(20, {value:Int -> (value + 1000) })

    for (value:Int in numbers2) {
        println(value)
    }

}
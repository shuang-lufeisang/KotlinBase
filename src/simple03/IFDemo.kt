package simple03

// TODO: 2021/3/8 条件
// when 里的参数什么类型都可以传入 升级版的switch
fun main() {
    val number1: Int = 99999
    val number2: Int = 88888

    //表达式 比 大小
    val maxValue = if (number1>number2) number1 else number2
//    println(maxValue)

    val max2 = if (number1>number2){
        println("number1 是最大值")
        // 此处。。。
        //number1 // 返回 number1
    } else{
        println("number2 是最大值")
        // 此处。。。
        number2
    }
//    println(max2)

    // 使用区间做判断
    val x = 80
    val y = 29
    if (x in 1..10 && y in 1..50){
        println("坐标（$x,$y)符合要求")
    }else{
        println("坐标（$x,$y)不符合要求")
    }

    // when （java switch 的升级版）
//    val number = 5
//    when(number){
//        1 -> println("一")
//        2 -> println("二")
//        3 -> println("三")
//        4 -> println("四")
//        5 -> println("五")
//    }
//
//    when(number){
//        in 1..100 -> println("1..100")
//        in 200..500 -> println("200..500")
//        in 600..1000 -> println("600..1000")
//        else -> println("其他范围")
//    }


    // Any 类似于 java 的 Object
    val tag = 1;
    val result = when(tag){
        1->{
            println("1 哟")
            "今天是星期一"

            1
        }
        2->{
            println("2 哟")
            "今天是星期二"
        }
        3->{
            println("3哟")
            "今天是星期三"
        }
        else-> "不知道星期几"
    }
    println(result)

    when(8){
        1,2,3,4,5,6,7 -> println("<=7 的正整数")
        else -> print(">7的正整数")
    }
}
package simple01.s05

// 2021/2/11-2021/3/3 区间
fun main(){

    // 1 到 9
    for(i:Int in 1..9){
//        println(i)
    }

    // 9..1 不是区间 无法输出？
    for(i:Int in 9..1){
//        println(i)
    }

    // 从大到小
    for(i:Int in 9 downTo 1){
//        println(i)
    }

    val value = 100
    if (value in 1..100){//[1,100]
        println("包含在 1 到 100 的区间里")
    }else{
        println("不在区间 1 到 100 的范围内")
    }

    // 指定步长
    for (i:Int in 1..20 step 2){
//        println(i)
    }

    // 排除最后的元素，即打印 1到 9 [前闭后开)
    for (i in 1 until 10){ //[1, 10)
        println(i)
    }


}
package simple04

// TODO: 2021/3/15 循环 与 标签
// 可以给某段代码 命名--标签
fun main() {

    // 标签  标签名称@
    testTag@for (i in 1..20){
        for (j in 1..20){
            println("i: $i, j: $j")
            if (i==5){
                //break // 跳出本层j循环
                break@testTag //跳出外层i循环
            }
        }
    }


    // 循环
    var items: List<String> = listOf<String> ("路飞", "索隆", "山治")
    for (item in items) {
        println("for循环便利列表 items $item")
    }

    items.forEach { println("forEach遍历it $it") }

    for (index in items.indices) {
        println("indices遍历下标 index: $index, 对应的值: ${items[index]}")
    }
}

class Lu{
    val I = "Lu Fei"
    fun show(){
        println(I)
        println(this.I)
        println(this@Lu.I)
    }
}
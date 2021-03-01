package simple01.s03

// TODO: 2021/2/15 字符串模板
fun main() {
    // $ 表示一个变量名 或变量值
    // $varName 表示变量值
    // ${varName.fun()} 表示变量的方法返回值

    val name = "路飞"
    val age = 22
    val info = "东海风车村"
    println("name:$name, age:$age, info:$info")

    // --- 换行: 三重引号 不再需要 \n
    // .trimIndent() 去除前置空格
    val infoMess = """
       AAAAAAAAA
       BBBBBBBBB
       CCCCCCCCC
       DDDDDDDDD
    """.trimIndent()
    println("做了去除前缀处理的 多行文字展示 : $infoMess")

    val infoMess1 = """
       AAAAAAAAA
       BBBBBBBBB
       CCCCCCCCC
       DDDDDDDDD
    """ //.trimIndent()
    println("不做去除前缀空格(no .trimIndent())处理展示为 : $infoMess1")


    val infoMess2 = """
       |AAAAAAAAA
       |BBBBBBBBB
       |CCCCCCCCC
       |DDDDDDDDD
    """.trimMargin()  // 默认去除|
    println("去除前缀'|' 展示为 : $infoMess2")

    val infoMess3 = """
       ?AAAAAAAAA
       ?BBBBBBBBB
       ?CCCCCCCCC
       ?DDDDDDDDD
    """.trimMargin("?")  // 去除统一的?
    println("去除前缀'?' 展示为 : $infoMess3")

    // 场景：展示 $999.9
    val price = """
        ${'$'}999.9
    """.trimIndent()
    println("带货币符号的展示 -- $price")

}
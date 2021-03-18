package simple05.s01

// kotlin 类默认是public的
// 构造方法 : -- 构造函数重载
//   1. 主构造 （直接跟在类名后）
//   2. 次构造 （必须要引入主构造）
// class Person  全称：public final class Person
// Person 如果需要被继承，必须 open
open class Person (id: Int) // 1. 主构造
{
    // 2. 次构造
    constructor(id: Int, name: String){

    }

    // 2. 次构造
    constructor(id: Int, name: String, sex: Char){

    }

    // 2. 次构造 - 引入主构造
    constructor(): this(12){

    }
}
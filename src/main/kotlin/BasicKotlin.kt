// Program entry point
fun main() {

    // Basic syntax

    // 1:Print to the standard output
    println("標準出力 : Hello Kotlin!!")

    // 2:Functions(引数戻り値あり)
    println("関数 : " + sum(7, 8))

    // 3:Variables
    // 定数(再代入不可)
    val a:Int = 1
    // 変数
    var b:Int = 3
    b = 4
    // 初期値代入
    var c:Int = 9
    // 初期値代入なし
    var d:Int
    d = 8
    // 型推論
    var e = 7
    println("変数と定数 : a = $a,  b = $b,  c = $c,  d = $d,  e = $e")
}

// 2:Functions(引数戻り値あり)
fun sum(a: Int, b: Int): Int {
    return a + b
}

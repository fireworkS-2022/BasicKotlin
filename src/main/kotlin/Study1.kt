class Study1 {
    fun nullOrNonNull() {
        println("---Start nullOrNonNull---")
        // 基本的にはnullを許容しない
        var a: String = "aaa"
        // a = null コンパイルエラー
        println(a)

        // nullを許容したい場合
        var b: String? = "bbb"
        b = null
        println(b)

        // 変数?を使用する
        var c = "ccc"
        var cc = c?.length
        println(cc)

        // エルビス演算子
        var d: String? = "ddd"
        // エルビス演算子よう使用しない場合
        d = if(d != null) "d" else null
        println(d)
        var e = 12
        d = if (e < 10) "test" else null
        // エルビス演算子を使用した場合
        d = d ?: "null"
        println(d)


        println("---Finish nullOrNonNull---")
    }


}
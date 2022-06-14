# BasicKotlin

### プロジェクトの作成方法
1. 新規Projectを選択
2. 左にある「Gradle」を選択
3. その他のライブラリとフレームワーク：Kotlin/JVM
4. プロジェクトSDK(S)：Corretto-11(IntelliJに内蔵されているもの)
5. 次へを押下
6. untitled→自分の好きな名前
7. 「完了」を押下

### コンソールに「Hello Kotlin!!」を表示
1. src/main/kotlinの下にKotlinのファイル「Sample.kt」を作成
```:sample.kt
fun main() {
    println("Hello Kotlin!!")
}
```
2. 「Sample.kt」を選択して「実行」を選択



### 雑知識
- クラス名を変更した際にコンパイルが通らなくなる場合があるので、buildフォルダを削除して再度実行すると直る
（実行した際にBuildファイルが生成される）

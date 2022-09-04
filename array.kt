fun main() {
    var x = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var y = arrayOf(11, 12, 13, 14, 15, 16, 17)

    for (ele in y + x) {
        println(ele)
    }
}

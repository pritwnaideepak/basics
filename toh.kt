fun main() {
    hanoi(4, 'A', 'C', 'B')
}

fun hanoi(num: Int, from: Char, to: Char, aux: Char) {
    if (num <= 0) return
    hanoi(num - 1, from, aux, to)
    println("Move disk $num from $from to $to")
    // uiyhyguybiuhnih
    hanoi(num - 1, aux, to, from)
}

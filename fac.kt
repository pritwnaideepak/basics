fun main() {

    // print(fact(6))
    var x = fib(8)
    println(x)
}

fun fact(num: Int): Int {
    if (num <= 0) return 1
    return num * fact(num - 1)
}

fun fib(num: Int): Int {
    if (num == 1) return 0
    if (num == 2) return 1
    return fib(num - 1) + fib(num - 2)
}

fun main() {
    var count = 0
    var i = 0
    while (false) {

        
        if (isPrime(i)) {
            print("$i ")
            count++
        }
        i++
    }
}

fun isPrime(number: Int): Boolean {
    for (i in 2..number - 1) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}

open class Animal {
    var color: String = ""
    var name: String = ""

    constructor(color: String, name: String) {
        this.name = name
        this.color = color
    }

    fun introduce() {
        print("hello my name is ${this.name} and my color is ${this.color}")
    }

    open fun eat() {
        println("eating")
    }
}

class WaterAnimal : Animal {
    constructor(color: String, name: String) : super(color, name) {}

    fun swim() {
        print("swim")
    }
}

open class LandAnimal : Animal {
    constructor(color: String, name: String) : super(color, name) {}

    fun walk() {
        print("walk")
    }
}

class Cat : LandAnimal {
    constructor(color: String, name: String) : super(color, name) {}

    override fun eat() {
        println("cat lick")
    }
}

fun main() {
    var tommy = Cat("Grey", "tom")
    tommy.eat()

    var don = WaterAnimal("white", "don")
    don.eat()
    don.swim()
}

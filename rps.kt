enum class Selection {
  ROCK,
  PAPER,
  SCISSOR
}

enum class Gender {
  male,
  female,
}

class Game {
  fun play(player1: Player, player2: Player): Player? {
    val ch1 = player1.makechoice()
    val ch2 = player2.makechoice()

    println("player1 selected $ch1")
    println("player2 selected $ch2")

    if (ch1 == Selection.ROCK && ch2 == Selection.PAPER) {
      return player2
    } else if (ch1 == Selection.ROCK && ch2 == Selection.SCISSOR) {
      return player1
    } else if (ch1 == Selection.PAPER && ch2 == Selection.ROCK) {
      return player1
    } else if (ch1 == Selection.PAPER && ch2 == Selection.SCISSOR) {
      return player2
    } else if (ch1 == Selection.SCISSOR && ch2 == Selection.PAPER) {
      return player1
    } else if (ch1 == Selection.SCISSOR && ch2 == Selection.ROCK) {
      return player2
    } else if (ch1 == ch2) {
      return null
    } else {
      return null
    }
  }
}

class Player {
  var firstname: String
  var lastname: String
  var gender: Gender
  var age: Int

  constructor(firstname: String, lastname: String, gender: Gender, age: Int) {
    this.firstname = firstname
    this.lastname = lastname
    this.gender = gender
    this.age = age
  }

  fun makechoice(): Selection {
    return Selection.values().random()
  }
}

fun main() {
  var john = Player("Jhon", "dua", Gender.male, 100)
  var shon = Player("shon", "lua", Gender.male, 1000)
  val game = Game()
  val w = game.play(john, shon)
  println(w?.firstname)
}

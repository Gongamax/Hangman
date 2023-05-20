val WORDS = countries() // change this value to what ever you want to play with on hangman
const val PLAYER_LIVES = 6

/** Has a Bigger List of countries around the world, most of them are in portuguese**/

fun main() {
    val word = WORDS.random().uppercase()
    println("Word selected, lets play!")
    var slots: List<Char> = startSlots(word)
    var lives = PLAYER_LIVES
    do {
        val char = readLetter("$slots => letter")
        when {
            char.isNotLetter() -> println("Its not a letter")
            char !in word -> println("Wrong letter")
            else -> slots = replaceSlots(slots, char, word)
        }
        if (char !in word) {
            lives -= 1
            if (lives == 0) println("You died, sorry. The word was $word")
        }
        man(lives)
    } while (isUnfinished(slots) && lives > 0)

    println("$slots")
    if (!isUnfinished(slots)) {
        println("Congratulations, You guessed the word, $word!! With $lives lives remaining.")
    }
}

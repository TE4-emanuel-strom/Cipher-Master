package ciphers

import helpers.HelperClass.Companion.oneOfEach


class ShiftCipher(private val message: String, private var stepsShifted: Int) : Cipher() {


    fun decode(): String {
        val neededCharacters = oneOfEach(message)
        val specificKey = keyGenerator(neededCharacters)
        return (translate(message, specificKey))
    }

    fun encode(): String {
        stepsShifted *= -1
        return(decode())
    }


    private fun keyGenerator(charArray: CharArray): MutableMap<Char, Char> {
        val key = mutableMapOf<Char, Char>()
        for (letter in charArray) key[letter] = transformedLetter(letter)
        return key
    }

    fun transformedLetter(letter: Char): Char {

        return if (alphabetArray.contains(letter)) {

            val startIndex = alphabetArray.indexOf(letter)
            var shiftedIndex = startIndex + this.stepsShifted
            if (shiftedIndex >= alphabetArray.size) {
                shiftedIndex -= alphabetArray.size
            }
            if (shiftedIndex < 0) shiftedIndex += alphabetArray.size
            alphabetArray[shiftedIndex]
        } else {
            letter
        }
    }

}
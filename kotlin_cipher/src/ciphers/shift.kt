package ciphers

import helpers.HelperClass.Companion.oneOfEach


class ShiftCipher(override val message: String, private val stepsShifted: Int) : Cipher(message) {


    fun decode(): String {
        val neededCharacters = oneOfEach(message)
        val specificKey = keyGenerator(neededCharacters)
        return(translate(this, specificKey))
    }


    private fun keyGenerator(charArray: CharArray): MutableMap<Char, Char> {
        val key = mutableMapOf<Char, Char>()
        for(letter in charArray) key[letter] = transformedLetter(letter)
        return key
    }

    fun transformedLetter(letter: Char): Char {
        val startIndex = alphabetArray.indexOf(letter)
        var shiftedIndex = startIndex + this.stepsShifted
        if (shiftedIndex >= alphabetArray.size) {
            shiftedIndex -= alphabetArray.size
        }
        if (shiftedIndex < 0) shiftedIndex += alphabetArray.size
        return alphabetArray[shiftedIndex]
    }

}
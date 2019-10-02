package ciphers

class ShiftCipher(private val message: String, private val stepsShifted: Int) : Cipher() {


    fun solve(): String {
        val neededCharacters = oneOfEach(message)
        val specificKey = keyGenerator(neededCharacters)
        return(Cipher.decode(message.toCharArray(), specificKey))
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
package ciphers

class ShiftCipher(val stepsShifted: Int) : Cipher() {

    fun fullKeyGenerator(): Map<Char, Char> {
        val key = mutableMapOf<Char, Char>()
        for(letter in alphabetArray) key[letter] = transformedLetter(letter)
        return key
    }

    fun transformedLetter(letter: Char): Char {
        val startIndex = alphabetArray.indexOf(letter)
        var shiftedIndex = startIndex + this.stepsShifted
        if (shiftedIndex >= alphabetArray.size) {
            shiftedIndex -= alphabetArray.size
        }
        if (shiftedIndex < 0) {
            shiftedIndex += alphabetArray.size
        }
        return alphabetArray[shiftedIndex]
    }

    fun solve(message: String) {
        val neededCharacters = oneOfEach(message)

    }
}
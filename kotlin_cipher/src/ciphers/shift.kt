package ciphers

class ShiftCipher(stepsShifted: Int) : Cipher() {

    companion object KeyGenerator {
        fun fullKeyGenerator(stepsShifted: Int): Map<Char, Char> {
            var key = mutableMapOf<Char, Char>()
            for(letter in alphabetArray) key[letter] = transformedLetter(letter, stepsShifted)
            return key
        }

        fun transformedLetter(letter: Char, stepsShifted: Int): Char {
            val startIndex = alphabetArray.indexOf(letter)
            var shiftedIndex = startIndex + stepsShifted
            if (shiftedIndex >= alphabetArray.size) {
                shiftedIndex -= alphabetArray.size
            }
            if (shiftedIndex < 0) {
                shiftedIndex += alphabetArray.size
            }

            //println("shiftedIndex " + shiftedIndex)
            return alphabetArray[shiftedIndex]

        }

        fun solve(message: String): String {
            
        }

    }


}
package ciphers
import ciphers.Cipher

class ShiftCipher(stepsShifted: Int) : Cipher() {




    companion object KeyGenerator {
        
        fun a(): Char {
            val letterA = alphabetArray[0]
            return(letterA)
        }
    }


}
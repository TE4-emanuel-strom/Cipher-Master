package ciphers
import tests.TestClass

open class Cipher() {


    companion object Characters {
        val alphabetArray = arrayOf(
                'a', 'b', 'c', 'd',
                'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p',
                'q', 's', 't', 'u',
                'v', 'w', 'x', 'y',
                'z', 'å', 'ä', 'ö'
            )
        val specialCharactersArray = arrayOf(
                '.', ',', ';', ':',
                ' ', '!', '?', '\n'
            )
    }

    fun decodeGeneralCipher(message: String, key: Map<Char, Char>) {

    }


}
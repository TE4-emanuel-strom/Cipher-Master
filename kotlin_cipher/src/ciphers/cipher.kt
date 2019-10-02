package ciphers
import tests.TestClass

open class Cipher() {

    companion object Characters {
        val alphabetArray = arrayOf(
            'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p',
            'q', 'r', 's', 't',
            'u', 'v', 'w', 'x',
            'y', 'z', 'å', 'ä',
            'ö'
        )
        val specialCharactersArray = arrayOf(
            '.', ',', ';', ':',
            ' ', '!', '?', '\n'
        )

        public fun oneOfEach(string: String): CharArray {
            var charList = charArrayOf()
            for (char in string) {
                if (char !in charList) { charList += char }
            }
            return charList
        }

        fun decode(message: CharArray, key: MutableMap<Char, Char>): String {
            var decodedMessage = charArrayOf()
            message.forEach { decodedMessage += key[it]!! }
            return decodedMessage.joinToString("")
        }

    }

}









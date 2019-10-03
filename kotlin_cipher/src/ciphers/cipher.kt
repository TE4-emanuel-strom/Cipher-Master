package ciphers

open class Cipher(open val message: String) {

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

        fun translate(cipher: Cipher, specificKey: MutableMap<Char, Char>): String {
            println(specificKey)
            var decodedMessage = charArrayOf()
            cipher.message.forEach { decodedMessage += specificKey[it]!! }
            println(decodedMessage)
            return decodedMessage.joinToString("")
        }

    }

}









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

        fun translate(cipher: Cipher, specificKey: MutableMap<Char, Char>): String {
            var decodedMessage = charArrayOf()
            cipher.message.forEach { decodedMessage += specificKey[it]!! }
            return decodedMessage.joinToString("")
        }

    }

}









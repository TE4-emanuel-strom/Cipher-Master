package ciphers
import helpers.HelperClass.Companion.oneOfEach


class NumberCipher(private val message: String): Cipher() {


    fun decode(): String {
        val processedMessage = processMessage()
        //val specificKey = keyGenerator(neededCharacters)
        for (word in processedMessage) {
        println(word.joinToString(","))
       // println(oneOfEach(word.joinToString(", ")))
        }
        return message
    }

    private fun processMessage(): List<List<String>> {
        val arrayOfWords = message.split(" ")

        return (arrayOfWords.map { it.split("-") })
    }






}
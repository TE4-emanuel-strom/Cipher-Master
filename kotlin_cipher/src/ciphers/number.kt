package ciphers

class NumberCipher(private val message: String): Cipher() {


    fun decode(): String {
        val processedMessage = processMessage()

        return message
    }

    private fun processMessage(): List<String> {

        println(message.split("-"))
        return(message.split(""))


    }


}
package helpers

class HelperClass {
    companion object {
        fun oneOfEach(string: String): CharArray {
            var charList = charArrayOf()
            for (char in string) {
                // println(char)
                if (char !in charList) {
                    charList += char
                }
            }
            return charList
        }
    }
}
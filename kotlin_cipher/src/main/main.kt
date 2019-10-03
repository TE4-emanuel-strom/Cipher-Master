package main


import ciphers.ShiftCipher
import tests.TestClass

fun main() {

    test()
}


fun test() {
    val testsToRun = arrayOf(
        TestClass(
            "Shift Cipher's Key Generator generates a proper key",
            ShiftCipher("a", 1).transformedLetter('a'),
            'b'
        ),
        TestClass(
            "Shift Cipher's Key Generator works with negative shifting",
            ShiftCipher("a", -2).transformedLetter('a'),
            'ä'
        ),
        TestClass("decode Shift cipher", "hej", ShiftCipher("gdi", 1).decode()),
        TestClass("decode Shift cipher with negative shift", "hej", ShiftCipher("ifk", -1).decode()),
        TestClass("shift decoder works with special characters", ShiftCipher("gdi!", 1).decode(), "hej!"),


        TestClass("basic test", expectedValue = true, actualValue = true)
    )

    TestClass.runTests(testsToRun)
}


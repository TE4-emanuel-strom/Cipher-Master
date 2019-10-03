package main


import ciphers.NumberCipher
import ciphers.ShiftCipher
import tests.TestClass

fun main() {

    testShiftCipher()
    testNumberCipher()
}


fun testShiftCipher() {
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
        TestClass("shift encode works", ShiftCipher("hej", 1).encode(), "gdi"),
        TestClass("shift encode works with special characters", ShiftCipher("hej!", 1).encode(), "gdi!")
    )

    TestClass.runTests(testsToRun)
}


fun testNumberCipher() {
    val testsToRun = arrayOf(
        TestClass("number cipher generates proper key", NumberCipher("1-2-3").decode(), "abc")
    )

    TestClass.runTests(testsToRun)

}



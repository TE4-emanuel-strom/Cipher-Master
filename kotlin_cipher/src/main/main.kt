package main

import ciphers.Cipher
import ciphers.ShiftCipher
import tests.TestClass

fun main() {

    println(ShiftCipher("", 1).solve())
    test()
}


fun test() {
    val testsToRun = arrayOf(
        TestClass("Shift Cipher's Key Generator generates a proper key", ShiftCipher("a", 1).transformedLetter('a'), 'b'),
        TestClass("Shift Cipher's Key Generator works with negative shifting", ShiftCipher("a", -2).transformedLetter('a'), 'ä'  ),
        //TestClass("oneOfEach works", Cipher.oneOfEach("hejhej"), charArrayOf('h', 'e', 'j'))
        TestClass("decode Shift cipher", "hej", ShiftCipher("gdi", 1).solve()),
        TestClass("decode Shift cipher with negative shift", "hej", ShiftCipher("ifk", -1).solve()),



        TestClass("basic test", expectedValue = true, actualValue = true)
    )

    TestClass.runTests(testsToRun)
}


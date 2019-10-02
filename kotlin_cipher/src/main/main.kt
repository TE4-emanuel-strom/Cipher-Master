package main

import ciphers.Cipher
import ciphers.ShiftCipher
import tests.TestClass

fun main() {


    test()
}


fun test() {
    val testsToRun = arrayOf<TestClass>(
        TestClass("Shift Cipher's Key Generator generates a proper key", ShiftCipher(1).transformedLetter('a'), 'b'),
        TestClass("Shift Cipher's Key Generator works with negative shifting", ShiftCipher(-2).transformedLetter('a'), 'ä'  ),
        TestClass("Shift key generator whole key", ShiftCipher(1).fullKeyGenerator(), mutableMapOf('a' to 'b', 'b' to 'c', 'c' to 'd', 'd' to 'e', 'e' to 'f', 'f' to 'g', 'g' to 'h', 'h' to 'i', 'i' to 'j', 'j' to 'k', 'k' to 'l', 'l' to 'm', 'm' to 'n', 'n' to 'o', 'o' to 'p', 'p' to 'q', 'q' to 'r', 'r' to 's', 's' to 't', 't' to 'u', 'u' to 'v', 'v' to 'w', 'w' to 'x', 'x' to 'y', 'y' to 'z', 'z' to 'å', 'å' to 'ä', 'ä' to 'ö', 'ö' to 'a')),
        //TestClass("oneOfEach works", Cipher.oneOfEach("hejhej"), charArrayOf('h', 'e', 'j'))
        TestClass("decode Shift cipher", ShiftCipher(1).solve("bcd"), "abc"),


        TestClass("basic test", true, true)
    )

    TestClass.runTests(testsToRun)
}


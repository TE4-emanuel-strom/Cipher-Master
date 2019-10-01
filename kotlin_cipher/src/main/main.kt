package main

import ciphers.ShiftCipher
import tests.TestClass

fun main() {

    test()
}


fun test() {
    val testsToRun = arrayOf<TestClass>(
        TestClass("test, to see if shift inherits char library", 'a', ShiftCipher.a())

    )
    TestClass.runTests(testsToRun)
}


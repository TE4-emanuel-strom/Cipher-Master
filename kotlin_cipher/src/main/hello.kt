package main

import tests.TestClass


fun main(){
    val tests = arrayOf<TestClass>(
        TestClass("Testing hello()", "Hello, World!", hello()),
        TestClass("Testing stoopid test", "you failed!!!", "you failed!!!"),
        TestClass("Other stoopid test", false, 1 == 2)
    )
    TestClass.runTests(tests)
}

fun hello(): String {
    return "Hello, World!"
}


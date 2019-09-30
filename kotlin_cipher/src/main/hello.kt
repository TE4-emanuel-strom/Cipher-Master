package main

import tests.TestClass


fun main(){
    val tests = arrayOf<TestClass>(
        TestClass("Testing hello()", "Hello, World!", hello()),
        TestClass("Testing Failure", "you failed!!!", hello())
    )
    TestClass.runTests(tests)

}

fun hello(): String {
    return "Hello, World!"
}


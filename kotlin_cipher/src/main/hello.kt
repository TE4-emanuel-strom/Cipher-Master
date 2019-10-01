package main
import tests.TestClass




fun main() {

    runTests()
}

fun runTests() {
    val tests = arrayOf<TestClass>(
        TestClass("Testing hello()", "Hello, World!", hello())


    )
    TestClass.runTests(tests)
}

fun hello(): String {
    return "Hello, World!"
}


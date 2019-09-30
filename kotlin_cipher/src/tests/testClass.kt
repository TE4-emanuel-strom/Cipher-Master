package tests

open class TestClass(
    private val note: String,
    private val expectedValue: Any,
    private val actualValue: Any) {

    companion object TestRunner {

        fun runTests(listOfTests: Array<TestClass>): Unit {
            val map = mutableMapOf<String, Boolean>()
            for (Test in listOfTests) map[Test.note] = Test.expectedValue == Test.actualValue
            val numberOfTests = map.size

            println(if (map.containsValue(false)) {
                val failedTests = map.filter { !it.value }
                val numberOfFailedTests = numberOfTests - failedTests.size
                var response = ""
                for (test in failedTests) {
                    response += test.key
                }
                response += " failed. \n$numberOfFailedTests of $numberOfTests tests succeeded"
                response
            } else {
                "All $numberOfTests tests passed!"
            })
        }
    }
}
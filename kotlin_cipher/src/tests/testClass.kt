package tests

open class TestClass(
    private val note: String,
    private val expectedValue: Any,
    private val actualValue: Any) {

    //companion object TestRunner {
     fun runTests(listOfTests: Array<TestClass>): Unit {
        val map = mutableMapOf<String, Boolean>()
        for (Test in listOfTests) {
            map[this.note] = this.expectedValue == this.actualValue
        }

        val numberOfTests = map.size

        println(if (map.containsValue(false)) {
            val failedTests = map.filter { it.value }
            var response: String = ""
            for (test in failedTests) {
                response += test.key
            }
            response += "failed. \n$failedTests.size of $numberOfTests tests succeeded"
            response
        } else {
            "All $numberOfTests tests passed!"
        })
    
    }

}
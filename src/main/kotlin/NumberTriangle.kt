class NumberTriangle {
    fun createNumberTriangle(maxNumbers: Int) {
        for (i in 1..maxNumbers) {
            for (j in 1..i) {
                print(j)
            }
            println()
        }
    }
}
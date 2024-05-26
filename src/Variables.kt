fun main() {
    showMyName(name = "Pelonchas")
    showMyAge(currentAge = 27)
    add(25, 76)
    val mySubtract = subtract(10, 5)
    println(mySubtract)
}

fun subtract(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber - secondNumber
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun showMyAge(currentAge: Int) {
    println("Tengo $currentAge años")
}

fun showMyName(name:String) {
    println("Me llamo $name")
}


fun valoresNumericos() {
    //int
    val age: Int = 30
    var age2: Int = 30

    //Long
    val example: Long = 300000000

    //Float
    val floatExample: Float = 30.31F

    //Double
    val doubleExample: Double = 30.34654321

    println("Sumar")
    println(age + age2)
}

fun alphanumerical() {
    /**
     * Variables Alphanumerical
     */

    //Char
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String
    val stringExample: String = "Simona la mona pelona"
    val stringExample2: String = "Zorrilla"
    val stringExample3: String = "4"
    val stringExample4: String = "23"

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $stringExample4"
    println(stringConcatenada)
}

fun variablesBooleans() {
    /**
     * Variables Boolean's
     */

    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3: Boolean = false
}
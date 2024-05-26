fun main() {
    ifAnidado()
    multiple()
    multipleOR()
}

fun multipleOR(){
    var pet = "Oscar"

    if (pet == "Pepe" || pet == "Oscar"){
        println("Este es un Pepe o un Oscar")
    }

}

fun multiple() {
    var age = 18
    var parentPermission = false
    var imHappy = true

    if (age >= 18 && parentPermission && imHappy) {
        println("Puedo chupar")
    }
}

fun ifAnidado() {
    val animal = "nada"

    if (animal == "dog") {
        println("Vato perro!")
    } else if (animal == "cat") {
        println("Naranjo!")
    } else if (animal == "Bird") {
        println("Verde!")
    } else {
        println("Todo menso")
    }
}




        fun ifBasico() {
            val name = "Pepe"

            if (name == "Pepe") {
                println("simona la mona, es Pepe")
            } else {
                println("Este no es el Pepe")
            }
        }
import java.time.Month

fun main(){
    getSemester(13)
}

fun getSemester(month: Int){
    when(month) {
        in 1..6 -> println("Primer Semestre")
        in 7..12 -> println("Primer Semestre")
        else -> println("Semestre no valido")
    }
}

fun getTrimester(month: Int){
    when(month){
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Primer Trimestre")
        7, 8, 9 -> println("Primer Trimestre")
        10, 11, 12 -> println("Primer Trimestre")
        else -> println("Trimestre no valido")
    }
}
// - 1. Dado el siguiente cuadro:
    
//     1. Lunes
//     2. Martes
//     3. Miercoles
//     4. Jueves
//     5. Viernes
//     6. Sabado
//     7. Domingo
    
//     Haga un algoritmo que solicite el ingreso de un número e indique el dia correspondiente, valide si el código no existe.

fun main(){
    
    var dayNum=5

    when (dayNum) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> println("Día inválido")
    }
}
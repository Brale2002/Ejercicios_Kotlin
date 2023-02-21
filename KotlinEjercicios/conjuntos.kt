fun main(){
    // val conjunto: Set<Int> = setOf(1, 3, 4)
    // val conjuntoMezclado = setOf(2, 4.454, "casa", 'c') 
    // val conjuntoMutable = mutableSetOf(1, 2, 3, 4)

    // conjuntoMutable.add(5)
    // conjuntoMutable += 7

    // conjuntoMutable.remove(2)
    // conjuntoMutable -= 1

    // println(conjunto)
    // println(conjuntoMezclado)
    // println(conjuntoMutable)

    // for (i in conjuntoMezclado) {
    //     println(i)
    // }

    var conjunto1: Set<Int> = setOf(1, 4, 2,  5, 9,)

    var conjunto2: Set<Int> = setOf(1, 7, 11, 44, 8, 9,)

    var conjunto3 = conjunto1.intersect(conjunto2)

    if(conjunto3.min()>5){
        println("El numero encontrado entre el conjunto 1 y 2 es mayor a 5")
        println("El numero es ${conjunto3.min()}")
    }else{
        println("El numero encontrado entre el conjunto 1 y 2 es menor a 5")
        println("El numero es ${conjunto3.min()}")
    }
    

    
}   
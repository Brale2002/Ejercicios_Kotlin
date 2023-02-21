fun main(){
    // val numbersConTipoDeDato: List<Int> = listOf(1, 2, 3, 4, 5, 6)   
    // val numbersSinTipoDeDato = listOf(1, 2, 3, 4, 5, 6)
    // var entrees: MutableList<String> = mutableListOf()

    // println(numbersConTipoDeDato[2])
    // println(numbersSinTipoDeDato.get(2))

    
    // entrees.add("chocolate")
    // entrees.add("Café")

    // var bebidas = listOf("tinto", "cerveza", "agua")
    // entrees.addAll(bebidas)


    // entrees.remove("agua")

    // entrees.set(1, "Vino")

    // println(entrees.get(3))

    // for (i in entrees) {
    //     println(i)
    // }

    val numbersConTipoDeDato: List<Int> = listOf(1, 2, 3, 4, 5, 6)   
    val numbersSinTipoDeDato = listOf(1, 2, 3, 4, 5, 6)
    var entrees: MutableList<String> = mutableListOf()

    println(numbersConTipoDeDato[2])
    println(numbersSinTipoDeDato.get(2))

    
    entrees.add("chocolate")
    entrees.add("Café")

    var bebidas = listOf("tinto", "cerveza", "agua")
    entrees.addAll(bebidas)


    entrees.remove("agua")

    entrees.set(1, "Vino")

    println(entrees.get(3))

    for (i in entrees) {
        println(i)
    }
}
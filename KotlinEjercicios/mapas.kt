fun main(){
    // val paises: Map<Int, String> = mapOf(1 to "Colombia", 2 to "España",  3 to "Islandia")
    
    // val monedas: MutableMap<String, String> = mutableMapOf("peso" to "Colombia",  "euro" to "España")

    // monedas.put("otro", "Ecuador")

    // println(paises.get(1))
    // println(monedas.get("otro"))

    // println(paises.containsKey(1))
    // println(paises.containsValue("Colombia"))

    // for ((key, value) in paises) {
    //     println("El codigo $key pertenece al pais $value")
    // }

    // for ((key, value) in monedas) {
    //     println("El $key pertenece al pais $value")

    val paises: Map<Int, String> = mapOf(1 to "Colombia", 2 to "España",  3 to "Islandia", 4 to "Mexico", 5 to "Ecuador", 6 to "Rusia", 7 to "Japon", 8 to "China", 9 to "USA", 10 to "Francia")

    for ((key, value) in paises) {
    println("El codigo $key pertenece al pais $value")
    }
    
    var preg = "si"
    do{
    println("Ingrese una clave para optener el pais: ")
    var claves = readLine()!!.toInt()

    println(paises.get(claves))

    println("Desea optener otro pais")
    preg = readLine()!!
    }while(preg == "si")
}
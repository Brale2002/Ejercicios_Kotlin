fun main(){
    print("Ingrese la cantidad de nombres a guardar: ")
    var n = readLine()!!.toInt()

    var nombres = arrayOfNulls<String>(n)

    for (i in 0 until nombres.size) {
        print("Ingrese un nombre: ")
        var name = readLine()!!
        nombres[i]=name
    }

    for (i in 0 until nombres.size){
        println(nombres[i])
    }

}
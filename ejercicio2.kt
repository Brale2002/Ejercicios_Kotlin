//De un operario se conoce su sueldo y los años de antigüedad. Se pide crear un programa que lea los datos de entrada e informe: Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20%, mostrar el sueldo a pagar. Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5%.Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.

fun main(){
    var sueldo:Float=0f
    var antiguedad:Int=0
    var aumento:Float=0f
    var mensaje:String=""

    sueldo=readLine()!!.toFloat()
    println("Sueldo= $sueldo")
    antiguedad=readLine()!!.toInt()
    println("Antiguedad= $antiguedad")

    if(sueldo<500 && antiguedad>=10) {
        aumento=sueldo*0.2f
        sueldo+=aumento
        mensaje="Usted tiene un aumento del 20%, su sueldo nuevo es: $sueldo"
    } else if(sueldo<500 && antiguedad<10) {
        aumento=sueldo*0.05f
        sueldo+=aumento
        mensaje="Usted tiene un aumento del 5%, su sueldo nuevo es: $sueldo"
    } else {
        mensaje="Usted no tiene ningun aumento, su sueldo es: $sueldo"
    }
    println(mensaje)
}

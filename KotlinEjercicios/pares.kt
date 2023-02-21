fun main(){
    // val pair = Pair("Hola",1)
    // var pair2 = "Amigo" to 2

    // println(pair.first) //Hola
    // println(pair.second) //1

    // println(pair2.first) //Amigo
    // println(pair2.second) //2

    // var (user, password) = Pair("usuario", "password") 
    // println(user) // usuario
    // println(password) // contrasena

    // //Recuerden que "user" y "password" pertenecen a un par, pero ya están independizados

    // //Lo que hacemos es asignarle un nombre a "user" y un na contraseña a "password"
    // user = "Camilo"
    // password = "123"

    // println("El nombre de usuario es: $user") // Camilo
    // println("Y su contraseña es: $password") // 123

    var (especie, tipo) = Pair("", "")
    println("Ingrese cantidad de animales a ingresar")
    var n = readLine()!!.toInt()
    var especies = arrayOfNulls<String>(n)
    var tipos = arrayOfNulls<String>(n)

    for (i in 0  until especies.size) {
            println("Ingrese un tipo de animal: ")
            tipo = readLine()!!
            print("Ingrese la especie del animal: ")
            especie = readLine()!!
            
            tipos[i] = tipo 
            especies[i] = especie
        }

    for (i in 0  until especies.size) {
                 println("El animal es de tipo ${tipos[i]} y es un/una ${especies[i]}")
            }
    
   
    

}
package Ejercicios

open class Mascota5(val nombre: String, val edad: Int) {
    open fun mostrarInfo() {
        println("Nombre: $nombre, Edad: $edad")
    }
}

class Gato(nombre: String, edad: Int, val colorPelaje: String) : Mascota5(nombre, edad) { //ahi hereda las clase

    fun correr() {
        println("Miau") //fun ---> funcion (ejem: correr, saltar nadar, etc etc)
    }

    override fun mostrarInfo() {
        //override significa "sobrescribir" o "reemplazar". Se usa cuando:
        //La clase padre tiene un método (ej: mostrarInfo())
        //La clase hija quiere cambiar cómo funciona ese método
        //Pero manteniendo el mismo nombre
        super.mostrarInfo()
        //Estás diciendo: "Primero ejecuta el método mostrarInfo() de mi papá (que muestra nombre y edad), y luego yo agrego mi información extra (color de pelaje)".
        //
        //Sin el super, solo mostrarías el color del pelaje y perderías la información del nombre y edad.
        println("Color de pelaje: $colorPelaje")
    }
}

class Pez(nombre: String, edad: Int, val sangreFria: Boolean) : Mascota5(nombre, edad) {

    fun nadar() {
        println("Glue Glue Glue") //fun Estos son métodos nuevos que solo existen en las clases hijas:
    }

    override fun mostrarInfo() { //override solo se usa cuando reemplazas un método existente
        super.mostrarInfo()
        println("Sangre fría: $sangreFria")
    }
}

fun main() {
    // Probando la clase base
    //val se usa para declarar variables inmutables (de solo lectura), cuyo valor no puede cambiar después de ser inicializado,
    val miMascota = Mascota5("Alex", 5)
    miMascota.mostrarInfo()
    println()

    // Probando la clase Gato
    val miGato = Gato("Whiskers", 3, "Negro")
    miGato.mostrarInfo()
    miGato.correr()
    println()

    // Probando la clase Pez
    val miPez = Pez("Nemo", 1, true)
    miPez.mostrarInfo()
    miPez.nadar()
}
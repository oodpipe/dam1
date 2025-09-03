package Ejercicios

fun main(){

    //Cree una lista con todos los elementos pares.
    val numeros = mutableListOf(30, 4, 11, 21, 7, 35)

    val pares = numeros.filter { it%2 == 0 }
    println("los pares son: $pares")
}
package Clase4

fun main() {

    var lista = mutableListOf(1,2,5,8,10,33,67,100) // [1,2,5] #3 para filtrar
    lista.add(5)
    lista.add(5)
    lista.add(5)
    println("lista $lista")

    var filtrado = lista.filter { it % 2 == 0 }
    println("filtrado: $filtrado")

    var doble = lista.map { it +1 }
    println("doble: $doble")



}
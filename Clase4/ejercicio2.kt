package Clase4

fun main() {

    var lista = mutableListOf(1,2,5,8,10,33,67,100) // [1,2,5] #2 para filtrar
    lista.add(5)
    lista.add(5)
    lista.add(5)
    println("lista $lista")

    var filtrado = lista.filter { it % 2 == 0 }
    println("filtrado: $filtrado")

}
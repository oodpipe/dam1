package Clase4

fun main() {

    var lista = mutableListOf(1,2,3,4,5) // [1,2,5] #3 para filtrar
    lista.add(5)
    lista.add(5)
    lista.add(5)
    println("lista $lista")

    var filtrado = lista.filter { it % 2 == 0 }
    println("filtrado: $filtrado")

    var doble = lista.map { it +1 }
    println("doble: $doble")

    var sumatoria = lista.sum()
    println("sumatoria: $sumatoria")

    var buscarElPar = lista.find { it % 2 != 0 }
    println("busca el par : $buscarElPar")

    var primerElemento = lista.first()
    println("primerElemento: $primerElemento")





}
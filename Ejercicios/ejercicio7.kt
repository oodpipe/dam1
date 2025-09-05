package Ejercicios

fun main(){
    println(verificador(5,6))
    println(verificador(7,6))
    println(verificador(5,100))
    println(verificador(8,6))
    println(verificador(12,6))
}

fun verificador(elemento1: Int, elemento2: Int): String{
    //verificamos si elemento1 es mayor a elemento2
    if (elemento1>elemento2){
        return "el elemento1 es mayor, que el elemento2"
    }else{
        return "el elemento2 es menor, que el elemento1"
    }
}
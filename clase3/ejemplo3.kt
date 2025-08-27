package clase3

fun main(){
    var i = 1
    var ciclos =1
    do {

        ciclos++

        val randomNumber = (0..10).random()
        i = i + randomNumber
        println("ciclo $ciclos : $i")

    }   while (i <= 300)
}
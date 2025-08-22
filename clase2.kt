fun main(){

    println("inicio de programa")

    val a = 5
    val b = 3

    sumar(a,b)
    sumar(9,6)
    sumar(4,7)
    sumar(93,1)

    restar(a,b)
    restar(10,5)
    restar(50,30)
    restar(100,50)

    mul(a,b)
    mul(5,2)
    mul(2,3)
    mul(8,8)

    div(a,b)
    div(10,2)
    div(100,2)
    div(4,0)
}

fun sumar(a:Int, b:Int){
    print("programa de sumas extremas - voy a sumar $a con $b = ")
    println(a+b)
}

fun restar(a: Int, b: Int){
    print("programa de restas estremas - voy a restar $a con $b = ")
    println(a-b)

}

fun mul(a: Int, b: Int){
    print("programa de multiplicaciones extremas - voy a multiplicar $a con $b = ")
    println(a*b)
}

fun div(a: Int, b: Int){
    println("programa de division - voy a dividir $a con $b = ")

    if (b==0)
        print("error")
    else {
        println(a/b)
    }
}
fun main () {

    val raykuaza = Pokemon("raykuaza", 40, 230)
    val mew = Pokemon("Mew", 300, 300)
    raykuaza.informacion()
    mew.informacion()

    raykuaza.sePreparaParaLaBatalla()
    mew.recibedano(raykuaza.atk)

    mew.sePreparaParaLaBatalla()
    raykuaza.recibedano(mew.atk)

}

class Pokemon(
    val nombre: String,
    val atk: Int,
    var hp: Int
){
    fun sePreparaParaLaBatalla(){
        println("El $nombre se prepara para la batalla")

    }

    fun informacion(){
        println("$nombre - ATK:$atk HP:$hp")
    }

    fun recibedano(dano: Int){
        println("$nombre recibe $dano puntos de daño")
        hp -= dano
        println("ahora le quedan $hp puntos")
        if(hp<0){
            println("$nombre SE HA DEBILITADO!!!")
        }
    }
}
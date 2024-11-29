package Atividades

interface Animais {
    fun ataque() {
        println("caçador")
    }
    fun rosnar ()
}

open class selvagem (): Animais{
    fun predar(){}
    open override rosnar(){}
    open override fun ataque() {
        super.ataque()
    }

}

class bicho() : selvagem() {
    fun comer(){}
}

fun main(){
    var gato: bicho = bicho()
    var leopardo: selvagem = selvagem()

    gato.predar()
    gato.comer()
}
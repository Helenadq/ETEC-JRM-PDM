package Atividades

fun main(){
    var dell: Computador = Computador("Dell");
    var acer: eletronico = eletronico("Acer");

    dell.processar()
    dell.armazenarDados()
    dell.ligar()
    dell.desligar()
}

open class Computador(marca: String) : eletronico(marca){
    fun processar(){};
    fun armazenarDados(){};
}

open class eletronico(val marca: String) {
    open fun ligar(){}

    fun desligar(){}

}
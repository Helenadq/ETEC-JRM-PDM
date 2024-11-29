package Atividades

fun main(){
    fun save(){
        print("Arquivo salvos")
    }

    //overload - sobrecarga
    fun save(parametro: Int){
        println("O arquivo n $parametro, foi salvo")
    }

    fun save(parametro: Double){}
    fun save(parametro: Boolean){}
    fun save(n: String){}
    fun save(p: String, p2: String) {}
    fun save(p: String, p2: Int) {}

    save()
    save(9)

    var samsung: celular = celular("Samsung");
    samsung.ligar()
}

class celular(marca: String) : Computador(marca) {
    override fun ligar(){ println("Estou ligado!") }
}
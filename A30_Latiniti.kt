package Atividades

fun main(){

}

class Receita() {
    var instrucao: String? = null
    lateinit var novasinstrucoes: String

    fun geralReceita(){
        instrucao = "lave as mãos"
    }

    fun imprimirReceita(){
        if(this::novasinstrucoes.isInitialized) {
            println(instrucao)
        } else {
                println()
            }
        println(instrucao)
    }
}
// aula 25: Classes

/*
        Paradigma - Linear (execução sem devios)

        Estruturado - Laços de repetição, controle, diferentes caminhos, criação de sistemas

        Orientação a objetos - encapsulamente, abstração, herança, polimorfismo (quatro pilares)

 */

class Pessoa

class livro (var titulo: String, var autor: String, var ano: Int, var paginas: Int)
{
    var marcador = 0

    fun abrirpagina(p: String)
    {
        println("\n livro $titulo aberto na pagina \n")
    }

    fun marcadorpagina(p: Int)
    {
        this.marcador = p
        println("Marcada a pagina $marcador")
    }
}

fun main(){
   //meu livro = objeto / livro = molde
    var meuLivro: livro = livro("Desconstruindo a Ansiedade", "Judson Brewer", 2021, 60)
    var pessoa: Pessoa = Pessoa()

    var gente: Pessoa = Pessoa()
    var carinha: Pessoa = Pessoa()

    println(meuLivro.titulo)
    println(meuLivro.autor)
    println(meuLivro.ano)
    println(meuLivro.paginas)

    meuLivro.abrirpagina(30)

    var proximoLIvro: livro = livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, 200)

    proximoLIvro.marcadorpagina(1)
    proximoLIvro.abrirpagina(proximoLIvro.marcador)
}

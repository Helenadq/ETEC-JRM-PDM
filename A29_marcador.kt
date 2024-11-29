package Atividades

// import b_poo.Livro

fun main() {
    val meuLivro = Livro("Blade Runnner", "Philip K Dick", 1980, 300)
    meuLivro.marcarPagina(27);
    meuLivro.abrirPagina(meuLivro.marcador);

    with(meuLivro){
        marcarPagina(72);
        abrirPagina(marcador);
        println()
    }
}
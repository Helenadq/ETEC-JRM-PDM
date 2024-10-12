fun main(){

    print("olá blocolandia ( :O )")
    println(" ")

    //printa a linha e depois vai pra debaixo
    println(" :O ")
    println(" :D ")

    var nome = "Carlos \nMais \nGaga"
    println(nome)

    nome = "Helena DQ"
    println(nome)

    print("Olá, " + nome + "\nvcs são lindos \n")

    var sobrenome = "2(DQ)"
    println("O seu nome é, $nome $sobrenome")

    //valor estatico = val
    val variavelEstatica = "Bom dia "
    //variavelEstatica = "Não posso retribuir valor a ele"

    println(variavelEstatica)

    //dá erro pois mistura as 2 variaveis em 1 só
    val nomeMisturado = variavelEstatica + sobrenome
    println(nomeMisturado)


}
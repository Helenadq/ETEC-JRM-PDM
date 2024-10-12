//Aula 13: Controle de fluxo (for)

fun main()
{
    for(i in 1..10) {
        println("$i ")
    }
    println()

    var str = "Kotlin é uma linguagem de programação"
    for (caractere in str) {
        print("$caractere ")
    }
    println()

    //step 2 é pegar de 2 em 2
    for(i in 0 .. 20 step 2) print("$i ")
    println()
    //ordem decrescente, do 20 ao 0
    for (valor in 20 downTo 0) print("$i ")
    //mesma coisa, do 15 ao 3
    for (valor in 15 downTo 3) print("$i ")
}
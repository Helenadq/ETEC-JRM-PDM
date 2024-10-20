/*
A - Escreva um código, usando "while( )" ou "do while( )", capaz de receber um texto e imprimi-lo invertido
Exemplo de entrada: Meu nome é Asdrúbal
Exemplo de saída esperada: labúrdsA é emon ueM

B -  Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres "x" e "o" e retorna
true ou false. Caso não exista nem "x" nem "o", retornar false. Use "while( )" ou "do while( )"

*/

fun main(){
    //Exercicios novos
        exercicioA();
                println();
        println("Escreva abaixo uma frase ... vamos identificar se tem X ou O: ");
        exercicioB(lerCaracterXO = readln());

    //Aula reposição
        exercicioUmBaloes();
        //litrosUsandoDO()
        fizzBuzz();
}

fun exercicioA(){
    val respostaNome: String;
    var contador = 0

    println("Digite seu nome abaixo: ")
    respostaNome = readln()

    contador = respostaNome.length - 1
    while(contador >= 0) {
        print("${respostaNome[contador]}")
        contador--
    }
}

fun exercicioB(lerCaracterXO : String): Boolean {
    var caracterX = 0
    var caracterO = 0
    var frase = 0

    while (frase < lerCaracterXO.length) {
        when (lerCaracterXO[frase].lowercaseChar()) {
            'x' -> caracterX++
            'o' -> caracterO++
        }
        frase++
    }

    return if (caracterX == 1 && caracterO == 0) {
        print("Sua frase tinha apenas um X")
        true
    }
    else if (caracterX == 0 && caracterO == 1){
        print("Sua frase tinha apenas um O")
        true
    }
    else if (caracterX == 1 && caracterO == 1){
        print("Sua frase tinha X e O")
        true
    }
    else {
        println("Sua frase não tem nenhum dos 2")
        false
    }

}

/*
        Aula 15: Exercicios de reforço
            Controle de FLuxo: While()


// 1. Considere uma caixa d'agua de 2 mil litros. Rômulo gostaria de encher a caixa d'agua com balões de 7 litros.
Quantos balões cabem na caixa d'agua sem que o volume seja excedido? Crie uma totina usando while() que retorne
a resposta.

*/

fun exercicioUmBaloes() {
    var caixaDagua: Int = 2000;
    var contadorBaloes: Int = 0;

    while(caixaDagua >= 7)
    {
        caixaDagua -= 7;
        contadorBaloes ++;
    }
    println("A quantidade de balões necessários são: ${contadorBaloes - 1}")

}

    /*
fun litrosUsandoDO() {
    var caixa = 2000
    var numBaloes = 0

    do {
        caixa -= 7
        numBaloes++
    } while (caixa >= 7)
    println("cabem ${numBaloes} na caixa")

}
     */

/*
// 2. FizzBUzz
Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo. Use While() ou do while()
    a. Quando um número for divisível por 3, imprimir Buzz
    b. Quando um número for divisível por 5, imprimir Fizz
    c. Quando um número for divisível por 3 e 5 simultaneamente, imprimir FizzBuzz
*/

fun fizzBuzz() {
    var y = 0
    while (y < 50) {
        y++
        if (y % 3 == 0 && y % 5 != 0) {
            println("$y Buzz")
            continue
        }
        else if (y % 5 == 0 && y % 3 != 0) {
            println("$y Fizz")
            continue
        }
        else if (y % 3 == 0 && y % 5 == 0){
            println("$y FizzBuzz")
            continue
        }
        else { }
    }
}

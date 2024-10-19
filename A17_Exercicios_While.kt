/*
    Aula 15: Exercicios de reforço
    Controle de FLuxo: While()


// 1. Considere uma caixa d'agua de 2 mil litros. Rômulo gostaria de encher a caixa d'agua com balões de 7 litros.
Quantos balões cabem na caixa d'agua sem que o volume seja excedido? Crie uma totina usando while() que retorne
a resposta.

// 1.

*/

fun main(){
    //exercicioUmBaloes();
    //litrosUsandoDO()
    fizzBuzz();
}
/*
fun exercicioUmBaloes(){
    var caixaDagua: Int = 2000;
    var contadorBaloes: Int = 0;

    while(caixaDagua >= 7)
    {
        caixaDagua -= 7;
        contadorBaloes ++;
    }
    println("A quantidade de balões necessários são: ${contadorBaloes - 1}")
 */

fun litrosUsandoDO(){
    var caixa = 2000
    var numBaloes = 0

    do{
        caixa -= 7
        numBaloes++
    } while (caixa >= 7)
            println("cabem ${numBaloes} na caixa")

}

/*
// 2. FizzBUzz
Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo. Use While() ou do while()
    a. Quando um número for divisível por 3, imprimir Buzz
    b. Quando um número for divisível por 5, imprimir Fizz
    c. Quando um número for divisível por 3 e 5 simultaneamente, imprimir FizzBuzz
 */
fun fizzBuzz() {

    var y = 0
    while (y <= 50) {
        y++
        if (y % 3 == 0) {
            println("Buzz")
            continue
        }
        else if (y % 5 == 0) {
            if (y % 3 == 0) {
                println("BuzzFizz")
                continue
            }
            else{
                println("Fizz")
                continue
            }
        }
        else {
            println("Se fudeu")
            continue
        }

        print("$y ")
    }
}

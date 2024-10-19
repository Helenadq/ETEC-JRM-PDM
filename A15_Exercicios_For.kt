/*
Controle de fluxo: for()
1: Imprimindo números em ordem crescente
Sua primeira tarefa é imprimir os números de 1 a 50 na mesma linha em ordem crescente. A saída esperada deve ser
semelhante a esta: 1 2 3 4 5 6 7 8 9 10 ....... 49 50. Você usará o loop for() para esta tarefa.

2: Imprimindo números em ordem decrescente
Para a segunda tarefa, você imprimirá os números de 1 a 50 na mesma linha em ordem decrescente usando o loop for().
A saída esperada deve ser: 50 49 48 47 46 45 ......... 3 2 1.

3: Imprimindo números excluindo múltiplos de 5
Usando a resolução do exercício 1, sua próxima tarefa é imprimir os números de 1 a 50 na mesma linha em ordem crescente,
 excluindo os múltiplos de 5. Você conseguirá isso usando o loop for().

4: Adicionando números em um intervalo
Para a quarta tarefa, você somará todos os números no intervalo de 1 a 500 usando o loop for(). No final,
você imprimirá o valor da soma.

5: Imprimindo uma escada de caracteres de libra
Sua tarefa final é escrever um programa capaz de pegar um inteiro n e imprimir uma escada de tamanho n usando o
caractere de libra (#). Você usará o loop for() para esta tarefa. Por exemplo, se a entrada for 5, a saída deverá ser:
            #
            ##
            ###
            ####
            #####
 */

fun main() {
    exercicioUm();
    println(" ");
    exercicioDois();
    println(" ");
    exercicioTres();
    println(" ");
    exercicioQuatro();
    println(" ");
    exercicioCinco();
    println(" ");
}

fun exercicioUm(){
    var i = 0;

    for(i in 1..50) {
        print("$i ");
    }
}

fun exercicioDois(){
    for (valor in 50 downTo  1) print("$valor ");
}

fun exercicioTres(){
    var i = 0;

    for (i in 1..50) {
        if (i % 5 != 0) {
            print("$i ");
        }
    }
}

fun exercicioQuatro(){
    var i = 0;
    var somaTodos = 0;

    for (i in 1..500) {
        somaTodos += i;
    }
    print("O resultado da soma de 1 até 500 é: $somaTodos ");
    return;
}

fun exercicioCinco(){
    print("Escreva qualquer número inteiro: ")
    var i = 0;
    val n = readln().toInt();

    for (i in 1..n) {
        println("#".repeat(i));
    }
}

/*
fun exercicioCincoModoProf(n: Int){
   for(i in 1..n){
      for(i in 1..i){
       print("#")
       }
          println()
    }
}
*/

fun main(){
    var n = 7;

    if(n > 5) println("$n é maior que 5");
    if(n < 9) println("$n é menos que 9");
    if(n >= 6) println("$n é maior ou igual a 6");
    if(n <= 7) println("$n é menor ou igual a 7");

    //operadores de igualdade: ==, !=, !(negação)
    if(n == 7) println("$n é igual a 7");
    if(n != 9) println("$n é diferente de 9");
    if(n == 9) println("$n não é igual a 9");

    //operadores lógicos: conjunção &&(e, and), disjunção ||(ou, or)
    if(n > 3 && n<= 10) println("$n é maior que 3 e menor que 10")

    //operador de intervalo (range): in
    if(n >= 2 && n <= 15) println("$n está entre o intervalo de 2 a 15")
}
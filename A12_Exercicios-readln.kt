/*
    Aula 12: Exercícios de reforço
    - Controle de fluxo: "if()"
    - Leitura de linha: "readln()"
    - Conversão de inteiro: "toInt()"
 */

// 1. Escreva uma rotina capaz de ler dois numeros inteiros maiores que zero,
// que representa os lados de uma figura geométrica quadrada ou retangular.
// Informar se é um quadrado ou um retangulo.

// 2. Escreva uma função capaz de ler três numeros inteiros maiores que zero
// que representam os lados de um triangulo. Informar se é um triangulo
// equilatero, (todos os lados iguais) Isoceles, (apenas dois lados iguais) ou
// escaleno (os três lados são diferentes).

fun main() {

    quadrado();
    triangulo();
}
fun quadrado(){

    val numeroLado1: Int;
    val numeroLado2: Int;

    print("Digite um numero inteiro: ")
    numeroLado1 = readln().toInt();

    print("Digite outro numero inteiro: ")
    numeroLado2 = readln().toInt();

    if(numeroLado1 == numeroLado2)
    {
        println("É um quadrado!")
    } else {
        println("É um triangulo!")
    }
}

fun triangulo(){
    var lado1: Int;
    var lado2: Int;
    var lado3: Int;

    /*
            PRIMEIRO JEITO DE FAZER

    println("Digite o primeiro lado:")
    lado1 = readln().toInt();

    println("Digite o segundo lado:")
    lado2 = readln().toInt();

    println("Digite o terceiro lado: ")
    lado3 = readln().toInt();

    var tipo: String;
    if(lado1 == lado3) {
        tipo = "equilátero"
    } else {
        tipo = "isósceles sonso"
    } else if (lado1 == lado3) {
        tipo = "isósceles"
    } else if (lado2 == lado3){
        tipo = "isósceles"
    } else {
        tipo = "escaleno"
    }
    println("Seu triângulo é $tipo")

    */

    /*
               SEGUNDO JEITO DE FAZER
    if (lado1 == lado2 && lado1 ==lado3) {
        tipo = "equilatero"
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        tipo = "isósceles"
    } else {
        tipo = "escaleno"
    }
    println("Seu triângulo é $tipo");
    */

    /*
            TERCEIRO JEITO DE FAZER
    tipo = "escaleno"
    if (lado1 == lado2 && lado1 == lado3) {
        tipo = "equilátero"
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        tipo = "isósceles"
    }
    println("Seu triângulo é $tipo");
    */

}
/*
    Aula 04: EXERCICIO de reforço

    Variaveis, tipo de dados e operadores aritméticos

    A. Crie um novo arquivo chamado A04_Exercicio.kt com uma função main.
    B. Declare uma variavel mutável capaz de armazenar seu nome completo.
    C. Declare uma variável de texto sem valor algum.
    D. Declare u a variável imutável com o menor tipo de dado possível capaz de armazenar o número que você calça
    E. Declare uma variável capaz de armazenar o PIB do Brasil em 2024 (cerca de R$ 10.900.000.000.000,00)
    F. Declare uma variável capaz de armarezar a população do Brasil (cerca de 212.600.000)
    G. Imprima no terminal o valor do PIB percapita (PIB/população)
    H. Rode seu programa de forma que não possua erros de compilação ou execução
 */
//ATIVIDADE A
fun main() {

//ATIVIDADE B
    var nomeCompleto: String = "Helena Delmédico de Queiroz";

//ATIVIDADE C
    var variavelnull = null;

//ATIVIDADE D
    val numeroCalcado: Byte = 36;

//ATIVIDADE E
    var pibBrasil: Double = 10_900_000_000_000.00;

//ATIVIDADE F
    var populacaoBrasil: Int = 212_600_000;

//ATIVIDADE G
    var resultado: Double;
    resultado = pibBrasil / populacaoBrasil;
    println("Resultado PIB per capita: ${resultado}");

//ATIVIDADE H
    //Deu tudo certo, no println apareceu "Resultado PIB per capita: 51269.990592662274"

}

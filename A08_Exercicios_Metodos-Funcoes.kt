// 1. Função que converte anos em meses, dias, horas, minutos e segundos
fun converterAnos(anos: Int) {
    val meses = anos * 12
    val dias = anos * 365 // Considerando um ano como 365 dias
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60

    println("$anos anos equivalem a:")
    println("$meses meses")
    println("$dias dias")
    println("$horas horas")
    println("$minutos minutos")
    println("$segundos segundos")
}

// 2. Função que retorna a quantidade de caracteres de uma string
fun contarCaracteres(texto: String): Int {
    return texto.length
}

// 3. Função que calcula o cubo de um número inteiro
fun calcularCubo(n: Int): Int {
    return n * n * n
}

// 4. Função que converte milhas em quilômetros (1 milha = 1.6 km)
fun converterMilhasParaKm(milhas: Double): Double {
    return milhas * 1.6
}

// 5. Função que troca todas as letras "a" ou "A" por "x" e coloca tudo em maiúsculas
fun trocarLetraAporX(texto: String): String {
    return texto.replace('a', 'x', ignoreCase = true).uppercase()
}

fun main() {
    // Testando o exercício 1
    converterAnos(2)

    // Testando o exercício 2
    val texto = "Programação"
    println("A quantidade de caracteres em \"$texto\" é: ${contarCaracteres(texto)}")

    // Testando o exercício 3
    val numero = 3
    println("O cubo de $numero é: ${calcularCubo(numero)}")

    // Testando o exercício 4
    val milhas = 5.0
    println("$milhas milhas equivalem a ${converterMilhasParaKm(milhas)} km")

    // Testando o exercício 5
    val frase = "Programação em Kotlin"
    println("Resultado da troca de letras: ${trocarLetraAporX(frase)}")
}

// 6. Transformação das funções dos exercícios 2, 3 e 4 em funções de uma única linha
fun contarCaracteresUnicaLinha(texto: String) = texto.length

fun calcularCuboUnicaLinha(n: Int) = n * n * n

fun converterMilhasParaKmUnicaLinha(milhas: Double) = milhas * 1.6
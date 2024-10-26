// aula 23 : Sobre os parametros das funções

fun main (){
    parOUimpar(5);
    parOOUimpar(6,8);
    parOUimparComVarag(6,8,7,4,2);
}

fun parOUimpar(numero: Int){
    var par = numero % 2 == 0
    println("o numero $numero é:")
    if (par) {println("par!")}
    else {println("impar!")}
}

//esse = 0 torna a variavel opcional, se n for usada, n vai dar erro por estar vazia
fun parOOUimpar(numero1 : Int, numero2 :  Int, numero3 : Int = 0){
    var parr = numero1 % 2 == 0
    println("o numero $numero1 é:")
    if (parr) {println("par!")}
    else {println("impar!")}

    var par = numero2 % 2 == 0
    println("o numero $numero2 é:")
    if (par) {println("par!")}
    else {println("impar!")}

}

//varag significa que posso receber infinitos parametros
fun parOUimparComVarag(vararg numeros : Int) {
    for (numero in numeros) {
        var pare = numeros % 2 == 0
        println("o numero $numeros é:");
        if (pare) {
            println("par!")
        } else {
            println("impar!")
        }
    }
}
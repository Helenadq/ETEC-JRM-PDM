//aula 23 : parametros generics <T>

 fun main(){
     media("Helena",true, 5,8,9);
     media(10, 8, 2000);

 }

fun <T> media(vararg notas: T){
    var soma = 0.0;
    var contador = 0
    for (n in notas){
        if (n is Double){
            soma += n
            contador += 1
        }
    }
    var media = soma / contador;
    println(media);

    fun <T, F> media(   vararg outro: F, notas: T, nome: String) {
        var soma = 0.0;
        for (n in notas) {
            if (n is Double) {
                soma += n
                contador += 1
            }
        }

        var tipo = ""
        if (outro == true) {
            tipo = "final"
        } else if (outro == false){
            tipo="parcial"
        }
    }
    var media = soma/contador
    println(format("A média $tipo do aluno $nome é %", media))
}
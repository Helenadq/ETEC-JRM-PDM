//Aula 16: Controle de Fluxo: do while()

fun main(){
    var contador = 0
/*
    do {
        print("${++contador}")
    } while (contador <= 10)

 */

    print("Digite s para continuar: ")
    var resp = readln();
/*
    while(resp == "s"){
        print("Vamos lá!")
        break;
    }
 */

    do {
        print("Digite s para continuar: ")
        resp = readln();
        println("Vamos lá")
    } while(resp == "s")

    var c = 1
    do {
        print("${c++}, ")
    } while(c == 0)

    var i = 1;
    while(i == 0){
        print("Ele nunca vai entrar aqui!")
    }
    println()

    do{
        print("Qual o seu nome?")
        val nome = readln();
            if (nome != ""){
                println("Olá, $nome!")
            }
    } while (nome == "")
}

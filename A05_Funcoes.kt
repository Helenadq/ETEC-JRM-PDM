fun main(){
    println("println é uma função utilitaria e main também é uma função");

    bomdia();
    bomdia2();
    //hello();
    //hello2();
    //divisao();
    //mensagem();

    //chama o metodo e passa o parametro
    hello("Helena");

    //sobre-carga
    //sobre-escrita
    //herança

    var resultado = soma(7,9);
    println(resultado);
    //o segundo e opcional, caso nao defina ele usara o default nesse caso
    println(subtracao(10.0,9));
    println(divisao(8,10.0));

    mensagem("Parisoto");
    mensagem("Edson", "Parisoto");
    mensagem("Edson", 61);
    mensagem(61, "Edson");

    hello("Helena");
    hello2("Helena");
}

fun bomdia(){
    println("BOM DIAA!");
}
fun bomdia2() = println("BOM DIA2!");

fun hello(nome: String){
    println("Ola $nome")
}

fun hello2(nome: String) = println("Ola $nome");

fun soma(a: Int, b: Int):Int {
    var resultado = a + b;
    return resultado;
}

fun subtracao(a: Double, b: Int = 3) = a - b;

fun divisao(a: Int, b: Double) = (a / b);

fun mensagem(sobrenome: String) = println("Seu sobrenome é $sobrenome");
fun mensagem(nome: String, sobrenome: String) = println("Bem-vindo $nome, $sobrenome");
fun mensagem(nome: String, idade: Int) = println("Como vai $nome, você tem $idade anos?")
fun mensagem(idade: Int, nome: String) = println("Voce tem $idade, $nome?")
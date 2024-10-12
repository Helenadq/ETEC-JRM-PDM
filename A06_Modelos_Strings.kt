fun main(){
    val str = "Programação Kotlin";
    var msg: String;

    msg = "Tamanho da string: ${str.length} caracteres";
    //propriedade lenght (comprimento, tamanho)

    msg = "Posição (inicio) 0 da string: ${str[9]}";
    //propriedade de encontrar a letra de tal posição

    //metodos usamos ponto
    //para verificar se existe o prefixo "pro" na string
    msg = str.startsWith("Pro").toString();
    //metodo booleano de string: começa com?

    msg = str.endsWith("abc").toString();
    //metodo booleano de string: termina com?

    msg = str.substring(2,9);
    //metodo que retorna um trecho da string
    //o trecho 2 até o trecho 9

    msg = str.replace("Kotlin", "com Kotlin.");
    //metodo para trocar um texto pelo outro

    msg = str.lowercase();
    //tudo para minusculas

    msg = str.uppercase();
    //tudo para maiuscula

    val str2 = "                    usada no android studio!               ";
    msg = str2.trim();
    //metodo para tirar os espações da string
    msg  = str + str2.trim() + str;


    println(msg);
}
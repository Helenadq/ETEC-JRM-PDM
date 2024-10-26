// aula 21: metodo let

fun main(){
    val str: String? = "hello"

    if (str != null){
        str.uppercase();
        str.length
        println("A variavel 'str' contem $str")
    }

    str ?: println("A variavel 'str' é $str")

    //Retorna qualquer valor a partir de um objeto do qual o escopo se originou e refere-se a esse objeto como it.
    //escopo da variavel?
    str?.let {
        //aqui dentro, a variavel 'str' passa a ser 'it'
        println("A variavel 'it' contrem $str")
        println(it.uppercase())
        println(it.length)
        println(str.uppercase())
    }
}

//Aula 17: Controle de Fluxo de repetição: Continue e break

fun main(){
    var i = 0;
    while(true){
        i++
        println("$i, ")
            if(i > 10) break
    }

    var volta = 1
    do{
        println("$volta")
        volta++
        if(volta == 16) break
    } while (volta < 9999999)
    println()

    for(valor in 1..20){
        println("$valor")
            if(valor == 13) break
    }
    println()

    var y = 0
    while(y <= 20){
        y++
        if (y % 2 != 0){
            continue
        }
        print("$y ")
    }
}
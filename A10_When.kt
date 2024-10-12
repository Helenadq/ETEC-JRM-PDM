// aula 11: Controle de fluxo Condicional: "When()"

fun main(){
    val n = 0

    val bonus = bonusWhen("Estagiario");
    println("Bonus de R$ $bonus");
    println("Bonus para Engenheira de Software: ${bonusWhen("Engenheiro de Software")}");

    println("Bonus para Gerente: ${bonusIf("Gerente")}")

    /*
    if (n in 1, 10)
    {
        println("$n está entre 1 a 10");
    }
    when (n)
    {
        // in 1,10 -> println("$n está entre 1 a 10");
    }

     */

    val x = true
    when (x)
    {
        true -> println("É verdade este bilhete!")
        false -> println("Este bilhete é falso!")
    }
}

fun bonusWhen(cargo: String): Double {
    var bonus: Double;

    when(cargo)
    {
        "Gerente" -> bonus = 2021.15
        "Coordenador" -> bonus = 1057.29
        "Engenheiro de software" -> bonus = 1201.12
        "Estagiario" -> bonus = 500.04
        else -> bonus = 0.00
    }
    return bonus
}

fun bonusIf(cargo: String): Double
{
    var bonus: Double

    if(cargo == "Gerente")
    {
        bonus = 2021.15
    } else if (cargo == "Coordenador")
    {
        bonus = 1057.29
    } else if (cargo == "Engenheiro de Software")
    {
        bonus = 1201.12
    } else if (cargo == "Estagiario")
    {
        bonus = 500.04
    } else
    {
        bonus = 0.00
    }
}
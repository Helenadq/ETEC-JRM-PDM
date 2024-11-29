package Atividades

enum class AnimalEnum{
    Cachorro,
    Gato,
    Passaro,
    Tartaruga;
}

enum class Prioridades(){
    Baixa, Media, Alta, Maxima
}

enum class Nivel(val valor: Int){
    basico(1),
    intermediario(5),
    avancado(10);
}

fun main() {
    val paciente: Veterinario = Veterinario("Elefante")
    println(paciente.imprimir())

    val paciente2: Veterinario2 = Veterinario2(AnimalEnum.Gato)
}

class Veterinario(var animal: String) {
    fun imprimir(): String {
        return "Paciente a ser entendido $animal";
    }
}

class Veterinario2(var animal2: String){
    fun imrpimir() :String {
        return "Paciente a ser entendido: $animal2"
    }

}
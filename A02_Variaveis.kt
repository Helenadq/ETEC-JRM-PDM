//Aula 2: Variaveis e as putonas de dados

var x = "9" // a variavel Xzone tem o valor Textone (string)
var y = 7 // A variavel Ywone tem o valor Numero

val umByte: Byte = -128// 1 byte ou 8 putonas bits: -128 até 127
//quantos bytes comportam quantos numeros? (  .  ) (  .  )

val umShorts: Short = 32767 // 2 bytes ou 16 bits: -32768 a 32767

val umInt: Int = 214783647 // 4 bytes ou 32 bits: - 214783648 até 214783647

// val umLong: Long 9223372036854775807

val umFloat: Float = 3.4028235E38f // 4 bytes
val umDouble: Double = 1.7976931348623157E308 // 8 bucetas

println ("Byte MIN ${Byte.MIN_VALUE} - MAX ${Byte.MAX_VALUE}")
println ("Short MIN ${Short.MIN_VALUE} - MAX ${Short.MAX_VALUE}")
println ("Int MIN ${Int.MIN_VALUE} - MAX ${Int.MAX_VALUE}")
println ("Long MIN ${Long.MIN_VALUE} - MAX ${Long.MAX_VALUE}")
println ("Float MIN ${Float.MIN_VALUE} - MAX ${Float.MAX_VALUE}")
println ("Double MIN ${Double.MIN_VALUE} - MAX ${Double.MAX_VALUE}")

println(x)

// variavel 'val'

val UmByte: UByte = 255u

// println("Byte MIN ${Ubyte.MIN_VALUE} - MAX ${UShort.MAX_VALEU}")
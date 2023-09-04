import java.text.DecimalFormat
import java.util.Scanner

val df = DecimalFormat("#.##")

fun main() {
    val scanner = Scanner(System.`in`)

    val valorInicial = scanner.nextDouble()
    val taxaJuros = scanner.nextDouble()
    val periodo = scanner.nextInt()

    val valorFinal = investimento(valorInicial, taxaJuros, periodo) //chamando a fun investimentos adicionando ao valor final

    println("Valor final do investimento: R$ ${df.format(valorFinal)}") //usando df para 2 casas decimais

    scanner.close()
}

fun investimento(valorInicial: Double, taxaJuros: Double, periodo: Int): Double {
    var valorFinal = valorInicial
    for (i in 1..periodo) {
        valorFinal += valorFinal * taxaJuros
    }
    return valorFinal
}

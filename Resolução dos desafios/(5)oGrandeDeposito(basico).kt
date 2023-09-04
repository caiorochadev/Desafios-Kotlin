import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val valor = scanner.nextDouble()

    var saldoInicial = 0.0


    if (valor > 0) {
        //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
        saldoInicial += valor
        val saldo = String.format("%.2f", saldoInicial)
        println("Deposito realizado com sucesso!")
        println("Saldo atual: R$ $saldo")
    } else if (valor === 0.0) {
        //TODO: Imprimir a mensagem de valor inválido.
        println("Encerrando o programa...")
    } else {
        //TODO: Imprimir a mensagem de encerrar o programa.
        println("Valor invalido! Digite um valor maior que zero.")
    }
}
fun main() {
    val saldoAtual = readLine()!!.toFloat()
    val valorDeposito = readLine()!!.toFloat()
    val valorRetirada = readLine()!!.toFloat()

    //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
    var saldoFinal = saldoAtual + valorDeposito - valorRetirada

    //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
    println("Saldo atualizado na conta: $saldoFinal")
}
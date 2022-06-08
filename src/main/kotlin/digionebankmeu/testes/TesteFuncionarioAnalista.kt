package digionebankmeu.testes

import digionebankmeu.Analista

fun main() {
    val joao = Analista("Joao Pedro", "123.321.222.1", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
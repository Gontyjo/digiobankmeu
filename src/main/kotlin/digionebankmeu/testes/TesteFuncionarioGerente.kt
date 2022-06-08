package digionebankmeu.testes

import digionebankmeu.Gerente

fun main() {
    val maria = Gerente("Maria Cortez", "123.221.222.1", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}
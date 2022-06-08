package digionebankmeu.testes

import digionebankmeu.Funcionario
import digionebankmeu.Pessoa
import java.math.BigDecimal

fun main() {
    val user = Pessoa(nome = "Rodrigo Gontyjo", cpf = "123.321.222.11")
    println(user.nome)
    println(user.cpf)

    val joao = Funcionario("Rodrigo Gontyjo", "123.321.222.11", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}
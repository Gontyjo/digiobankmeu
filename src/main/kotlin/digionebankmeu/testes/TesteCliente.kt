package digionebankmeu.testes

import digionebankmeu.Cliente
import digionebankmeu.ClienteTipo

fun main() {
        val jose = Cliente(
            nome = "Jose Pereira",
            cpf = "123.344.223-99",
            clienteTipo = ClienteTipo.PF,
            senha = "123456"
        )

    println(jose)

    TesteAutenticacao().auntentica(jose)
}

package digionebankmeu

class Pessoa {
    var nome:String = "Rodrigo"
    var cpf:String = "123.321.222-11"

    inner class Endereco {
        var rua:String = "Rua Laranja"
        var cidade:String = "Brasília"
        var estado:String = "DF"
    }
}

fun main() {
    val user = Pessoa()
    println("Nome: ${user.nome}")
    println("CPF: ${user.cpf}")
    println("Endereço: ${user.Endereco().rua}, ${user.Endereco().cidade} - ${user.Endereco().estado}")
}
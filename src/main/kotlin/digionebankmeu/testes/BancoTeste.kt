package digionebankmeu.testes

import digionebankmeu.Banco

fun main() {
    val digiOneBankMeu = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBankMeu.nome)
    println(digiOneBankMeu.numero)
}
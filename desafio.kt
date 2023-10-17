enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Aluno(val nome: String, val idade: Int, val nivel: Nivel)

fun main() {
    println("Bem-vindo ao sistema de matrícula!")

    print("Digite o nome do aluno: ")
    val nomeAluno = readLine()

    print("Digite a idade do aluno: ")
    val idadeAluno = readLine()?.toIntOrNull()

    if (idadeAluno == null || idadeAluno <= 0) {
        println("Idade inválida. Por favor, insira uma idade válida.")
        return
    }

    println("Escolha o nível do curso:")
    println("1. Básico")
    println("2. Intermediário")
    println("3. Avançado")

    print("Digite o número correspondente ao nível do curso: ")
    val nivelEscolhido = readLine()?.toIntOrNull()

    val nivel: Nivel = when (nivelEscolhido) {
        1 -> Nivel.BASICO
        2 -> Nivel.INTERMEDIARIO
        3 -> Nivel.AVANCADO
        else -> {
            println("Nível inválido. Escolha 1 para Básico, 2 para Intermediário ou 3 para Avançado.")
            return
        }
    }

    val aluno = Aluno(nomeAluno ?: "", idadeAluno, nivel)

    println("\nMatrícula realizada com sucesso!")
    println("Nome do aluno: ${aluno.nome}")
    println("Idade do aluno: ${aluno.idade}")
    println("Nível do curso: ${aluno.nivel}")
}
// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val cpf: String, val data_nascimento: String)

data class ConteudoEducacional(var nome: String, var duracao: Int, var nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {

        println("Aluno {${usuario.nome}}, de cpf {${usuario.cpf}}, matriculado em $nome!")
        inscritos.add(usuario)

    }
}

fun main() {

    var numero: Int = 0;
    var materia = 0;

    val backend_com_kotlin = Formacao("Backend com Kotlin", listOf(ConteudoEducacional("Kotlin", 60, Nivel.valueOf("BASICO")),
        ConteudoEducacional("SpringBoot", 90, Nivel.valueOf("INTERMEDIARIO")),
        ConteudoEducacional("Banco de Dados", 120, Nivel.valueOf("INTERMEDIARIO"))));

    val ciencia_de_dados = Formacao("Ciencia de Dados", listOf(ConteudoEducacional("Python", 60, Nivel.valueOf("BASICO")),
        ConteudoEducacional("IA", 250, Nivel.valueOf("DIFICIL")),
        ConteudoEducacional("Estatistica Aplicada", 90, Nivel.valueOf("INTERMEDIARIO"))));

    val banco_de_dados = Formacao("Banco de Dados", listOf(ConteudoEducacional("SQL", 60, Nivel.valueOf("INTERMEDIARIO")),
        ConteudoEducacional("PostgreSQL", 90, Nivel.valueOf("INTERMEDIARIO")),
        ConteudoEducacional("Linux", 60, Nivel.valueOf("BASICO"))));

    while(numero != 2)
    {

        println("Seja bem-vindo ao Portal de Matriculas!")
        println("No momento temos as seguintes Formacoes disponiveis para matricula")
        println("1 - Backend com Kotlin : Kotlin, SpringBoot, Banco de Dados")
        println("2 - Ciencia de Dados: Python, IA, Estatistica Aplicada")
        println("3 - Banco de Dados : SQL, PostgreSQL, Linux")

        println("Deseja fazer alguma matricula? 1 - Sim/ 2 - Nao(Encerrar)")
        println("Caso deseje ver detalhes sobre as materias, digite 3")

        numero = readLine()!!.toInt()

        if(numero == 1)
        {
            println("Perfeito! Agora preencha seus dados.")

            println("Digite o nome do novo aluno: ");
            val nome = readLine()!!.toString();
            println("Digite o CPF do novo aluno: ");
            val cpf = readLine()!!.toString();
            println("Digite a data de nascimento do novo aluno: ");
            val data_nascimento = readLine()!!.toString();

            val aluno = Usuario(nome, cpf, data_nascimento);

            println("Agora escolha a materia desejada para se matricular.")

            materia = readLine()!!.toInt();

            when(materia)
            {
                1 -> backend_com_kotlin.matricular(aluno);
                2 -> ciencia_de_dados.matricular(aluno);
                3 -> banco_de_dados.matricular(aluno);
                else -> "Materia inexistente"
            }

            println("Operacao concluida")

        } else if(numero == 2)
        {
            print("Obrigado por usar nossos servicos. Volte sempre!");

        }else
        {

        }




    }


}

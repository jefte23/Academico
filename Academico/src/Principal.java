
public class Principal {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Jeft�", "21750454", 28, "Ciencia da Computa��o", "noturno", "Masculino");
		Disciplina d1 = new Disciplina("Linguagem de programa��o", "Ciencia da computa��o", 90);
		Disciplina d2 = new Disciplina("Estrutura de dados", "Ciencia da Computa��o", 75);

		System.out.println("<<< Dados do Aluno >>>" + a1);
		System.out.println("\n<<< Diciplinas 1 >>>" + d1 + "\n\n<<< Diciplina 2 >>>" + d2);

		System.out.println(a1.imprimirAluno());

		System.out.println(a1.getNome());

	}

}

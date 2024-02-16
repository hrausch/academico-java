public class Aula1Variaveis{

	public static void main(String [] args){

		/*
		DECLARANDO E IMPRIMINDO VALORES
		*/
		int idade = 19;
		System.out.println("Minha idade eh: " + idade);

		float mediaValores;
		mediaValores = (11 + 15)/2;
		System.out.println("A media de valores eh: " + mediaValores);

		/*
		STRING E CONCATENAÇÃO
		*/
		String nome = "HERBERT";
		System.out.println("Meu nome eh: " + nome);

		nome = nome + " RAUSCH";
		System.out.println("Meu nome completo eh: " + nome);

		/*
		VETORES
		*/
		int[] valores  = {23, 56, 21}; //declara e inicializa o vetor
		System.out.println("Segundo elemento do vetor eh: " + valores[1]);

		int valores2 [] = new int[2]; //declara e aloca memoria
		valores2[0] = 10; //inicializa posicao 0
		System.out.println("Primeiro elemento do vetor eh: " + valores2[0]);
		System.out.println("Segundo elemento do vetor eh: " + valores2[1]);

		String alunos[] = {"X", "Y", "Z"};
		int tamanhoVetor = alunos.length;
		System.out.println("O tamanho do vetor eh: " + tamanhoVetor);

		
	
	}
}

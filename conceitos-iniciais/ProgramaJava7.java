import java.util.Scanner;

public class ProgramaJava5{


	public static void main(String [] args){

		

		System.out.println("Qual o seu cpf:");

		// Instancia um objeto scanner para obter entrada a partir do console
		Scanner input = new Scanner( System.in );
		String nome = input.next(); 


		System.out.println(nome);

		System.out.println(nome.substring(0,5)); //imprime a subpalavra do índice 0 ao 4.

		System.out.println(nome.substring(2,6)); //subpalavra do índice 2 ao 5.



	
	}


}

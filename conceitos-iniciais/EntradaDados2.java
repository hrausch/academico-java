import java.util.Scanner;

public class EntradaDados2{


	public static void main(String [] args){

		// Instancia um objeto scanner para obter entrada a partir do console
		Scanner input = new Scanner( System.in );

		System.out.println("Qual o seu cpf:");
		String nome = input.next(); 

		int tamanho = nome.length();

		for(int i =0; i < tamanho; i++){

			//String s = (String) nome.charAt(i);
			//int numero = Integer.parseInt( s );

			System.out.println("Letra: " + nome[i] + " - posição no vetor: " + i);
		}



	
	}


}

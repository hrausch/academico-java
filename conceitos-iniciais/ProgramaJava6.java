import java.util.Scanner;

public class ProgramaJava6{


	public static void main(String [] args){

		// Instancia um objeto scanner para obter entrada a partir do console
		Scanner input = new Scanner( System.in );

		System.out.println("Qual o seu nome:");
		String nome = input.next(); 

		int tamanho = nome.length();

		for(int i =0; i < tamanho; i++){

			System.out.println("Letra: " + nome[i] + " - posição no vetor: " + i);
		}



	
	}


}

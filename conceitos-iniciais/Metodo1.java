import java.util.Scanner;

public class Metodo1{

	public void lerNome(){
	
		// Instancia um objeto scanner para obter entrada a partir do console
		Scanner input = new Scanner( System.in );

		System.out.println("Qual o seu nome:");
		String nome = input.next(); 

		int tamanho = nome.length();

		for(int i =0; i < tamanho; i++){

			char caracter = nome.charAt(i);
			System.out.println("Letra: " + caracter + " - posicao no vetor: " + i);
		}
	}
	
	public void lerNumero(){
	
		// Instancia um objeto scanner para obter entrada a partir do console
		Scanner input = new Scanner( System.in );

		System.out.println("Qual o seu ano de nascimento:");
		String texto = input.next(); 

		int tamanho = texto.length();
		
		int significativo = 1000;
		int ano = 0;

		for(int i =0; i < tamanho; i++){
			//obtem o caracter de posicao i da string
			char caracter = texto.charAt(i);
			//converte um caracter em inteiro
			int numero = Character.getNumericValue(caracter);
			
			numero = numero * significativo;
			ano += numero;
			significativo = significativo / 10;
			
		}
		
		System.out.println("\n** O ano digitado foi: " + ano + " ** A sua idade eh: " + (2020-ano) );
	}


	public static void main(String [] args){
			ProgramaJava6 objetoPrograma6 = new ProgramaJava6();			
			objetoPrograma6.lerNome();
			objetoPrograma6.lerNumero();	
	}


}

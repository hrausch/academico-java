import java.util.Scanner;
import java. util.Stack;
import java. util.Random;

public class ProgramaJava8Stack{


	public static void main(String [] args){

		

		System.out.println("Qual a sua idade? ");

		// Instancia um objeto scanner para obter entrada a partir do console
		Scanner input = new Scanner( System.in );
		String idade = input.next(); 

		// convertendo uma string para o tipo inteiro
		int idadeInteiro = Integer.parseInt(idade);

		// instanciando um objeto que implementa o TAD pilha
		// https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
		// <Integer> eh o tipo de elemento da minha pilha. poderia ser
		// <Float>  se fosse de numeros flutuantes, por exemplo.
		Stack<Integer> stack1 = new Stack<Integer>();

		//classe que gera numeros aleatorios
	    Random random = new Random();

		for (int i=0;i<5;i++){
			//gera um numero aleatorio
			int numero = random.nextInt(100);
			//empilha o numero gerado na pilha
			stack1.push( numero );

			System.out.print(numero + " ");
		
		}
			System.out.println("\nFim da op de empilhar");

		// loop que desempilha os elementos a cada iteracao
		for (int i=0;i<5;i++){

			//desempilha e atribui na variavel elemento
			int elemento = (Integer) stack1.pop();

			System.out.print(elemento + " ");
		}

		System.out.println("\nFim da op de desempilhar");




	
	}


}

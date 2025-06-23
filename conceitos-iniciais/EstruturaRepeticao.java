public class EstruturaRepeticao{

	Scanner input = new Scanner( System.in );

	public void int lerInteiro(){
		int numero = input.nextInt();
		return numero;
	}

	public static void main(String [] args){

		int[] valores  = {23, 56, 21}; //declara e inicializa o vetor

		int tamanhoVetor = valores.length;

		for(int i = 0; i < tamanhoVetor; i++){
			int elementoVetor = valores[i];

			System.out.println("Posicao: " + i + " - Elemento: "+elementoVetor);
		}

		System.out.println("*** loop com while ***");
		int i = 0;
		while(i < tamanhoVetor){
			int elementoVetor = valores[i];

			System.out.println("Posicao: " + i + " - Elemento: "+elementoVetor);
			i++;
		}
		
	
	}

/*
 * FUNCIONAMENTO DO LOOP WHILE:
 * 
 * 1. INICIALIZAÇÃO:
 *    - Primeiro definimos uma variável de controle (counter = 1)
 *    - Esta variável será usada para controlar quantas vezes o loop executa
 * 
 * 2. CONDIÇÃO DE TESTE: (while counter <= 10)
 *    - No início de cada iteração, a condição é verificada
 *    - Se verdadeira (counter <= 10), o código dentro do loop executa
 *    - Se falsa, o loop termina e o programa continua
 * 
 * 3. CORPO DO LOOP:
 *    - As instruções dentro do loop são executadas
 *    - Neste caso, imprime o valor do contador
 * 
 * 4. INCREMENTO:
 *    - A variável de controle é incrementada (counter++)
 *    - Garante que o loop eventualmente termine
 
 */

	public static void repeticaoWhile(){
        
        int counter = 1;
        
        while (counter <= 10) {
            System.out.println("Contador: " + counter);
            counter++;
        }
	}
	
/*
 * ESTRUTURA DO LOOP FOR:

 * 0. SINTAXE:
 *    for(inicialização; condição; incremento/decremento) {
 *        // bloco de código a ser executado
 *    }
 * 
 * 1. INICIALIZAÇÃO:
 *    - Primeira parte da declaração for (i = 1)
 *    - Executada uma vez antes do loop começar
 *    - Inicializa a variável contadora
 * 
 * 2. CONDIÇÃO:
 *    - Segunda parte (i <= 10)
 *    - Verificada antes de cada iteração
 *    - Loop continua enquanto a condição for verdadeira
 *    - Loop termina quando a condição se torna falsa
 * 
 * 3. INCREMENTO/DECREMENTO:
 *    - Terceira parte (i++)
 *    - Executado após cada iteração
 *    - Atualiza a variável contadora
 *    - Garante que o loop eventualmente terminará
 * 
 
 */

public static void repeticaoFor() {
    for(int i = 1; i <= 10; i++) {
        System.out.println("Counter: " + i);
    }
}

/**
 * O dois metodos abaixos implementam o seguinte problema:
 * 
 * Escreva um programa que leia dois números inteiros e imprima todos os números inteiros que estão no intervalo entre eles, incluindo os dois números.
 *
 * Exemplo de entrada:
 *
 * Digite o primeiro número: 5
 * Digite o segundo número: 10
 *
 * Exemplo de saída:
 *
 * Números no intervalo: 5, 6, 7, 8, 9, 10
 *
 *
 */


public void imprimirIntervaloWhile() {
    System.out.println("Digite o primeiro número:");
    int numero1 = lerInteiro();
    
    System.out.println("Digite o segundo número:");
    int numero2 = lerInteiro();
    
    // Determina qual é o menor e maior número usando if
    int menor, maior;
    if (numero1 < numero2) {
        menor = numero1;
        maior = numero2;
    } else {
        menor = numero2;
        maior = numero1;
    }
    
    //faz o loop do numero menor ate o maior
    int numeroAtual = menor;
    
    while (numeroAtual <= maior) {
        System.out.println("Número: " + numeroAtual);
        numeroAtual++;
    }
}

public void imprimirIntervaloFor() {
    System.out.println("Digite o primeiro número:");
    int numero1 = lerInteiro();
    
    System.out.println("Digite o segundo número:");
    int numero2 = lerInteiro();
    
    // Determina qual é o menor e maior número usando if
    int menor, maior;
    if (numero1 < numero2) {
        menor = numero1;
        maior = numero2;
    } else {
        menor = numero2;
        maior = numero1;
    }
    
    for (int numeroAtual = menor; numeroAtual <= maior; numeroAtual++) {
        System.out.println("Número: " + numeroAtual);
    }
}


	
}

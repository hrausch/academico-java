public class EstruturaRepeticao{

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
}

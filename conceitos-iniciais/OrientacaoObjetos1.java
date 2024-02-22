public class OrientacaoObjetos1{
	
	public static void main(String [] args){
	
		Multiplicacao objetoMultiplicacao = new Multiplicacao();		
		objetoMultiplicacao.fator = 4;
		int retorno = objetoMultiplicacao.multiplicar(4);
		System.out.println("O valor de retorno e': " + retorno );
		
	}

}

class Multiplicacao{

	int fator;
	
	public int multiplicar(int operador){
	
		int resultado = 0;
		for(int i = 0; i < fator; i++){
			resultado += operador;
		}
		
		return resultado;
	
	}

}










	

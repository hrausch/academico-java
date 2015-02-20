public class Ponto{

	double latitude;
	double longitude;
	
	public void imprimirCoordenadas(){
	
		System.out.println("Latitude: " + this.latitude + " Longitude: " + this.longitude);
	}

	
	public static void main(String [] args){

		/*Instancia um novo objeto do tipo Ponto*/
		Ponto coordCefet = new Ponto();
		
		/* Atribui os valores da coordenadas do cefetmg/vga */
		coordCefet.latitude = -21.55;
		coordCefet.longitude = -45.42;
		
		/* Imprime as coordenadas do objeto coordCefet */
		coordCefet.imprimirCoordenadas();
		
		System.out.println("Referencia do objeto na memoria: " + coordCefet);
		
				
		Ponto coordTeatro = new Ponto();
		coordTeatro.latitude = -21.55;
		coordTeatro.longitude = -45.44;
		coordTeatro.imprimirCoordenadas();
		System.out.println("Referencia do objeto na memoria: " + coordTeatro);
		
	
	}
}

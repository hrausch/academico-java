public class EstruturaControle{

	public static void main(String [] args){

		int numero = 13;

		/* CONDICIONAL IF AND ELSE */
		if( (numero%2) == 0){
			System.out.println("Numero eh par");
		}
		else{
			System.out.println("Numero eh impar");
		}

		int nota = 69;

		/* CONDICIONAL OPERADORES:
		E - &
		O - |
		NOT - !
		*/
		if((nota > 60) && (nota < 70))
			System.out.println("Conceito C");

		/* SWITCH CASE 
		
		O 'break' eh opcional.
		Ele evita que as verificacoes seguintes sejam analisadas quando ocorre um match
		No exemplo abaixo, a verificacao de out,nov, e dez nao serao nem analisada, pois
		o match ocorrerá no mes 9 (set).
		*/
		int numeroMes = 9;
		String mesAno;
        switch (numeroMes) {
            case 1:  mesAno = "Jan";
                     break;
            case 2:  mesAno = "Fev";
                     break;
            case 3:  mesAno = "Mar";
                     break;
            case 4:  mesAno = "Abr";
                     break;
            case 5:  mesAno = "Mai";
                     break;
            case 6:  mesAno = "Jun";
                     break;
            case 7:  mesAno = "Jul";
                     break;
            case 8:  mesAno = "Ago";
                     break;
            case 9:  mesAno = "Set";
                     break;
            case 10: mesAno = "Out";
                     break;
            case 11: mesAno = "Nov";
                     break;
            case 12: mesAno = "Dez";
                     break;
            default: mesAno = "Invalido";
                     break;
        }
        System.out.println(mesAno);
		
	
	}
}

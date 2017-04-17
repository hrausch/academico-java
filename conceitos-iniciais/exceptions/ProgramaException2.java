public class ProgramaException2{


	private int variavel1;


	public static void main(String [] args){


		testeException1();


	}

        
	public static void testeException1() throws NullPointerException{


                int [] vetor1 = new int[5];

                System.out.println("Teste Exception 1");
                try{
                        vetor1[6] = 10;

                        System.out.println("Teste Exception 1 - Após o erro"); 

                }
                catch(Exception e){

			throw new NullPointerException();

                }



        }
	        








}

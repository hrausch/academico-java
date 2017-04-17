public class ProgramaException{


	private int variavel1;


	public static void main(String [] args){


		testeException1();

		testeException2();

		testeException3();
		
		testeException4();

	}

        
	public static void testeException1(){


                int [] vetor1 = new int[5];

                System.out.println("Teste Exception 1");
                try{
                        vetor1[6] = 10;

                        System.out.println("Teste Exception 1 - Após o erro"); 

                }
                catch(Exception e){

                        System.out.println("Um erro ocorreu. E este erro foi:");
                        e.printStackTrace();


                }



        }
	        
	public static void testeException2(){


                int [] vetor1 = new int[5];

                System.out.println("Teste Exception 2");
                try{
                        vetor1[6] = 10;

                        System.out.println("Teste Exception 2 - após o erro");
                }
                catch(ArrayIndexOutOfBoundsException e){

                        System.out.println("Um erro ocorreu de ArrayIndexOutofBound:");


                }


        }

        public static void testeException3(){


                int [] vetor1 = new int[5];

                System.out.println("Teste Exception 3");
                try{
                        vetor1[6] = 10;

                        System.out.println("Teste Exception 3 - após o erro");
                }
                catch(ArrayIndexOutOfBoundsException e){

                        System.out.println("Um erro ocorreu de ArrayIndexOutofBound:");


                }

		finally{

                	System.out.println("Teste Exception 3 - após catch");

		}


        }


        public static void testeException4( boolean b ){


                int [] vetor1 = new int[5];
                ProgramaException obj1 = new ProgramaException();

                System.out.println("Teste Exception 4");

                try{

                        obj1.variavel1 = 10;
                        obj1 = null;

                        obj1.variavel1 = 10;

                        System.out.println("Teste Exception 4 - após o erro");
                }
                catch(ArrayIndexOutOfBoundsException e){

                        System.out.println("Um erro ocorreu de ArrayIndexOutofBound:");


                }



        }        

	public static void testeException4(){


                int [] vetor1 = new int[5];
                ProgramaException obj1 = new ProgramaException();

                System.out.println("Teste Exception 4");

                try{

                        obj1.variavel1 = 10;
                        obj1 = null;

                        obj1.variavel1 = 10;

                        System.out.println("Teste Exception 4 - após o erro");
                }
                catch(ArrayIndexOutOfBoundsException e){

                        System.out.println("Um erro ocorreu de ArrayIndexOutofBound:");


                }

                catch(NullPointerException e){

                        System.out.println("Um erro ocorreu de NullPointer:");
                }



        }








}

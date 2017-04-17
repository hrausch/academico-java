import java.io.*;

class ProgramaException3{
    File f;
   
    public ProgramaException3(String nomeArquivo){
        f= new File(nomeArquivo);
    }

    public void creerFic(){
        f.createNewFile();
    }

    public static void main(String args []){
        ProgramaException3 exp1 = new ProgramaException3("arquivo1.txt");
        exp1.creerFic();
    }
}




/*

ProgramaException3.java:11: error: unreported exception IOException; must be caught or declared to be thrown
        f.createNewFile();


*/

import java.util.Scanner;

public class ProgramaJava8 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        //LEIA AS ENTRADAS REQUERIDAS
        int numero = lerInteiro();

        //FAZ O PROCESSAMENTO DA ENTRADA

        //IMPRIME AS SAIDAS REQUERIDAS
        imprimir("Você digitou: " + numero);
    }

    public static int lerInteiro() {
        
        int valor = entrada.nextInt();
        return valor;
    }

    public static void imprimir(String mensagem) {
        System.out.println(mensagem);
    }
}

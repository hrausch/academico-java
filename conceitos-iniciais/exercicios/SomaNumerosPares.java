import java.util.Scanner;

public class SomaNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os números de entrada
        System.out.print("Digite o número inicial do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o número final do intervalo: ");
        int fim = scanner.nextInt();

        if (inicio > fim) {
            System.out.println("O número inicial deve ser menor ou igual ao número final.");
            return;
        }

        int soma = 0;
        for (int i = inicio; i <= fim; i++) {

            if (i / 2 == 0) { 
                soma += i; 
            }        
        }
        System.out.println("A soma dos números pares no intervalo [" + inicio + ", " + fim + "] eh: " + soma);
    }
}

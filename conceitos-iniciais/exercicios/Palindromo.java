import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a palavra de entrada
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        boolean palindromo = true;
        for (int i = 0; i < palavra.length() / 2; i++) {
            
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - i)) {
                //correcao : palavra.charAt(palavra.length() - i - 1)
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        } else {
            System.out.println("A palavra " + palavra + " não é um palíndromo.");
        }
    }
}

public class Fibonacci {

    public static void main(String[] args) {

        int n = 6; // O número de termos da sequência de Fibonacci a serem gerados
        
        
        int fib_n = fibonacci(n);
        // Chamando a função fibonacci e exibindo os primeiros n termos
        System.out.println("n-esimo termo eh: "+fib_n);
        
    }
    
    // Função para calcular o n-ésimo termo da sequência de Fibonacci
    public static int fibonacci(int n) {

        if (n <= 1) {
            return n; // Retornar n se for 0 ou 1
        }
        
        int fib_2 = 0; // fib(n-2)
        int fib_1 = 1; // fib(n-1)
        int fib = 0;       // fib(n)
        
        for (int i = 2; i <= n; i++) {
            fib = fib_1 + fib_2;
            fib_1 = fib;
            fib_2 = fib_1;
        }
        
        return fib;
    }
}

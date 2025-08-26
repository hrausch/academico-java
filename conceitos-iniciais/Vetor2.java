import java.util.Scanner;

public class Vetor2{

    public static final Scanner LER = new  Scanner(System.in);

    public static void main(String[] args) {


        int[] notasAlunos = gerarNotasAlunos(5);
        double media = calcularMedia(notasAlunos);
        System.out.println("Média das notas dos alunos: " + media);

        encontrarNotaMaisAlta(notasAlunos, media);

    }

    public static int[] gerarNotasAlunos(int quantidadeAlunos){
        int[] notas = new int[quantidadeAlunos];

        for(int i = 0; i < quantidadeAlunos; i++){
            notas[i] = lerInteiro();
        }

        return notas;
    }

    public static double calcularMedia(int[] notas){
        int soma = 0;

        for(int nota : notas){
            soma += nota;
        }

        return soma / notas.length;
    }

    public static void encontrarNotaMaisAlta(int[] notas, double media){

        for(int i = 0; i < notas.length; i++){
            if(notas[i] > media){
                System.out.println("A nota acima da média é: " + notas[i]);
                return;
            }
        }

        System.out.println("Nenhuma nota acima da média.");
    }


    

    public static int lerInteiro(){
        return LER.nextInt();
    }   
}
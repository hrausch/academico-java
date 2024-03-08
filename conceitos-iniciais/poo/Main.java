public class Main {

    public static void main(String[] args) {
       /*
       Criando os objetos
        */
       Gato thor = new Gato();
       Gato rambo = new Gato();

       /*
       Definindo o gato Thor
        */
       thor.nome = "Thor";
       thor.idade = 3;
       thor.cor = "Marrom";

       thor.sleep();

       /*
       Definindo o gato Rambo
        */
       rambo.nome = "Rambo";
       rambo.idade = 4;
       rambo.cor = "Marrom";

       rambo.play();

       manipulaContas();

       manipulaContasTitular();
    }

    public static void manipulaContas(){
        Conta	minhaConta;
		minhaConta	=	new	Conta();
		minhaConta.titular	=	"Meu";
		minhaConta.saldo	=	1000;
		minhaConta.saca(200);
		minhaConta.deposita(500);
		System.out.println("Meu saldo: " + minhaConta.saldo);

        Conta	suaConta;
		suaConta	=	new	Conta();
		suaConta.titular	=	"Aluno";
		suaConta.saldo	=	5000;
		suaConta.deposita(500);
		System.out.println("Seu saldo: " + suaConta.saldo);

        minhaConta.transfere(suaConta, 200);
        System.out.println(minhaConta.saldo);

        System.out.println("Meu saldo após transfere: " + minhaConta.saldo);
    	System.out.println("Seu saldo após transfere: " + suaConta.saldo);



    }

    public static void manipulaContasTitular(){
        ContaTitular	minhaConta;
		minhaConta	=	new	ContaTitular();
		minhaConta.titular.nome	=	"Herbert";
		minhaConta.saldo=1000;
		minhaConta.saca(200);
		minhaConta.deposita(500);
        minhaConta.imprimeTitular();
		System.out.println("Meu saldo: " + minhaConta.saldo);




    }

}
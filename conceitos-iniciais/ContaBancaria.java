public class ContaBancaria{

	int agencia, contaCorrente;
	double saldo, limiteExtra;
	
	public void imprimirSaldo(){
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void imprimirSaldoTotal(){
		double soma = this.saldo + this.limiteExtra;
		System.out.println("Saldo com limite extra: " + soma);
	}
	
	public static void main(String [] args){
	
		ContaBancaria cb1 = new ContaBancaria();
		cb1.agencia = 3610;
		cb1.contaCorrente = 15766;
		cb1.saldo = 35.54;
		cb1.limiteExtra = 50;
		
		cb1.imprimirSaldo();
		cb1.imprimirSaldoTotal();
	
	}

}










	

public class ContaTitular	{
	int	numero;
	Pessoa	titular;
	double	saldo;

	public ContaTitular(){
		this.titular = new Pessoa();
	}

	void imprimeTitular(){
		System.out.println(" Nome do titular eh: " + this.titular.nome);
	}

    void saca(double quantidade) {
		double	novoSaldo	=	this.saldo	-	quantidade;	
		this.saldo	=	novoSaldo;
    }

    void deposita(double	quantidade) {
		this.saldo	+=	quantidade;
	}

    void transfere(Conta	destino,	double	valor) {
		this.saldo	=	this.saldo	-	valor;
		destino.saldo	=	destino.saldo	+	valor;
	}

}
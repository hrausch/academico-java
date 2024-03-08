public class Conta	{
	int	numero;
	String	titular;
	double	saldo;

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
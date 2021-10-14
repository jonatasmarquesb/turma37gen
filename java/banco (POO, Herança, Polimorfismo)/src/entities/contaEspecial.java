package entities;

public class contaEspecial extends Conta {
	 private double limite=1000.0;

	public contaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite=limite;
		// TODO Auto-generated constructor stub
	}

	public double getLimite() {
		return limite;
	}
	/*Aqui no caso utilizei o mesmo método débito de conta de forma diferente pra usar polimorfismo. Se o valor do débito for maior
	que o saldo, o mecanismo do limite especial é ativado, subtraindo assim o restante desse limite*/
    @Override
	public double debito(double valorDebito) {
    	
		if (valorDebito <= this.saldo )  
		{
			this.saldo = this.saldo - valorDebito;
			System.out.println("Seu saldo é de: R$"+this.saldo+". Limite especial não utilizado.");
		} 
		else if (valorDebito>this.saldo && valorDebito<limite)
		{
			
			limite=(this.saldo+limite)-valorDebito;
			this.saldo=0;
		
			System.out.println("Seu saldo é de: R$"+this.saldo+". Seu limite especial é de: R$"+limite);
			
		}
		else if (valorDebito>limite && valorDebito>this.saldo) {
			System.out.println("----------------------------");
			System.out.println("Limite e saldo indisponível.");
			System.out.println("----------------------------");
		}
		return limite;
    	}
		
		
	
	 
}


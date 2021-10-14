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
		if (valorDebito <= this.saldo && valorDebito<limite)  
		{
			this.saldo = this.saldo - valorDebito;
			System.out.println("Limite Especial não utilizado.");
		} 
		else if (valorDebito>saldo)
		{
			
			limite=(limite-saldo)-valorDebito;
			saldo=0;
			System.out.println("Seu saldo é de: R$"+saldo+". Seu limite é de: R$"+limite);
			
		}
		return this.saldo;
    	}
		
		
	
	 
}


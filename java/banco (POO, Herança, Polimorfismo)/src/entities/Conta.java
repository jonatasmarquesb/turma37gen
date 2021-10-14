package entities;

public abstract class Conta {
    private int numero;
    private String cpf;
    protected double saldo=300.0;
    private boolean ativo;

    public Conta(int numero, String cpf) {
        super();
        this.numero = numero;
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo() {
        this.ativo = true;
    }
    
    public double debito(double valorDebito) {
		if (valorDebito <= this.saldo)  
		{
			this.saldo = this.saldo - valorDebito;
		} 
		else if (valorDebito>this.saldo)
		{
			System.out.println("SALDO INDISPONIVEL");
		}
		return this.saldo;
    	}
	public double credito(double valorCredito)
	{
		this.saldo = this.saldo + valorCredito;
		return this.saldo;
	}
		

}
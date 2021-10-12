package entities;

public class Pessoas2 {
	private String primeiroNome;
	private String segundoNome;
	private String ultimoNome;
	
	public Pessoas2(String primeiroNome, String segundoNome, String ultimoNome) {
		super();
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.ultimoNome = ultimoNome;
	} 
	
	public String getNomeCompleto() {
		String nomeCompleto =primeiroNome+" "+segundoNome+" "+ultimoNome;
		return nomeCompleto;
		
	}
	
	
}

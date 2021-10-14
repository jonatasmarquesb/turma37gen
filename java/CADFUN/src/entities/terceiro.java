package entities;

public class terceiro extends Funcionarios {
	
	private double adicional;

	public terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		this.adicional=adicional;
		// TODO Auto-generated constructor stub
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	@Override
	public double calcularSalario() {
		return ((horasTrabalhadas*valorHora)+adicional);
	}
	
	
	

}

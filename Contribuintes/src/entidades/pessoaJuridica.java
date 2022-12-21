package entidades;

public class pessoaJuridica extends Pessoa {

	private Double numeroDeFuncionarios;
	
	public pessoaJuridica() {	
	}

	public pessoaJuridica(String nome, Double rendaAnual, Double nuemroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = nuemroDeFuncionarios;
	}

	@Override
	public Double imposto() {
		Double imposto;
		if (this.numeroDeFuncionarios < 10) {
			imposto = rendaAnual * 0.16;
		}
		else {
			imposto = rendaAnual * 0.14;
		}
		return imposto;
	}

}

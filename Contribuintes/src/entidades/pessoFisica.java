package entidades;

public class pessoFisica extends Pessoa {

	private Double gastosComSaude;
	
	public pessoFisica() {	
	}

	public pessoFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public Double imposto() {
		Double imposto;
		if (this.rendaAnual < 20000) {
			imposto = (rendaAnual * 0.15) - (gastosComSaude * 0.5);
		}
		else {
			imposto = (rendaAnual * 0.25) - (gastosComSaude * 0.5);
		}
		return imposto;
	}
	
}

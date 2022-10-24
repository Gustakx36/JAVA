package caixaEletronicoSistema;

public class sistema {
			
	private double valorEmConta;
	private int numeroDaConta;
	private String nomeTitular;
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public double getValorEmConta() {
		return valorEmConta;
	}
	
	public void setValorEmConta(double valorEmConta) {
		this.valorEmConta += valorEmConta;
	}

	public sistema(int numeroDaConta, String nomeTitular) {
		setNumeroDaConta(numeroDaConta);
		setNomeTitular(nomeTitular);
	}
	
	public sistema() {
	}
	
	public String informacoes() {
		return String.format("%nINFORMACOES : %n"
				+ "CONTA : %d, "
				+ "TITULAR : %s, "
				+ "VALOR : R$ %.2f. %n", numeroDaConta, nomeTitular, valorEmConta);
	}
	
	public String escolha() {
		return String.format("O QUE GOSTARIA DE FAZER AGORA ?%n"
				+ "1 - DEPOSITAR UM VALOR%n"
				+ "2 - SACAR UM VALOR%n"
				+ "3 - FINALIZAR%n"
				+ "DIGITE O VALOR DA OPCAO : ");
	}
	
	public String saque() {
		return String.format("%nQUAL VALOR DO SAQUE ?%n"
				+ "VALOR MAXIMO DE R$ 50.000 POR DIA%n"
				+ "DIGITE O VALOR DO SAQUE : ");
	}
	
	public void saque(double saque) {
		this.valorEmConta -= saque + 5;
	}
}

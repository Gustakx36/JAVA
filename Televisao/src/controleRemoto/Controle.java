package controleRemoto;

public class Controle {

	public int ligar, volume, tarefa, canal;
	private int volumenum = 0, canalnum = 0;

	public int getVolumenum() {
		return volumenum;
	}
	
	public int getCanalnum() {
		return canalnum;
	}
	
	public void ligartv(int ligar) {
		this.ligar = ligar;
	}

	public String ligado(int ligar) {
		if (ligar == 1) {
			return String.format("O que gostaria de fazer : %n" + "Aumentar ou diminuir volume (1)%n"
					+ "Mudar canal para frente ou para tras (2)%n" + "Trocar para um canal que indicar (3)%n"
					+ "Consultar volume e canal (4)");
		} else if (ligar == 0) {
			return String.format("TV continua desligada%n");
		} else
			return String.format("erro%n");
	}
	
	public int volumeaumentar() {
		return volumenum += 1;
	}

	public int volumediminuir() {
		return volumenum -= 1;
	}

	public String volumeresult() {
		if (this.volume == 1) {
			volumeaumentar();
			return "Voce aumentou o volume";
		} else if (this.volume == 2) {
			volumediminuir();
			return "Voce diminuiu o volume";
		} else if (this.volume == 3) {
			return String.format("Voce reiniciou%n");
		} else
			return "Erro";
	}

	public int aumentarcanal() {
		return volumenum += 1;
	}

	public int diminuircanal() {
		return volumenum -= 1;
	}

	public String canalresult() {
		if (this.canal == 1) {
			volumeaumentar();
			return "Voce avancou o canal";
		} else if (this.canal == 2) {
			volumediminuir();
			return "Voce retrocedeu o canal";
		} else if (this.canal == 3) {
			return String.format("Voce reiniciou%n");
		} else
			return "Erro";
	}

}

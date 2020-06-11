package corso.java.gioco;

public class Guerriero {

	private int puntiVita = 100;
	private Forza valoreForza;
	private Abilita valoreAbilita;
	private Arma armaGuerriero;

	public Guerriero() {
	}

	public Guerriero(Forza valoreForza, Abilita valoreAbilita, Arma armaGueriero) {
		this.valoreForza = valoreForza;
		this.valoreAbilita = valoreAbilita;
		this.armaGuerriero = armaGueriero;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guerriero other = (Guerriero) obj;
		if (puntiVita != other.puntiVita)
			return false;
		return true;
	}


	public int getPuntiVita() {
		return puntiVita;
	}


	public void setPuntiVita(int puntiVita) {
		this.puntiVita = puntiVita;
	}


	public int getValoreForza() {
		return valoreForza.getValoreForzaGuerriero();
	}



	public int getValoreAbilita() {
		return valoreAbilita.getValoreAbilitaGuerriero();
	}



	public Arma getArmaGuerriero() {
		return armaGuerriero;
	}


	@Override
	public String toString() {
		return "Punti vita: " + puntiVita + "\n"
				+ "Valore forza: " + valoreForza + "\n"
						+ "Valore abilita: " + valoreAbilita + "\n"
				+ "Arma guerrier: " + armaGuerriero + "\n";
	}

}

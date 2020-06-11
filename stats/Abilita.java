package corso.java.gioco;

public enum Abilita {

	UNO(1), DUE(2), TRE(3), QUATTRO(4), CINQUE(5), SEI(6), SETTE(7), OTTO(8), NOVE(9), DIECI(10);

	private int valoreAbilitaGuerriero;

	private Abilita(int valoreAbilitaGuerriero) {
		this.valoreAbilitaGuerriero = valoreAbilitaGuerriero;
	}

	public int getValoreAbilitaGuerriero() {
		return valoreAbilitaGuerriero;
	}

	public void setValoreAbilitaGuerriero(int valoreAbilitaGuerriero) {
		this.valoreAbilitaGuerriero = valoreAbilitaGuerriero;
	}

}

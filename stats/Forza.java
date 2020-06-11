package corso.java.gioco;

public enum Forza {

	UNO(1), DUE(2), TRE(3), QUATTRO(4), CINQUE(5), SEI(6), SETTE(7), OTTO(8), NOVE(9), DIECI(10);

	private int valoreForzaGuerriero;

	private Forza(int valoreForzaGuerriero) {
		this.valoreForzaGuerriero = valoreForzaGuerriero;
	}

	public int getValoreForzaGuerriero() {
		return valoreForzaGuerriero;
	}

	public void setValoreForzaGuerriero(int valoreForzaGuerriero) {
		this.valoreForzaGuerriero = valoreForzaGuerriero;
	}

}

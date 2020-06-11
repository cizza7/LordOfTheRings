package corso.java.gioco;

public abstract class Arma {

	private int usura;
	private int valoreAttacco;
	private int valoreDifesa;

	public Arma(int usura, int valoreAttacco, int valoreDifesa) {
		this.usura = usura;
		this.valoreAttacco = valoreAttacco;
		this.valoreDifesa = valoreDifesa;
	}

	public int getUsura() {
		return usura;
	}

	public int getValoreAttacco() {
		return valoreAttacco;
	}

	public int getValoreDifesa() {
		return valoreDifesa;
	}

	public void setUsura(int usura) {
		this.usura = usura;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arma other = (Arma) obj;
		if (usura != other.usura)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usura: " + usura + "\n";
	}

}

package corso.java.gioco;

public class Arco extends Arma {

	public Arco() {
		super(80, 8, 2);
	}

	@Override
	public String toString() {
		return "ARCO\n" + super.toString();
	}

}

package corso.java.gioco;

public class Elfo extends Guerriero {

	public Elfo() {
		super(Forza.SETTE, Abilita.NOVE, new Arco());
	}

	@Override
	public String toString() {
		return "ELFO\n" + super.toString();
	}


}

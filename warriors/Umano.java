package corso.java.gioco;

public class Umano extends Guerriero {


	public Umano() {
		super(Forza.SETTE, Abilita.OTTO, new Spada());
	}


	@Override
	public String toString() {
		return "UMANO\n" + super.toString();
	}

	
}

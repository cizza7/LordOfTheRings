package corso.java.gioco;

public class Nano extends Guerriero{


	public Nano() {
		super(Forza.SEI, Abilita.QUATTRO, new Ascia());
	}

	@Override
	public String toString() {
		return "NANO \n " + super.toString();
	}

	
}

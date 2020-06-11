package corso.java.gioco;

public class Nazgul extends Guerriero{


	public Nazgul() {
		super(Forza.SETTE, Abilita.OTTO, new Spada());
	}

	@Override
	public String toString() {
		return "NAZGUL\n" + super.toString();
	}
}

package corso.java.gioco;

public class Goblin extends Guerriero{


	public Goblin() {
		super(Forza.CINQUE, Abilita.TRE, new Ascia());
	}

	@Override
	public String toString() {
		return "GOBLIN\n" + super.toString();
	}
	
}

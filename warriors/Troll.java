package corso.java.gioco;

public class Troll extends Guerriero {


	public Troll() {
		super(Forza.NOVE, Abilita.DUE, new Ascia());
	}
	
	@Override
	public String toString() {
		return "TROLL\n" + super.toString();
	}
	
}

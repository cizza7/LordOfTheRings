package corso.java.gioco;

public class Orco extends Guerriero {


	public Orco() {
		super(Forza.OTTO, Abilita.NOVE, new Arco());

	}
	@Override
	public String toString() {
		return "ORCO\n" + super.toString();
	}

}

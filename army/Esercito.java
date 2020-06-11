package corso.java.gioco;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class Esercito {


	private String nomeEsercito;
	private LinkedList<Guerriero> esercitoGuerrieri;

	
	// esercito
	public Esercito(String nomeEsercito) {

		
		this.nomeEsercito = nomeEsercito;
		this.esercitoGuerrieri = new LinkedList<Guerriero>();
	}


	public LinkedList<Guerriero> getEsercitoGuerrieri() {
		return esercitoGuerrieri;
	}

	public void setEsercitoGuerrieri(LinkedList<Guerriero> esercitoGuerrieri) {
		this.esercitoGuerrieri = esercitoGuerrieri;
	}

	public Guerriero getProssimo() {
		return this.esercitoGuerrieri.getFirst();
	}

	public void setInserisciInCoda(Guerriero g) {
		this.esercitoGuerrieri.addLast(g);
	}
	@Override
	public String toString() {
		return "Esercito:\n"
				+ " Esercito di Guerrieri: " + esercitoGuerrieri.toString()
				+ "\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Esercito other = (Esercito) obj;
		if (esercitoGuerrieri == null) {
			if (other.esercitoGuerrieri != null)
				return false;
		} else if (!esercitoGuerrieri.equals(other.esercitoGuerrieri))
			return false;
		if (nomeEsercito == null) {
			if (other.nomeEsercito != null)
				return false;
		} else if (!nomeEsercito.equals(other.nomeEsercito))
			return false;
		return true;
	}

	//add warrior to the army
	public void arruolaGuerriero(Guerriero g) {
		try {
			if (g != null)
				esercitoGuerrieri.addLast(g);
		} catch (Exception e) {
			System.out.println("Errore aggiunta guerriero all'esercito");
		}

	}

	//takes out a warrior from the list, and gets it to te fight
	public Guerriero lanciaGuerrieroInCombattimento() {
		Guerriero lanciato;
		if (esercitoGuerrieri.getFirst() == null) {
			System.out.println("Esercito vuoto\n");
			return null;
		}

		lanciato = esercitoGuerrieri.removeFirst();
		return lanciato;

	}

	//counting how many warriors are in a specific army
	public int contaEsercito() {
		Iterator<Guerriero> iter = esercitoGuerrieri.iterator();
		int nCombattenti = 0;
		while (iter.hasNext()) {
			nCombattenti++;
			iter.next();
		}
		return nCombattenti;
	}

}

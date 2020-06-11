package corso.java.gioco;

public class Main {

	public static void main(String[] args) {

		CompagniaAnello compagniaDellAnello = new CompagniaAnello();
		SudditiDiSauron sudditiDiSauron = new SudditiDiSauron();

		// inserisco 24 guerrieri per ogni esercito
		for (int i = 0; i < 6; i++) {
			Goblin goblin = new Goblin();
			Nazgul nazgul = new Nazgul();
			Orco orco = new Orco();
			Troll troll = new Troll();

			sudditiDiSauron.arruolaGuerriero(goblin);
			sudditiDiSauron.arruolaGuerriero(nazgul);
			sudditiDiSauron.arruolaGuerriero(troll);
			sudditiDiSauron.arruolaGuerriero(orco);
		}

		for (int j = 0; j < 8; j++) {
			Elfo elfo = new Elfo();
			Nano nano = new Nano();
			Umano umano = new Umano();

			compagniaDellAnello.arruolaGuerriero(elfo);
			compagniaDellAnello.arruolaGuerriero(nano);
			compagniaDellAnello.arruolaGuerriero(umano);
		}



		boolean fine = false;
		Combattimento combattimento = new Combattimento();

		while (!fine) {
			combattimento.scontro(compagniaDellAnello, sudditiDiSauron);

			if (compagniaDellAnello.contaEsercito() == 0) {
				System.out.println("Vincono i Sudditi di Sauron\n");
				System.out.println("Rimangono "+compagniaDellAnello.contaEsercito()+" guerrieri nell'esercito della Compagnia dell'Anello\n");
				System.out.println("Rimangono "+sudditiDiSauron.contaEsercito()+" guerrieri nell'esercito dei Sudditi di Sauron\n");
				fine = true;
			} else if (sudditiDiSauron.contaEsercito() == 0) {
				System.out.println("Vince la Compagnia dell'Anello");
				System.out.println("Rimangono "+sudditiDiSauron.contaEsercito()+" guerrieri nell'esercito dei Sudditi di Sauron\n");
				System.out.println("Rimangono "+compagniaDellAnello.contaEsercito()+" guerrieri nell'esercito della Compagnia dell'Anello\n");
				fine = true;
			}

		}

	}

}

package corso.java.gioco;

import java.util.Random;

public class Combattimento {


	public Combattimento() {
	}


	//decide who starts the attack and who is defending based on a "lucky" formula
	public Guerriero chiInizia(Guerriero a, Guerriero b) {

		double abiGuerrieroa = fortuna(a);
		double abiGuerrierob = fortuna(b);

		if(abiGuerrieroa > abiGuerrierob) {
			return a;
		} else if (abiGuerrierob == abiGuerrieroa) {
			chiInizia(a, b);
		}

		return b;
	}


	//thats the "lucky" formula based on stats and a random int
	public double fortuna(Guerriero g) {
		Random ran = new Random();
		double fortuna = (g.getValoreAbilita() * 1.25) + g.getValoreForza() + ran.nextInt(15);
		return fortuna;
	}


	// attacco is the warriors who has won the chiInizia function.
	public Guerriero combattimento(Guerriero attacco, Guerriero difesa) {
		int dannoAttacco = attacco.getValoreForza();
		int dannoAttaccoArma = attacco.getArmaGuerriero().getValoreAttacco();
		int dannoInflittoAttaccante = dannoAttacco + dannoAttaccoArma;

		int dannoDifesa = difesa.getValoreForza();
		int mitigareDifesaArma = difesa.getArmaGuerriero().getValoreDifesa();
		int dannoSubitoDifensore = dannoDifesa + mitigareDifesaArma;

		boolean endFight = false;
		boolean attaccoVince = false;
		boolean difesaVince = false;
		while (!endFight) {
			
			//damage counting
			int esitoScontro = dannoInflittoAttaccante + dannoSubitoDifensore;
			if (esitoScontro >= 0) {
				difesa.setPuntiVita(-esitoScontro);
			} else {
				attacco.setPuntiVita(-(esitoScontro + (-1)));
			}

			if (difesa.getPuntiVita() <= 0) {
				endFight = true;
				attaccoVince = true;
			} else if (attacco.getPuntiVita() <= 0) {
				endFight = true;
				difesaVince = true;
			}

			//upgrading the weapon stats
			attacco.getArmaGuerriero().setUsura(-5);
			difesa.getArmaGuerriero().setUsura(-2);

		}


		if (difesaVince)
			return difesa;
		return attacco;

	}


	public void scontro(CompagniaAnello compagnia, SudditiDiSauron sSauron) {
		
		boolean quit = false;
		Guerriero vincitoreGuerriero = new Guerriero();
		Guerriero a = new Guerriero();
		Guerriero b = new Guerriero();
		while (!quit) {
			a = compagnia.lanciaGuerrieroInCombattimento();
			b = sSauron.lanciaGuerrieroInCombattimento();

			Guerriero guerrieroCheInizia = chiInizia(a, b);

			if (a.equals(guerrieroCheInizia)) {
				vincitoreGuerriero = combattimento(a, b);
				quit = true;
			} else if (b.equals(guerrieroCheInizia)) {
				vincitoreGuerriero = combattimento(b, a);
				quit = true;
			} else {
				System.out.println("ERRORE SCONTRO\n");
			}

		}

		if (vincitoreGuerriero.equals(a)) {
			compagnia.setInserisciInCoda(a);
		} else if (vincitoreGuerriero.equals(b)) {
			sSauron.setInserisciInCoda(b);
		}

	}


}

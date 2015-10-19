package fr.istic.aoc.Materiel;

public class Materiel {
	
	private static Horloge horloge = new HorlogeImpl();
	private static Afficheur afficheur = new AfficheurImpl();
	private static Clavier clavier= new ClavierImpl();
	private static Molette molette= new MoletteImpl();
	private static EmetteurSonore emetteurSonore= new EmetteurSonoreImpl();
	

	public static Horloge getHorloge() {
		return horloge;
	}

	public Clavier getClavier() {
		return clavier;
	}

	public Molette getMolette() {
		return molette;
	}

	public EmetteurSonore getEmetteurSonore() {
		return emetteurSonore;
	}

	public static Afficheur getAfficheur() {
		return afficheur;
	}
}

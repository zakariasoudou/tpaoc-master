package fr.istic.aoc.Materiel;

import fr.istic.aoc.command.Command;

public interface Horloge {
	
	void activerPeriodiquement(Command cmd,float periodeEnSecondes);
	
	void activerApresDelai(Command cmd,float delaiEnSecondes);
	
	void desactiver(Command cmd);

	
}

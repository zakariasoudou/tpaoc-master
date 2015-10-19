package fr.istic.aoc.command;

import fr.istic.aoc.controller.Controller;

public class MarqueMesure  implements Command{

private Controller controller;
	
	public MarqueMesure(Controller controller){
		this.controller=controller;
	}

	public void execute() {
		controller.marquerTemps();
		
	}
}

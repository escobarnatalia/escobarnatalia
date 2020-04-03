package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {
	
	private Logic logic;
	
	public Controller(PApplet app) {
		logic =  new Logic(app);
			
	}
	
	
	public void pintarLogic() {
		logic.drawLista(); 
		 
	}
	
	public void ordenarNaturalLogic() {
		logic.ordNatural();
	}
	
	public void ordenParcialLogic() {
		logic.ordParcial();
	}
	public void ordenParcial2Logic() {
		logic.ordParcial2();
	}
	public void ordenParcial3Logic() {
		logic.ordParcial3();
	}
	public void ordenParcial4Logic() {
		logic.ordParcial4();
	}

	
}

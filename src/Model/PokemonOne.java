package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class PokemonOne extends Pokemon{
	
	PImage charmanderFrente;
	PImage charmanderBack;
	
	public PokemonOne(int tipo, int posX, int posY, PApplet app) {
		super(tipo, posX, posY, app);
	
		charmanderFrente = app.loadImage("images/charmander.png");
		charmanderBack = app.loadImage("images/charmanderBack.png");
		
	}
	
	
	public void pintar() {
		
		switch (tipo) {
		case 0:
			app.image(charmanderFrente,posX, posY,60,70);
			break;
		case 1:
			app.image(charmanderBack, posX, posY);
			break;
		
		}
		
		
	}


	

}

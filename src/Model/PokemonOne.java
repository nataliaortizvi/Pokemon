package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class PokemonOne extends Pokemon{
	
	private int posicion = 1;
	
	PImage charmanderFrente;
	PImage charmanderBack;
	
	public PokemonOne(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		
		charmanderFrente = app.loadImage("images/charmander.png");
		charmanderBack = app.loadImage("images/charmanderBack.png");
		
	}
	
	
	public void pintar() {
		
		switch (posicion) {
		case 0:
			app.image(charmanderFrente,posX, posY);
			break;
		case 1:
			app.image(charmanderBack, 100, 200);
			break;
		}
		
		
	}

}

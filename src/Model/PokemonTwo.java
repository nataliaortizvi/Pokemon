package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class PokemonTwo extends Pokemon{
	
	
	PImage squirtleFrente;
	PImage squirtleBack;
	
	public PokemonTwo(int tipo, int posX, int posY, PApplet app) {
		super(tipo, posX, posY, app);
		
		squirtleFrente = app.loadImage("images/squirtle.png");
		squirtleBack = app.loadImage("images/squirtleBack.png");
		
	}
	
	public void pintar() {
		switch (tipo) {
		case 0:
			app.image(squirtleFrente, posX, posY,60,70);
			break;
		case 1:
			app.image(squirtleBack, posX, posY, 250,250);
			break;
		
		}
	}

}

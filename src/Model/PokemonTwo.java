package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class PokemonTwo extends Pokemon{
	
	private int posicion = 0;
	
	PImage squirtleFrente;
	PImage squirtleBack;
	
	public PokemonTwo(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		
		squirtleFrente = app.loadImage("images/squirtle.png");
		squirtleBack = app.loadImage("images/squirtleBack.png");
		
	}
	
	public void pintar() {
		switch (posicion) {
		case 0:
			app.image(squirtleFrente, 200, 100);
			break;
		case 1:
			app.image(squirtleBack, 200, 200);
			break;
		}
	}

}

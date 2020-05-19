package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class PokemonTwo extends Pokemon{
	
	private int posicion = 0;
	
	PImage evvyFrente;
	PImage evvyBack;
	
	public PokemonTwo(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		
		evvyFrente = app.loadImage("images/evvy.png");
		evvyBack = app.loadImage("images/evvyBack");
		
	}
	
	public void pintar() {
		switch (posicion) {
		case 0:
			app.image(evvyFrente, 200, 100);
			break;
		case 1:
			app.image(evvyBack, 200, 200);
			break;
		}
	}

}

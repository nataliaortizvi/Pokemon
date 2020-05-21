package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class PokemonTwo extends Pokemon{
	
	
	PImage squirtleFrente;
	PImage squirtleBack;
	
	public PokemonTwo(int tipo, int posX, int posY, PApplet app) {
		super(tipo, posX, posY, app);
		
		this.nom = "Squirtle";
		this.nivel = 3;
		this.ataque = 3;
		
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
			//nivel
			app.fill(28,82,47);
			app.textSize(16);
			app.text(nivel, 640,310);
			
			//nombre
			app.fill(28,82,47);
			app.textSize(22);
			app.text(nom, 481, 300);
			break;
		case 2:
			app.image(squirtleFrente, posX, posY,150,150);
			//nivel
			app.fill(28,82,47);
			app.textSize(16);
			app.text(nivel, 443,72);
			
			//nombre
			app.fill(28,82,47);
			app.textSize(22);
			app.text(nom, 281,62);
			break;
		
		}
	}

}

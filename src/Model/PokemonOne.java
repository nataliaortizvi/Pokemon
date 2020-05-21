package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class PokemonOne extends Pokemon{
	
	PImage charmanderFrente;
	PImage charmanderBack;
	
	public PokemonOne(int tipo, int posX, int posY, PApplet app) {
		super(tipo, posX, posY, app);
	
		this.nom = "Charmander";
		this.nivel = 2;
		this.ataque = 2;
		
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
			app.image(charmanderFrente,posX, posY, 130,150);
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

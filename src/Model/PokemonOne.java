package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class PokemonOne extends Pokemon{
	
	PImage charmanderFrente;
	PImage charmanderBack;
	
	public PokemonOne(int posX, int posY, PApplet app) {
		super(posX, posY, app);
	
		this.nom = "Charmander";
		this.nivel = 2;
		this.ataque = 20;
		
		charmanderFrente = app.loadImage("images/charmander.png");
		charmanderBack = app.loadImage("images/charmanderBack.png");
		
	}
	
	
	public void pintarAdelante() {
		app.image(charmanderFrente,540,50, 130,150);
		//vida
		app.fill(28,82,47);
		app.rect(306,78,167,17);
		app.fill(this.r, this.g,this.b);
		app.rect(308,80,this.vida,13);
		//nivel
		app.fill(28,82,47);
		app.textSize(16);
		app.text(nivel, 443,72);
		
		//nombre
		app.fill(28,82,47);
		app.textSize(22);
		app.text(nom, 281,62);
	}
	
	public void pintarAtras() {
		app.image(charmanderBack, 60,100);
		//vida
		app.fill(28,82,47);
		app.noStroke();
		app.rect(506,316,167,17);
		
		app.fill(89,210,129);
		app.rect(508,318,this.vida,13);
		
		//nivel
		app.fill(28,82,47);
		app.textSize(16);
		app.text(nivel, 640,310);
		
		//nombre
		app.fill(28,82,47);
		app.textSize(22);
		app.text(nom, 481, 300);
	}

	public void pintarAdelanteChiqui() {
		app.image(charmanderFrente,posX, posY,60,70);
	}
	
	

	

}

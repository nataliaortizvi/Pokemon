package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class PokemonTwo extends Pokemon{
	
	
	PImage squirtleFrente;
	PImage squirtleBack;
	PImage squirtlePokedex;
	
	public PokemonTwo(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		
		this.nom = "Squirtle";
		this.nivel = 3;
		this.ataque = 25;
		this.tipo = 2;
		
		squirtleFrente = app.loadImage("images/squirtle.png");
		squirtleBack = app.loadImage("images/squirtleBack.png");
		squirtlePokedex = app.loadImage("images/tortuPokedex.png");
	}
	
	public void pintarAdelante() {
		app.image(squirtleFrente,530,50,150,150);
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
		app.image(squirtleBack, 60,85, 250,250);
		//vida
		app.fill(28,82,47);
		app.noStroke();
		app.rect(506,316,167,17);
		
		app.fill(this.r, this.g,this.b);
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
		app.image(squirtleFrente, posX, posY,60,70);
	}
	
	public void pintarEnPokedex () {
		app.image(squirtlePokedex, posX, posY);
	}
	


}

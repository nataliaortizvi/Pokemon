package Model;
import processing.core.PApplet;
import processing.core.PImage;
public class PokemonThree extends Pokemon{
		
	PImage snivyFrente;
	PImage snivyBack;
	PImage snivyPokedex;
	
		public PokemonThree(int posX, int posY, PApplet app) {
			super(posX, posY, app);
			
			this.nom = "Snivy";
			this.nivel = 1;
			this.ataque = 15;
			this.tipo = 3;
			
			snivyFrente = app.loadImage("images/snivy.png");
			snivyBack = app.loadImage("images/snivyBack.png");
			snivyPokedex = app.loadImage("images/snivyPokedex.png");
		}
		
		public void pintarAdelante() {
			app.image(snivyFrente,524,45,150,150);
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
			app.image(snivyBack, 95,140);
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
			app.image(snivyFrente, posX, posY,60,70);
		}
		
		public void pintarEnPokedex () {
			app.image(snivyPokedex, posX, posY);
		}
		
		
}

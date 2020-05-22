package Model;
import processing.core.PApplet;
import processing.core.PImage;
public class PokemonThree extends Pokemon{
		
	PImage snivyFrente;
	PImage snivyBack;
	
		public PokemonThree(int tipo, int posX, int posY, PApplet app) {
			super(tipo, posX, posY, app);
			
			this.nom = "Snivy";
			this.nivel = 1;
			this.ataque = 10;
			
			snivyFrente = app.loadImage("images/snivy.png");
			snivyBack = app.loadImage("images/snivyBack.png");
		}
		
		public void pintar() {
			switch (tipo) {
			case 0:
				app.image(snivyFrente, posX, posY,60,70);
				break;
			case 1:
				app.image(snivyBack, posX, posY);
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
				
				break;
			case 2:
				app.image(snivyFrente, posX, posY,150,150);
				//vida
				app.fill(28,82,47);
				app.rect(306,78,167,17);
				app.fill(89,210,129);
				app.rect(308,80,this.vida,13);
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

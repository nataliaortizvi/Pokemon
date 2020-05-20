package Model;
import processing.core.PApplet;
import processing.core.PImage;
public class PokemonThree extends Pokemon{
		
	private int posicion = 0;;
	PImage snivyFrente;
	PImage snivyBack;
	
		public PokemonThree(int posX, int posY, PApplet app) {
			super(posX, posY, app);
			
			snivyFrente = app.loadImage("images/snivy.png");
			snivyBack = app.loadImage("images/snivyBack.png");
		}
		
		public void pintar() {
			switch (posicion) {
			case 0:
				app.image(snivyFrente, posX, posY,60,70);
				break;
			case 1:
				app.image(snivyBack, posX, posY);
				break;
			}
		}
}

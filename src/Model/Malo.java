package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Malo extends Personaje {
	int cambiarMalo;
	PImage maloFrente;
	PImage maloBack;
	PImage maloPerfilDer;
	PImage maloPerfilIzq;
	public Malo (int posX, int posY, int tam, PApplet app) {
		super (posX, posY, tam, app);
		maloFrente = app.loadImage("images/maloFront.png");
		maloPerfilDer = app.loadImage("images/maloPerfilDer.png");
		maloPerfilIzq = app.loadImage("images/Malo Perfil.png");
	}
	
	public void pintar () {
		switch(cambiarMalo){
		case 1: app.image(maloFrente,posX,posY,100,50);
		break;
		case 2: app.image(maloBack,posX,posY,100,50);
		break;
		case 3: app.image(maloPerfilDer,posX,posY,100,50);
		break;
		case 4: app.image(maloPerfilIzq,posX,posY,100,50);
		break;
		}
		
	}
	
	public void mover () {
		
	}
	
	public void atrapar () {
		
	}
	

}

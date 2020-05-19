package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Bueno extends Personaje {
	PImage perFrente;
	PImage perBack;
	PImage perPerfil;
	PImage perPerfilDer;
	int cambiar;
	
	
	public Bueno (String nom, int posX, int posY, int tam, PApplet app) {
		super (posX, posY, tam, app);
		
		cambiar = 1;
		
		perFrente = app.loadImage("images/buenoFront.png");
		perBack = app.loadImage("images/buenoBack.png");
		perPerfil = app.loadImage("images/buenoperfil.png");
		perPerfilDer = app.loadImage("images/buenoperfilDer.png");
	}
	
	
	public void pintar () {
		switch(cambiar){
		case 1: app.image(perFrente,posX,posY,50,100);
		break;
		case 2: app.image(perBack,posX,posY,100,50);
		break;
		case 3: app.image(perPerfil,posX,posY,100,50);
		break;
		case 4: app.image(perPerfilDer,posX,posY,100,50);
		break;
			
		}
		
		
		
		
		
	}
	


	public void moverDer () {
		
		
	}
	
	public void moverIzq () {
		
	}
	
	public void moverArr () {
		
	
	}
	
	public void moverAba () {
		
		
	}
	
	public void atrapar () {
		
	}
	
	

}

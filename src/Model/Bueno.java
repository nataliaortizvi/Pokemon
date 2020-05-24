package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Bueno extends Personaje {
	PImage perFrente;
	PImage perBack;
	PImage perPerfil;
	PImage perPerfilDer;
	int cambiar;
	int dir;

	

	public Bueno ( int posX, int posY, PApplet app) {

		super (posX, posY,app);
		this.vel = 50;
		
		
		cambiar = 1;
	
		
		perFrente = app.loadImage("images/buenoFront.png");
		perBack = app.loadImage("images/buenoBack.png");
		perPerfil = app.loadImage("images/buenoperfil.png");
		perPerfilDer = app.loadImage("images/buenoperfilDer.png");
		
	}
	
	@Override
	
	
	
	
	
	public void pintar () {
		switch(cambiar){

		case 1: app.image(perFrente,posX,posY,30,75);
		break;
		case 2: app.image(perBack,posX,posY,30,75);
		break;
		case 3: app.image(perPerfil,posX,posY,30,75);
		break;
		case 4: app.image(perPerfilDer,posX,posY,30,75);
		break;
			
		}
		
		
		
		
		
	}

	public void moverDer () {
		if (this.posX > 0 || this.posX < 800) {
			this.posX += this.vel;
			this.cambiar = 4;
		} else {
			
		}
		
	}
	
	public void moverIzq () {
		if (this.posX > 0 || this.posX < 800) {
            this.posX -= this.vel;
            this.cambiar = 3;
        }
	}
	
	public void moverArr () {
		if (this.posY > 0 || this.posY < 700) {
            this.posY -= this.vel;
            this.cambiar = 2;
        }
	
	}
	
	public void moverAba () {
		 if(this.posY > 0 || this.posY < 700){
	            this.posY += this.vel;
	            this.cambiar = 1;
	        }
		
	}
	


	public PImage getPerFrente() {
		return perFrente;
	}


	public PImage getPerBack() {
		return perBack;
	}


	public PImage getPerPerfil() {
		return perPerfil;
	}


	public PImage getPerPerfilDer() {
		return perPerfilDer;
	}


	public int getCambiar() {
		return cambiar;
	}


	public int getDir() {
		return dir;
	}


	public void setPerFrente(PImage perFrente) {
		this.perFrente = perFrente;
	}


	public void setPerBack(PImage perBack) {
		this.perBack = perBack;
	}


	public void setPerPerfil(PImage perPerfil) {
		this.perPerfil = perPerfil;
	}


	public void setPerPerfilDer(PImage perPerfilDer) {
		this.perPerfilDer = perPerfilDer;
	}


	public void setCambiar(int cambiar) {
		this.cambiar = cambiar;
	}


	public void setDir(int dir) {
		this.dir = dir;
	}


	
	
	

}

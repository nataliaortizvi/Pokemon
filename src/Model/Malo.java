package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Malo extends Personaje implements Runnable {
	int cambiarMalo;
	PImage maloFrente;
	PImage maloBack;
	PImage maloPerfilDer;
	PImage maloPerfilIzq, mensajeMalo;
	int dir;
	public Malo (int posX, int posY, PApplet app) {
		super (posX, posY, app);
		maloFrente = app.loadImage("images/maloFront.png");
		mensajeMalo = app.loadImage("images/mensajeMalo.png");
		//maloPerfilDer = app.loadImage("images/maloPerfilDer.png");
		//maloPerfilIzq = app.loadImage("images/Malo Perfil.png");
		this.dir = 1;
		this.vel = 3;
		cambiarMalo = 1;
	}
	public void derrotado () {
		app.image(mensajeMalo,300,50,400,200);
	}
	
	public void pintar () {
		switch(cambiarMalo){
		case 1: app.image(maloFrente,posX,posY,40,70);
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
		
		if(this.dir == 1) {
			this.posX += this.vel;
			
			
			if(this.posX > 700) {
				this.dir = 2;
				
				
			}
			
			if(this.posX < 200) {
				this.dir = 2;
			}
		}
		if(this.dir == 2) {
			this.posY += this.vel;
			
			if(this.posY >350) {
				this.dir = 1;
				this.vel *= -1;
			}
			if(this.posY <300) {
				this.dir = 1;
				this.vel *= -1;
				
			}
		}
		
	}
	
	
	public void atrapar () {
		
	}


	public void run() {
		// TODO Auto-generated method stub
		mover();
	}
	

}

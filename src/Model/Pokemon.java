package Model;

import processing.core.PApplet;

public abstract class Pokemon implements Runnable{
	
	String nom;
	String tipo;
	int posicion;
	
	int nivel;
	int posX;
	int posY;
	int ataque;
	int vida, vel, dir;
	PApplet app;
	
	public Pokemon(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.nivel = 2;
		this.ataque = 3;
		this.vida = 3;
		this.app = app;
		this.vel = 3;
		this.dir = 1;
		this.posicion = 0;
	}
	
	public void run() {
		mover();
	}
	
	
	//metodos
	public void mover() {
		if(this.dir == 1) {
			this.posX += this.vel;
			
			if(this.posX > 280) {
				this.dir = 2;
			}
			
			if(this.posX < 10) {
				this.dir = 2;
			}
		}
		if(this.dir == 2) {
			this.posY += this.vel;
			
			if(this.posY >180) {
				this.dir = 1;
				this.vel *= -1;
			}
			if(this.posY < 20) {
				this.dir = 1;
				this.vel *= -1;
			}
		}
		
		
		
		
	}
	public void pintar() {
		
	}
	
	public void atacar() {
		
	}
	
	public void danio() {
	}

}

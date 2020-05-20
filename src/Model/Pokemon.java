package Model;

import processing.core.PApplet;

public abstract class Pokemon implements Runnable{
	
	String nom;
	int tipo;
	int posicion;
	
	int nivel;
	int posX;
	int posY;
	int ataque;
	int vida, vel, dir;
	PApplet app;
	
	public Pokemon(int tipo, int posX, int posY, PApplet app) {
		this.tipo = tipo;
		this.posX = posX;
		this.posY = posY;
		this.nivel = 2;
		this.ataque = 3;
		this.vida = 3;
		this.app = app;
		this.vel = 3;
		this.dir = 1;
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
	
	
	
	

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void run() {
		mover();
	}
	public String getNom() {
		return nom;
	}

	

	public int getPosicion() {
		return posicion;
	}

	public int getNivel() {
		return nivel;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getVida() {
		return vida;
	}

	public int getVel() {
		return vel;
	}

	public int getDir() {
		return dir;
	}

	public PApplet getApp() {
		return app;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

}

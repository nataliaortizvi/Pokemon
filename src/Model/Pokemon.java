package Model;

import processing.core.PApplet;

public abstract class Pokemon {
	
	String nom;
	String tipo;
	
	int nivel;
	int posX;
	int posY;
	int ataque;
	int vida;
	PApplet app;
	
	public Pokemon(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.nivel = 2;
		this.ataque = 3;
		this.vida = 3;
		this.app = app;
	}
	
	
	//metodos
	public void pintar() {
		
	}
	
	public void atacar() {
		
	}
	
	public void danio() {
	}

}

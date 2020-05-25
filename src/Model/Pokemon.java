package Model;

import processing.core.PApplet;

public abstract class Pokemon implements Runnable, Comparable <Pokemon> {
	
	String nom;
	int tipo;
	int posicion;
	int nivel;
	int posX;
	int posY;
	int ataque;
	int vida, vel, dir;
	PApplet app;
	boolean estaEnBatalla;
	int r,g,b;
	
	public Pokemon(int posX, int posY, PApplet app) {
		
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		this.vel = 5;
		this.vida = 163;
		this.dir = 1;
		this.estaEnBatalla = false;
		this.r = 89;
		this.g = 210;
		this.b = 129;
	}
	
	public void run() {
		mover();
		
		if(estaEnBatalla == true) {
		try {
			Thread.sleep(1000);
			serAtacado();
			//System.out.println("holi");
		} catch (InterruptedException e) {
			e.printStackTrace();
			
			}
		}
	}
	
	//METODOS
	public void pintarAdelante() {
		
	}
	
	public void pintarAtras() {
		
	}

	public void pintarAdelanteChiqui() {
	
	}
	
	public void pintarEnPokedex() {
		
	}
	
	public void serAtacado() {
		if(this.vida > 10) {
			
			this.vida -= this.ataque;
		}
	}
	
	
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
	
	public int compareTo (Pokemon nuevo) {
		return this.tipo - nuevo.getTipo();
	}
		
	
	public boolean isEstaEnBatalla() {
			return estaEnBatalla;
	}

	public void setEstaEnBatalla(boolean estaEnBatalla) {
			this.estaEnBatalla = estaEnBatalla;
	}

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}
	
	public int getB() {
		return b;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void setG(int g) {
		this.g = g;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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

package Model;

import processing.core.PApplet;
import processing.core.PImage;


public abstract class Personaje implements Runnable{
	
	String nom;
	public int posX;
	public int posY;
	public int fecha;
	public int vel;
	public PApplet app;
	

	int movPokeG;
	PImage pokebolita, capturacion;

	
	public Personaje (int posX, int posY,  PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.vel = 50;
		this.app = app;

		this.pokebolita = app.loadImage("images/pokebola.png");
		this.capturacion = app.loadImage("images/capturaste.png");
		
	}
	
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
			atrapacionLograda();
			//System.out.println("holi");
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
	public void pintar () {
		
	}
	
	public void atrapacionLograda() {
		app.image(this.capturacion,50,190, 700,100);
	}
	
	public void atrapacion() {
		this.movPokeG = (int) app.random(190,200);
		app.image(pokebolita,500,30,movPokeG,movPokeG);
	}
	
	//Getters and setters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	

}

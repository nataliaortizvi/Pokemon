package Model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Personaje {
	
	String nom;
	public int posX;
	public int posY;
	public int fecha;
	public int vel;
	public int tam;
	public PApplet app;

	
	public Personaje (int posX, int posY, int tam, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam = 50;
		this.vel = 2;
		this.app = app;
		
	}
	
	public void pintar () {
		
	}
	
	public void atrapar () {
		
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

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	

}

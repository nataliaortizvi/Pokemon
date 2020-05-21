package Model;

import processing.core.PApplet;

public class User {
	
	PApplet app;
	String nombre;
	
	public User(String nombre, PApplet app) {
		this.app = app;
		this.nombre = nombre;
	}

}

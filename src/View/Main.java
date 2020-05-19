package View;


import Model.PokemonOne;

import Controller.ControllerC;

import processing.core.PApplet;

public class Main extends PApplet {
	

	PokemonOne poke;

	ControllerC controllerView;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}
	

	public void settings() {
		size(800,500);
		
		
	}
	
	public void setup() {

		poke = new PokemonOne (100, 100, this);

		controllerView = new ControllerC(this);

		
	}
	
	public void draw() {
		background(131,112,199);

		rect ( 20, 20, 20, 20);
		poke.pintar();
		
		

		
		controllerView.iniciarControl();

		
		
	}
	
	public void mousePressed() {
		controllerView.iniciarMouse();
		
	}
	
	public void keyPressed() {
		
		
	}
	

}

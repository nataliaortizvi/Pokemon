package View;

import Model.PokemonOne;
import processing.core.PApplet;

public class Main extends PApplet {
	
	PokemonOne poke;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}
	

	public void settings() {
		size(800,500);
		//odio esto :(
		
	}
	
	public void setup() {
		poke = new PokemonOne (100, 100, this);
		
	}
	
	public void draw() {
		background(131,112,199);
		rect ( 20, 20, 20, 20);
		poke.pintar();
		
		
		
		
	}
	
	public void mousePressed() {
		
		
	}
	
	public void keyPressed() {
		
		
	}
	

}

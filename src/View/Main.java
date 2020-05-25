package View;

import Controller.ControllerC;
import processing.core.PApplet;
import processing.sound.SoundFile;

public class Main extends PApplet {
	
	ControllerC controllerView;
	
	
	SoundFile sonidoInicio;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}
	

	public void settings() {
		size(800,500);
		
		
	}
	
	public void setup() {
		controllerView = new ControllerC(this);
		
		//sonidos
		sonidoInicio = new SoundFile(this,"sound/POKEINICIO.mp3");
	
		
	}
	
	public void draw() {
		background(131,112,199);
		
		controllerView.iniciarControl();
		
		
	}
	
	public void mousePressed() {
		controllerView.iniciarMouse();
		
	}
	
	public void keyPressed() {
			controllerView.iniciarTeclado();
			controllerView.sortListController(key);
		
	
	}
	

}

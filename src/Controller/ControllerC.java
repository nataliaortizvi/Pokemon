package Controller;

import Model.Juego;
import processing.core.PApplet;

public class ControllerC {
	PApplet app;
	Juego jueguito;

	public ControllerC(PApplet app) {
		this.jueguito = new Juego(app);
	}
	
	public void iniciarControl() {
		jueguito.iniciarTodo();
		
	}
	
	public void iniciarMouse() {
		jueguito.elMouse();
		
	}
	
	public void iniciarTeclado() {
		jueguito.teclado();
	}
	
	public void sortListController (char c) {
		jueguito.sortList(c);
	}

	
	
	
	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public Juego getJueguito() {
		return jueguito;
	}

	public void setJueguito(Juego jueguito) {
		this.jueguito = jueguito;
	}
	
}

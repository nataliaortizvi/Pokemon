package Model;

import java.util.ArrayList;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Juego {
	
	PApplet app;
	Bueno perso;
	PImage pantInicio, inicioBlanco, inicioR, pantRegistro, pantLab, pantElige, 
		   pantCampo, pantBatalla, pantPokedex;
	
	ControlP5 control;
	Textfield nombre;
	PFont font;
	
	ArrayList<Jugador> jugadores;
	
	int pantalla;
	
	public Juego(PApplet app) {
		this.app = app;
		perso = new Bueno("hey",400,400,50,app);
		
		//imagenes
		pantInicio= app.loadImage("images/inicio.png");
		inicioBlanco= app.loadImage("images/inicioBlanco.png");
		inicioR= app.loadImage("images/iniciarRegistro.png");
		
		pantRegistro= app.loadImage("images/registro.png");
		pantLab= app.loadImage("images/laboratorio.png");
		pantElige= app.loadImage("images/elige0.png");
		pantCampo= app.loadImage("images/campo.png");
		pantBatalla= app.loadImage("images/batalla.png");
		pantPokedex= app.loadImage("images/pokedex.png");
		
		pantalla = 0;
		
		//cosas de registro
		
		
		control = new ControlP5(app);
		font = app.createFont ("arial", 27);
	
		nombre = control.addTextfield("")
				.setPosition(85,201)
				.setSize(297,69)
				.setColor(app.color(255))
				.setColorBackground(app.color(25,25,25,5))
				.setColorCaptionLabel(app.color(255))
				.setFont(font)
				;
		
		jugadores = new ArrayList<Jugador>();
		
	}
	
	//metodos
	
	public void cargarUsuarios() {
		
		
		
	}
	
	
	
	
	
	
	public void iniciarTodo() {
		switch(pantalla) {
		case 0:
			//inicio
			app.image(pantInicio,0,0,800,500);
			nombre.hide();

			if(app.mouseX > 247 && app.mouseX < 551 && app.mouseY > 414 && app.mouseY < 457) {
				app.image(inicioBlanco,230,407,340,50);
			}
			
			break;
		case 1:
			//registro
			app.image(pantRegistro,0,0,800,500);
			nombre.show();
			
			if(app.mouseX > 178 && app.mouseX < 295 && app.mouseY > 312 && app.mouseY < 355) {
				app.image(inicioR,175,305,140,50);
			}
			
			
			
			break;
		case 2:
			//lab
			app.image(pantLab,0,0,800,500);
			nombre.hide();
			
			perso.pintar();
			
			
			break;
		case 3:
			//elige
			app.image(pantElige,0,0,800,500);
			
			break;
		case 4: 
			//campo
			app.image(pantCampo,0,0,800,500);
			
			break;
		case 5:
			//batalla
			app.image(pantBatalla,0,0,800,500);
			
			break;
		case 6:
			//pokedex
			app.image(pantPokedex,0,0,800,500);
			
			break;
		}
		
		app.text("x="+ app.mouseX + "y=" + app.mouseY, app.mouseX, app.mouseY);
		
		
	}
	
	public void elMouse() {
		switch(pantalla) {
		case 0:
			//inicio

			if(app.mouseX > 247 && app.mouseX < 551 && app.mouseY > 414 && app.mouseY < 457) {
				pantalla ++;
			}
			
			break;
		case 1:
			//registro
			if(app.mouseX > 178 && app.mouseX < 295 && app.mouseY > 312 && app.mouseY < 355) {
				pantalla ++;
			}
			
			break;
		case 2:
			//lab
			
			break;
		case 3:
			//escoge
			
			break;
		case 4: 
			//campo
			
			break;
		case 5:
			//batalla
			
			break;
		case 6:
			//pokedex
			
			break;
		}
		
	}
	
	
	
	
	
	
	
	

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public PImage getPantInicio() {
		return pantInicio;
	}

	public void setPantInicio(PImage pantInicio) {
		this.pantInicio = pantInicio;
	}

	public PImage getPantRegistro() {
		return pantRegistro;
	}

	public void setPantRegistro(PImage pantRegistro) {
		this.pantRegistro = pantRegistro;
	}

	public PImage getPantLab() {
		return pantLab;
	}

	public void setPantLab(PImage pantLab) {
		this.pantLab = pantLab;
	}

	public PImage getPantElige() {
		return pantElige;
	}

	public void setPantElige(PImage pantElige) {
		this.pantElige = pantElige;
	}

	public PImage getPantCampo() {
		return pantCampo;
	}

	public void setPantCampo(PImage pantCampo) {
		this.pantCampo = pantCampo;
	}

	public PImage getPantBatalla() {
		return pantBatalla;
	}

	public void setPantBatalla(PImage pantBatalla) {
		this.pantBatalla = pantBatalla;
	}

	public PImage getPantPokedex() {
		return pantPokedex;
	}

	public void setPantPokedex(PImage pantPokedex) {
		this.pantPokedex = pantPokedex;
	}

	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}

}

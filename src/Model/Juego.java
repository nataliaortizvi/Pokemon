package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Juego {
	
	PApplet app;
	PImage pantInicio, inicioBlanco, pantRegistro, pantLab, pantElige, 
		   pantCampo, pantBatalla, pantPokedex;
	
	int [][] mapa = { {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},
	                  {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},
	                  {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},
	                  {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},
	                  {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
	                  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	                  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	                  {0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0},
	                  {0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0},
	                  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}   };
	
	int pantalla;
	
	public Juego(PApplet app) {
		this.app = app;
		pantInicio= app.loadImage("images/inicio.png");
		inicioBlanco= app.loadImage("images/inicioBlanco.png");
		pantRegistro= app.loadImage("images/registro.png");
		pantLab= app.loadImage("images/laboratorio.png");
		pantElige= app.loadImage("images/elige0.png");
		pantCampo= app.loadImage("images/campo.png");
		pantBatalla= app.loadImage("images/batalla.png");
		pantPokedex= app.loadImage("images/pokedex.png");
		
		pantalla = 0;
		
		
		       
	}
	
	
	//metodos
	public void iniciarTodo() {
		switch(pantalla) {
		case 0:
			//inicio
			app.image(pantInicio,0,0,800,500);

			if(app.mouseX > 247 && app.mouseX < 551 && app.mouseY > 414 && app.mouseY < 457) {
				app.image(inicioBlanco,230,407,340,50);
			}
			
			break;
		case 1:
			//inicio
			app.image(pantRegistro,0,0,800,500);
			
			break;
		case 2:
			//inicio
			app.image(pantLab,0,0,800,500);
			
			break;
		case 3:
			//inicio
			app.image(pantElige,0,0,800,500);
			
			break;
		case 4: 
			//inicio
			app.image(pantCampo,0,0,800,500);
			
			break;
		case 5:
			//inicio
			app.image(pantBatalla,0,0,800,500);
			
			break;
		case 6:
			//inicio
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
			//inicio
			
			break;
		case 2:
			//inicio
			
			break;
		case 3:
			//inicio
			
			break;
		case 4: 
			//inicio
			
			break;
		case 5:
			//inicio
			
			break;
		case 6:
			//inicio
			
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

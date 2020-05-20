package Model;

import java.util.ArrayList;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Juego {
	boolean pokeelige,charman,planta,tortu;

	PApplet app;


	
	int [][] mapa = { {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},
	                  {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},
	                  {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},
	                  {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},
	                  {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
	                  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	                  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	                  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	                  {0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1},
	                  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}   };

	Bueno perso;
	PImage pantInicio, inicioBlanco, inicioR, pantRegistro, pantLab, pantElige, 
		   pantCampo, pantBatalla, pantPokedex,aceptar,pokebolita,charmanderF,SnivyF,squirtleF;
	
	ControlP5 control;
	Textfield nombre;
	PFont font;
	
	ArrayList<Jugador> jugadores;
	
	int pantalla;
	
	int xLogica;
	int yLogica;
	int seMovio;
	
	Bueno ash;
	
	public Juego(PApplet app) {
		this.app = app;
		pokeelige = false;
		charman = false; 
		tortu = false;
		planta = false;
		 
		perso = new Bueno(400,400,50,app);
		charmanderF = app.loadImage("images/charmander.png");
		SnivyF = app.loadImage("images/snivy.png");
		squirtleF = app.loadImage("images/squirtle.png");
		
		
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
		

		ash = new Bueno (600, 150, 50, app);
		
		
		pantalla = 0;
		xLogica = 12;
		yLogica = 4;
		seMovio = 1;
		
		
		       

		aceptar = app.loadImage("images/Aceptar.png");
		pokebolita = app.loadImage("images/pokebolita.png");
		
		
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
			if(app.mouseX > 360 && app.mouseX < 480 && app.mouseY > 195 && app.mouseY <260) {
				app.image(pokebolita,350,195,50,50);
				app.image(pokebolita,353+48,195,50,50);
				app.image(pokebolita,353+48+48,195,50,50);
			}
			
			perso.pintar();
			
			
			
			break;
		case 3:
			//elige
			
			app.image(pantElige,0,0,800,500);
			if(app.mouseX > 590 && app.mouseX < 690 && app.mouseY > 202 && app.mouseY <315) {
			
				app.image(charmanderF,585, 170);
			}
			if(charman == true) {
				
				app.image(charmanderF,585, 170);
			}
			if(app.mouseX > 340 && app.mouseX < 470 && app.mouseY > 195 && app.mouseY <305) {
			
			 app.image(SnivyF,310,90);
				
			}
			if(planta == true) {
				
				 app.image(SnivyF,310,90);
					
				}
			if(app.mouseX > 120 && app.mouseX < 260 && app.mouseY > 195 && app.mouseY <305) {
				app.image(squirtleF,120, 170);
			}
			if(tortu == true) {
				app.image(squirtleF,120, 170);
			}
			
			if(pokeelige == true) {
				app.image(aceptar,380,415,180,60);
			}
			
			
			
			nombre.hide();
			
			
			
			
			break;
		case 4: 
			//campo
			app.image(pantCampo,0,0,800,500);
			ash.pintar();
			
			
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
		case 2: //lab
			if(app.mouseX > 360 && app.mouseX < 480 && app.mouseY > 195 && app.mouseY <260) {
				pantalla ++;
			}
			
			
			break;
		case 3:
			//escoge
			
			
			if(app.mouseX > 590 && app.mouseX < 690 && app.mouseY > 202 && app.mouseY <315) {
				charman = true;
				planta = false;
				tortu = false;
				
            pokeelige = true;
			}
			if(app.mouseX > 340 && app.mouseX < 470 && app.mouseY > 195 && app.mouseY <305) {
			
				pokeelige = true;
				planta = true;
				charman = false;
				tortu = false;
				
			}
			if(app.mouseX > 120 && app.mouseX < 260 && app.mouseY > 195 && app.mouseY <305) {
				pokeelige = true;
				tortu = true;
				charman = false;
				planta = false;
			}
			if(pokeelige == true) {
				pokeelige = true;
			}
			
			
			
			if(app.mouseX > 384 && app.mouseX < 440 && app.mouseY > 400 && app.mouseY <500 && pokeelige == true) {
				
				pantalla  ++;
				
			}
				
			
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
	
	public void teclado () {
		switch (pantalla) {
		case 4:
			
			if (app.keyCode == app.DOWN) {
				if (this.mapa[yLogica + seMovio][xLogica] == 0) {
					yLogica += seMovio;
					ash.moverAba();
				} 
			}
			
			if (app.keyCode == app.UP) {	
				if (this.mapa[yLogica - seMovio][xLogica] == 0) {
					yLogica -= seMovio;
					ash.moverArr();
				}
			}
			
			if (app.keyCode == app.LEFT) {
				if (this.mapa[yLogica][xLogica - seMovio] == 0) {
					xLogica -= seMovio;
					ash.moverIzq();
				}
				
			}
			
			if (app.keyCode == app.RIGHT) {	
				if (this.mapa[yLogica][xLogica + seMovio] == 0) {
					xLogica += seMovio;
					ash.moverDer();
				}
			}
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

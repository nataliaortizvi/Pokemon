package Model;

import java.util.ArrayList;
import java.util.LinkedList;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Juego {

	int pokemonAleatorio;

	boolean pokeelige,charman,planta,tortu,pokedexSalir;

	PApplet app;
	
	//mapa
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
	PImage pantInicio, inicioBlanco, inicioR, pantRegistro, pantLab, pantElige,pokeSalir, 
		   pantCampo, pantBatalla, pantPokedex,aceptar,pokebolita,charmanderF,SnivyF,squirtleF,
		   pokebola;
	
	ControlP5 control;
	Textfield nombre;
	PFont font;
	
	LinkedList<Pokemon> pokemonsitos, pokemonsotes;
	LinkedList<Pokemon> mios;
	
	ArrayList<Jugador> jugadores;
	
	int pantalla;
	
	int xLogica;
	int yLogica;
	int seMovio;
	int xLab;
	int yLab;
	int moveLab;
	
	Bueno ash;
	
	public Juego(PApplet app) {
		pokedexSalir = false;
		this.app = app;
		pokeelige = false;
		charman = false; 
		tortu = false;
		planta = false;
		 
		perso = new Bueno(200,300,app);
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
		aceptar = app.loadImage("images/Aceptar.png");
		pokebolita = app.loadImage("images/pokebolita.png");
		pokeSalir = app.loadImage("images/pokeSalir.png");
		pokebola = app.loadImage("images/pokebola.png");

		

		//variables juego
		ash = new Bueno (600, 150, app);
		
		pokeelige = false;
		charman = false; 
		tortu = false;
		planta = false;
		
		perso = new Bueno(400,400,app);
		charmanderF = app.loadImage("images/charmander.png");
		SnivyF = app.loadImage("images/snivy.png");
		squirtleF = app.loadImage("images/squirtle.png");
		pantalla = 0;
		xLogica = 12;
		yLogica = 4;
		seMovio = 1;
		

		xLab = 4;
		yLab = 6;
		moveLab = 1;

		System.out.println();
		pokemonAleatorio = (int) Math.floor(Math.random()*3);
		pokemonsitos = new LinkedList<Pokemon>();
		pokemonsotes = new LinkedList<Pokemon>();
		mios = new LinkedList<Pokemon>();
	

		
		for(int i = 0; i < 1; i++) {
			if(pokemonAleatorio == 0) {
				pokemonsitos.add(new PokemonOne(0,50,50,app));
				pokemonsotes.add(new PokemonOne(2,540,50,app));
				
			}
			if(pokemonAleatorio == 1) {
				pokemonsitos.add(new PokemonTwo(0,50,50,app));
				pokemonsotes.add(new PokemonTwo(2,530,50,app));
			}
			if(pokemonAleatorio == 2) {
				pokemonsitos.add(new PokemonThree(0,50,50,app));
				pokemonsotes.add(new PokemonThree(2,524,45,app));
			}
		}
		
		

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
				app.image(pokebolita,353+45,195,50,50);
				app.image(pokebolita,353+45+45,195,50,50);
			}
			
			perso.pintar();
			
			
			
			break;
		case 3:
			//elige
			nombre.hide();
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
			
			
			break;
		case 4: 
			//campo
			nombre.hide();
			app.image(pantCampo,0,0,800,500);
			ash.pintar();
			
			if(app.mouseX > 16 && app.mouseX < 85 && app.mouseY > 415 && app.mouseY <480) {
				 app.image(pokebola,15,413,70,70);
		        }  
			
			
			for(int i = 0; i < pokemonsitos.size(); i++) {
			pokemonsitos.get(i).pintar();
			new Thread (pokemonsitos.get(i)).start();
			
			if(PApplet.dist(ash.getPosX(), ash.getPosY(), pokemonsitos.get(i).getPosX(), pokemonsitos.get(i).getPosY())<50) {
				pantalla = 5;
				
			}
		}
		
			break;
		case 5:
			//batalla
			nombre.hide();
			app.image(pantBatalla,0,0,800,500);
			app.fill(28,82,47);
			app.noStroke();
			app.rect(506,316,167,17);
			app.rect(306,80,167,17);
			
			
			for(int j = 0; j < mios.size(); j++) {
				mios.get(j).pintar();
			}
			
			for(int i = 0; i < pokemonsotes.size(); i++) {
				pokemonsotes.get(i).pintar();
			}
			
			
			
			
			break;
		case 6:
			//pokedex
			nombre.hide();
			app.image(pantPokedex,0,0,800,500);
			
			app.image(pokeSalir,560,417,230,70);
			
			if(app.mouseX > 547 && app.mouseX < 797 && app.mouseY > 410 && app.mouseY <490 ) {
				app.image(pokeSalir,547,410,250,80);
			}
			
			
			break;
		}
		
		app.fill(0);
		app.textSize(10);
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
			
			
			if(app.mouseX > 573 && app.mouseX < 740 && app.mouseY > 415 && app.mouseY <478) {
				pantalla = 2;
			}
			
			if(app.mouseX > 384 && app.mouseX < 555 && app.mouseY > 415 && app.mouseY <478 && pokeelige == true) {
				
				for(int j = 0; j < 1; j++) {
					
					if(tortu == true) {
						mios.add(new PokemonTwo(1,60,85,app));
					}	
					if(charman == true) {
						mios.add(new PokemonOne(1,60,100,app));
					}
					if(planta == true) {
						mios.add(new PokemonThree(1,95,140,app));
					}
				}
				pantalla  ++;
				
			}
			
			
			
				
			
			break;
		case 4: 
			//campo
            if(app.mouseX > 16 && app.mouseX < 85 && app.mouseY > 415 && app.mouseY <480) {
			pantalla =6;
			System.out.println("pokeke");
        }                              
			
			break;
		case 5:
			//batalla
			
			break;
		case 6:
			//pokedex
			if(app.mouseX > 580 && app.mouseX < 755 && app.mouseY > 420 && app.mouseY <488 ) {
				pantalla  =4;
				
			}
			
			break;
		}
		
	}
	
	public void teclado () {
		if (perso.getPosX() > 0 && perso.getPosX() < 800 && perso.getPosY() > 0 && perso.getPosY() < 500 ||
				ash.getPosX() > 0 && ash.getPosX() < 800 && ash.getPosY() > 0 && ash.getPosY() < 500) {
			
			switch (pantalla) {
			case 2:
				if (app.keyCode == app.UP) {
					perso.moverArr();
				}
				
				if (app.keyCode == app.DOWN) {
					perso.moverAba();
				}
				
				if (app.keyCode == app.LEFT) {
					perso.moverIzq();
				}
				
				if (app.keyCode == app.RIGHT) {
					perso.moverDer();
				}
				break;
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

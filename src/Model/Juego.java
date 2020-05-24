package Model;

import java.util.ArrayList;
import java.util.LinkedList;

import LaExcepcion.ExceptionNombre;
import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Juego {

	int pokemonAleatorio;

	boolean pokeelige,charman,planta,tortu,pokedexSalir,derrotado;

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
	
	int [] [] mapa1 = { {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
						{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
						{1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1},
						{1,1,1,1,0,0,0,1,1,1,0,0,0,0,0,1},
						{1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1}, 
						{1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1},
						{1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1},
						{1,1,1,0,0,0,1,0,0,1,0,0,0,1,1,1},
						{1,0,0,0,0,0,1,0,0,1,0,0,0,1,1,1},
						{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
						
	};

	Bueno perso;
	PImage pantInicio, inicioBlanco, inicioR, pantRegistro, pantLab, pantElige,pokeSalir, 

		   pantCampo, pantBatalla, pantPokedex,aceptar,pokebolita,charmanderF,SnivyF,squirtleF, pokebola,escribeNombre,
		   ataqueR, superAtaqueR, exit, captura;
		   

	ControlP5 control;
	String usuario;
	PFont font;
	Malo brian;
	
	LinkedList<Pokemon> pokemonsitos, pokemonsotes;
	LinkedList<Pokemon> mios;
	
	ArrayList <User> jugadores;
	
	int pantalla; 
	boolean seguir, clicR, escribaNombre, salir;
	
	int xLogica;
	int yLogica;
	int seMovio;
	int xLab;
	int yLab;
	int moveLab;
	int posXash;
	
	boolean usarPokebola,pokebolaUsada, superClic, puedeUsar, usado;
	int movPoke;
	
	Bueno ash;
	PokemonFour evvy;
	
	int puntos;
	
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
		exit = app.loadImage("images/exit.png");
		captura = app.loadImage("images/capturaste.png");
		
		escribeNombre = app.loadImage("images/escribeNombre.png");

		ataqueR = app.loadImage("images/ataque.png");
		superAtaqueR = app.loadImage("images/superAtaque.png");

		

		//variables juego
		ash = new Bueno (600, 150, app);
		evvy = new PokemonFour(2,530,app);
		
		pokeelige = false;
		charman = false; 
		tortu = false;
		planta = false;
		salir = false;
		
		perso = new Bueno(350,400,app);
		charmanderF = app.loadImage("images/charmander.png");
		SnivyF = app.loadImage("images/snivy.png");
		squirtleF = app.loadImage("images/squirtle.png");
		
		
		pantalla = 0; //////////////////////////PANTALLA//////////////////////////////////////////////////////////////
		
		xLab = 7;
		yLab = 8;
		moveLab = 1;
		
		xLogica = 12;
		yLogica = 4;
		seMovio = 1;
		
		clicR = false;
		seguir = false;
		escribaNombre = false;
		

		

		System.out.println();
		pokemonAleatorio = (int) Math.floor(Math.random()*3);
		pokemonsitos = new LinkedList<Pokemon>();
		
		mios = new LinkedList<Pokemon>();
	
		
		for(int i = 0; i < 1; i++) {
			if(pokemonAleatorio == 0) {
				pokemonsitos.add(new PokemonOne(50,50,app));
				//pokemonsotes.add(new PokemonOne(2,540,50,app));
				
			}
			if(pokemonAleatorio == 1) {
				pokemonsitos.add(new PokemonTwo(50,50,app));
				//pokemonsotes.add(new PokemonTwo(2,530,50,app));
			}
			if(pokemonAleatorio == 2) {
				pokemonsitos.add(new PokemonThree(50,50,app));
				//pokemonsotes.add(new PokemonThree(2,524,45,app));
			}
		}
		
		
		brian = new Malo(200,300,app);

		//cosas de registro
		
		
		control = new ControlP5(app);
		font = app.createFont ("arial", 27);

	
		control.addTextfield("usuarioImput")
				.setPosition(85,201)
				.setSize(297,69)
				.setColor(app.color(255))
				.setColorBackground(app.color(25,25,25,5))

				.setColorCaptionLabel(app.color(25,25,25))

				.setColorCaptionLabel(app.color(25,25,25,5))

				.setFont(font)
				;
		
		jugadores = new ArrayList <User> ();
		
		//cosas batalla
		
		usarPokebola = false;
		pokebolaUsada = false;

		puntos = 5;
		superClic =false;
		usado = true;

		derrotado = false;

	}
	
	//metodos
	public void iniciarTodo() {
		switch(pantalla) {
		case 0:
			//inicio
			app.image(pantInicio,0,0,800,500);
			control.hide();

			if(app.mouseX > 247 && app.mouseX < 551 && app.mouseY > 414 && app.mouseY < 457) {
				app.image(inicioBlanco,230,407,340,50);
			}
			
			break;
		case 1:
			//registro
			app.image(pantRegistro,0,0,800,500);
			control.show();
			
			if(app.mouseX > 178 && app.mouseX < 295 && app.mouseY > 312 && app.mouseY < 355) {
				app.image(inicioR,175,305,140,50);
			}
			
			usuario = "";
			
			if(escribaNombre == true) {
				
				app.image(escribeNombre,65,385,350,50);
				
			}
					
			break;
		case 2:
			//lab
			app.image(pantLab,0,0,800,500);
			control.hide();
			if(app.mouseX > 360 && app.mouseX < 480 && app.mouseY > 195 && app.mouseY <260) {
				app.image(pokebolita,350,195,50,50);
				app.image(pokebolita,353+43,195,50,50);
				app.image(pokebolita,353+45+45,195,50,50);
			}
			
			
			
			perso.pintar();
			if(PApplet.dist(perso.getPosX(), perso.getPosY(),400, 250) < 50) {
				app.image(pokebolita,350,195,50,50);
				app.image(pokebolita,353+43,195,50,50);
				app.image(pokebolita,353+45+45,195,50,50);
			}
			
			
			
			break;
		case 3:
			//elige
			control.hide();
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
			control.hide();
			app.image(pantCampo,0,0,800,500);
			ash.pintar();
			
			if(app.mouseX > 16 && app.mouseX < 85 && app.mouseY > 415 && app.mouseY <480) {
				 app.image(pokebola,15,413,70,70);
		        }  
			
			
			for(int i = 0; i < pokemonsitos.size(); i++) {
			pokemonsitos.get(i).pintarAdelanteChiqui();
			new Thread (pokemonsitos.get(i)).start();
			
			if(PApplet.dist(ash.getPosX(), ash.getPosY(), pokemonsitos.get(i).getPosX(), pokemonsitos.get(i).getPosY())<50) {
				pantalla = 5;
				
			}
			
			brian.pintar();
			new Thread (brian).start();
			

			if(PApplet.dist(ash.getPosX(), ash.getPosY(), brian.getPosX(), brian.getPosY())<50) {
				pantalla = 7;
			}
		}
		
			break;
		case 5:
			//batalla
			control.hide();
			app.image(pantBatalla,0,0,800,500);
			movPoke = (int)app.random(80,90);
			
			if(puntos < 65) {
			app.fill(255);
			app.rect(645,10, 75, 20);
			app.fill(28,82,47);
			app.textSize(15);
			app.text("SUPER",730,20);
			app.text("ATAQUE",730,35);
			app.fill(28,82,47);
			app.rect(650,15, puntos, 10);
			}
			
			if(puntos >= 65 && usado == true) {
				app.fill(255);
				app.rect(645,10, 75, 20);
				app.fill(355,0,0);
				app.rect(650,15, puntos, 10);
				app.textSize(15);
				app.text("SUPER",730,20);
				app.text("ATAQUE",730,35);
			}
			
			
			
			if(puedeUsar == false) {
				
			try {
				laExceptionSuperAtaque (puntos,superClic);
			} catch (ExceptionNombre e) {
				//System.out.println(e.getMessage());
				app.fill(28,82,47);
				app.textSize(12);
				app.text(e.getMessage(),410,20);
				
			}
			}
			
			if(puntos >= 65) {
				puedeUsar = true;
			}
			
			try {
				laExceptionAtaqueUsado (usado);
			} catch (Exception e) {
				// TODO: handle exception
				app.fill(28,82,47);
				app.textSize(13);
				app.text(e.getMessage(),625,16);
			}
			
			//System.out.println(puedeUsar);
			
			
			if(app.mouseX > 367 && app.mouseX < 485 && app.mouseY > 417 && app.mouseY <477) {
				app.image(ataqueR, 362, 413, 125, 65);
			}
			
			if(app.mouseX > 501 && app.mouseX < 700 && app.mouseY > 417 && app.mouseY <477) {
				app.image(superAtaqueR, 499, 413, 205, 65);
			}
			
			
			
			for(int j = 0; j < mios.size(); j++) {
				mios.get(j).pintarAtras();
			}
	
			
			if(usarPokebola == true && pokebolaUsada == false) {
				app.image(pokebola,706,400,movPoke,movPoke);
			
			}
			
			if(pokebolaUsada == true) {
				app.image(pokebola,718,412,65,65);
				salir = true;
			}
			
			for(int i = 0; i < pokemonsitos.size(); i++) {
				pokemonsitos.get(i).pintarAdelante();
				if(pokebolaUsada == true && usarPokebola == true) {
				
					//ash.atrapacionLograda();
					//new Thread (ash).start();
				//	ash.atrapacionLograda();
					
					new Thread (ash).start();
					ash.atrapacion();
					if(ash.isCapturado() == true) {
						app.image(this.captura,50,190, 700,100);
					}
				}
			}
			
			
			
			if (salir == true) {
				app.image(exit,17, 11);
			}
			
			break;
		case 6:
			//pokedex
			control.hide();
			app.image(pantPokedex,0,0,800,500);
			
			app.image(pokeSalir,560,417,230,70);
			
			if(app.mouseX > 547 && app.mouseX < 797 && app.mouseY > 410 && app.mouseY <490 ) {
				app.image(pokeSalir,547,410,250,80);
			}
			
			
			break;
		case 7:
			//batalla del malo brian
			control.hide();
			app.image(pantBatalla,0,0,800,500);
			movPoke = (int)app.random(80,90);
			
			if(puntos < 65) {
				app.fill(255);
				app.rect(645,10, 75, 20);
				app.fill(28,82,47);
				app.textSize(15);
				app.text("SUPER",730,20);
				app.text("ATAQUE",730,35);
				app.fill(28,82,47);
				app.rect(650,15, puntos, 10);
				}
				
				if(puntos >= 65 && usado == true) {
					app.fill(255);
					app.rect(645,10, 75, 20);
					app.fill(355,0,0);
					app.rect(650,15, puntos, 10);
					app.textSize(15);
					app.text("SUPER",730,20);
					app.text("ATAQUE",730,35);
				}
				
				
				
				if(puedeUsar == false) {
					
				try {
					laExceptionSuperAtaque (puntos,superClic);
				} catch (ExceptionNombre e) {
					//System.out.println(e.getMessage());
					app.fill(28,82,47);
					app.textSize(12);
					app.text(e.getMessage(),410,20);
					
				}
				}
				
				if(puntos >= 65) {
					puedeUsar = true;
				}
				
				try {
					laExceptionAtaqueUsado (usado);
				} catch (Exception e) {
					// TODO: handle exception
					app.fill(28,82,47);
					app.textSize(13);
					app.text(e.getMessage(),625,16);
				}
			
			
			if(app.mouseX > 367 && app.mouseX < 485 && app.mouseY > 417 && app.mouseY <477) {
				app.image(ataqueR, 362, 413, 125, 65);
			}
			if(app.mouseX > 501 && app.mouseX < 700 && app.mouseY > 417 && app.mouseY <477) {
				app.image(superAtaqueR, 499, 413, 205, 65);
			}
			
			
			for(int j = 0; j < mios.size(); j++) {
				mios.get(j).pintarAtras();
			}
	
			
			if(usarPokebola == true && pokebolaUsada == false) {
				app.image(pokebola,706,400,movPoke,movPoke);
			
			}
			
			if(pokebolaUsada == true) {
				app.image(pokebola,718,412,65,65);
			}
				evvy.pintarAdelante();
				if (salir == true) {
					app.image(exit,17, 11);
				}
				
			if (derrotado == true) {
				brian.derrotado();
				salir = true;
			}
			
			
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
				
				clicR = true;
				
				usuario = control.get(Textfield.class,"usuarioImput").getText();
				//System.out.println(usuario);
				
				try {
					laExceptionNombre (usuario,clicR);
				} catch (ExceptionNombre e) {
					//System.out.println(e);
					
					escribaNombre = true;
					
				}
				//System.out.println("clic"+clicR);
				//System.out.println("seguir"+seguir);
				
				
				
				if (seguir == true) {
					for (int i = 0; i < 1; i++) {
						jugadores.add(new User (usuario, app));
						//System.out.println(jugadores);
						pantalla ++;
					}
					
				}
				 
					
				
				
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
						mios.add(new PokemonTwo(60,85,app));
					}	
					if(charman == true) {
						mios.add(new PokemonOne(60,100,app));
					}
					if(planta == true) {
						mios.add(new PokemonThree(95,140,app));
					}
				}
				pantalla  ++;
				
			}
			
			break;
		case 4: 
			//campo
            if(app.mouseX > 16 && app.mouseX < 85 && app.mouseY > 415 && app.mouseY <480) {
			pantalla =6;
			//System.out.println("pokeke");
        }                              
			
			break;
		case 5:
			//batalla
			
			for(int j = 0; j < mios.size(); j++) {
				for(int i = 0; i < pokemonsitos.size(); i++) {
					
			//ATAQUE
			if(app.mouseX > 367 && app.mouseX < 485 && app.mouseY > 417 && app.mouseY <477) {
				
				if(mios.get(j).getVida() > 10) {
				mios.get(j).isEstaEnBatalla();
				mios.get(j).setEstaEnBatalla(true);
				new Thread (mios.get(j)).start();
				}
				
				if (pokemonsitos.get(i).getVida() > 20) {
				pokemonsitos.get(i).setVida((pokemonsitos.get(i).getVida())-mios.get(j).getAtaque());
				
				if(puntos < 65) {
				puntos += 30;
				}
			}
		}
			
				//CAMBIOS DE COLOR EN LA BARRA DE VIDA
				if(pokemonsitos.get(i).getVida() <= 100) {
				pokemonsitos.get(i).setR(242);
				pokemonsitos.get(i).setG(187);
				pokemonsitos.get(i).setB(34);
				}
				
				if(pokemonsitos.get(i).getVida() <= 30) {
				pokemonsitos.get(i).setR(242);
				pokemonsitos.get(i).setG(98);
				pokemonsitos.get(i).setB(34);
				}
				
				if(pokemonsitos.get(i).getVida() < 70) {
					usarPokebola = true;
					if(app.mouseX >706 && app.mouseX < 791 && app.mouseY > 400 && app.mouseY < 485) {
						pokebolaUsada = true;
					}
				}
				
				
				//SUPER ATAQUE
				if(app.mouseX > 501 && app.mouseX < 700 && app.mouseY > 417 && app.mouseY <477) {
					superClic = true;
					
					
					if(puedeUsar == true) {
						if (pokemonsitos.get(i).getVida() > 20) {
							if(usado == true) {
						pokemonsitos.get(i).setVida((pokemonsitos.get(i).getVida())-50);
						
						if(mios.get(j).getVida() > 10) {
						mios.get(j).isEstaEnBatalla();
						mios.get(j).setEstaEnBatalla(true);
						
						new Thread (mios.get(j)).start();
						}
						
						usado = false;
						
						if(pokemonsitos.get(i).getVida() <= 100) {
							pokemonsitos.get(i).setR(242);
							pokemonsitos.get(i).setG(187);
							pokemonsitos.get(i).setB(34);
							}
							
							if(pokemonsitos.get(i).getVida() <= 30) {
							pokemonsitos.get(i).setR(242);
							pokemonsitos.get(i).setG(98);
							pokemonsitos.get(i).setB(34);
							}
							}
						}
					}
				}
				
				
				//System.out.println(pokemonsitos.get(j).getVida());
				//System.out.println(mios.get(i).getAtaque());
				}
				
				
			}
		
			if (app.mouseX > 17 && app.mouseX < 136 && app.mouseY > 11 && app.mouseY < 125) {
				reiniciar();
				pantalla = 4;
			}
			
			
	
			
			break;
		case 6:
			//pokedex
			if(app.mouseX > 580 && app.mouseX < 755 && app.mouseY > 420 && app.mouseY <488 ) {
				pantalla  =4;
				
			}
			
			break;
			
		case 7:
			//batalla Con el malo
			
			for(int j = 0; j < mios.size(); j++) {
				for(int i = 0; i < pokemonsitos.size(); i++) {
			if(app.mouseX > 367 && app.mouseX < 485 && app.mouseY > 417 && app.mouseY <477) {
			
				if(mios.get(j).getVida() > 10) {
				mios.get(j).isEstaEnBatalla();
				mios.get(j).setEstaEnBatalla(true);
				new Thread (mios.get(j)).start();
				}
				
				if (evvy.getVida() > 10) {
					
					if(puntos < 65) {
						puntos += 30;
						}
					
				evvy.setVida((evvy.getVida())-mios.get(j).getAtaque());
			
				}
				}
				
				if(evvy.getVida() <= 100) {
				evvy.setR(242);
				evvy.setG(187);
				evvy.setB(34);
				}
				
				if(evvy.getVida() <= 30) {
					evvy.setR(242);
					evvy.setG(98);
					evvy.setB(34);
					}
				
				if(evvy.getVida() <= 20) {
					derrotado = true;
				
				}
				
				//SUPER ATAQUE
				if(app.mouseX > 501 && app.mouseX < 700 && app.mouseY > 417 && app.mouseY <477) {
					superClic = true;
					
					
					if(puedeUsar == true) {
						if (evvy.getVida() > 20) {
							if(usado == true) {
						evvy.setVida((evvy.getVida())-50);
						
						if(mios.get(j).getVida() > 10) {
						mios.get(j).isEstaEnBatalla();
						mios.get(j).setEstaEnBatalla(true);
						
						new Thread (mios.get(j)).start();
						}
						usado = false;
						
						if(pokemonsitos.get(i).getVida() <= 100) {
							evvy.setR(242);
							evvy.setG(187);
							evvy.setB(34);
							}
							
							if(pokemonsitos.get(i).getVida() <= 30) {
							evvy.setR(242);
							evvy.setG(98);
							evvy.setB(34);
								}
							}
						}
					}
				}
				
				//System.out.println(pokemonsitos.get(j).getVida());
				//System.out.println(mios.get(i).getAtaque());
				}
				if (app.mouseX > 17 && app.mouseX < 136 && app.mouseY > 11 && app.mouseY < 125) {
					reiniciar();
					pantalla = 4;
				}
				
			}
		
		}
		
	}
	
	
	public void teclado () {
		if (perso.getPosX() > 0 && perso.getPosX() < 800 && perso.getPosY() > 0 && perso.getPosY() < 500 ||
				ash.getPosX() > 0 && ash.getPosX() < 800 && ash.getPosY() > 0 && ash.getPosY() < 500) {
			
			switch (pantalla) {
			case 2:
				if (app.keyCode == app.UP) {
					if (this.mapa1[yLab - moveLab][xLab] == 0) {
						yLab -= moveLab;
						perso.moverArr();
					}
					
				}
				
				if (app.keyCode == app.DOWN) {
					if (this.mapa1[yLab + moveLab][xLab] == 0) {
						yLab += moveLab;
						perso.moverAba();
					}
					
				}
				
				if (app.keyCode == app.LEFT) {
					if (this.mapa1[yLab][xLab - moveLab] == 0) {
						xLab -= moveLab;
						perso.moverIzq();
					}
				}
				
				if (app.keyCode == app.RIGHT) {
					if (this.mapa1[yLab][xLab + moveLab] == 0) {
						xLab += moveLab;
						perso.moverDer();
					}
					
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
	
	public void reiniciar () {
		 ash.setPosX(600);
		 ash.setPosY(150);
		 xLogica = 12;
		 yLogica = 4;
		 salir = false;
		 for (int i = 0; i < pokemonsitos.size(); i++) {
			 pokemonsitos.get(i).setVida(163);
		
			 pokemonsitos.get(i).setR(0);
			 pokemonsitos.get(i).setG(218);
			 pokemonsitos.get(i).setB(124);
			 
			 if(pokemonsitos.get(i).getVida() <= 100) {
					pokemonsitos.get(i).setR(242);
					pokemonsitos.get(i).setG(187);
					pokemonsitos.get(i).setB(34);
					}
					
					if(pokemonsitos.get(i).getVida() <= 30) {
						pokemonsitos.get(i).setR(242);
						pokemonsitos.get(i).setG(98);
						pokemonsitos.get(i).setB(34);
						}
			 usarPokebola = false;
			 pokebolaUsada = false;
			 pokemonsitos.remove();
			 
		 }
		 pokemonAleatorio = (int) Math.floor(Math.random()*3);
		 
		 for(int i = 0; i < 1; i++) {
				if(pokemonAleatorio == 0) {
					pokemonsitos.add(new PokemonOne(50,50,app));
					//pokemonsotes.add(new PokemonOne(2,540,50,app));
					
				}
				if(pokemonAleatorio == 1) {
					pokemonsitos.add(new PokemonTwo(50,50,app));
					//pokemonsotes.add(new PokemonTwo(2,530,50,app));
				}
				if(pokemonAleatorio == 2) {
					pokemonsitos.add(new PokemonThree(50,50,app));
					//pokemonsotes.add(new PokemonThree(2,524,45,app));
				}
			}
		 
	}
	
	
	//EXCEPCION DEL NOMBRE EN EL REGITRO
	public void laExceptionNombre (String a, boolean b) throws ExceptionNombre {
		if ((a.equals(""))&&(b==true)) {
			throw new ExceptionNombre("Debe agregar su nombre");
		} else {
			seguir = true;
		}
	}
	
	//EXCEPCION DE QUE NO PUEDE USAR EL ATAQUE HASTA LLENAR LA BARRA
	public void laExceptionSuperAtaque (int a, boolean b) throws ExceptionNombre {
		if ((a <= 65)&&(b == true)) {
			throw new ExceptionNombre("Para usar el super ataque llene la barra");
		} 
		
	}
	
	//EXEPCION DE QUE SOLO TIENE 1 SUPER ATAQUE
	public void laExceptionAtaqueUsado (boolean a) throws ExceptionNombre {
		if (a == false) {
			throw new ExceptionNombre("Solo tienes 1 Super ataque");
		} 
		
	}
	
	
	
	/////////////////GETTERS AND SETTERS ////////////////////////////////////

	//GETTERS Y SETTERS
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


	public int getPokemonAleatorio() {
		return pokemonAleatorio;
	}


	public void setPokemonAleatorio(int pokemonAleatorio) {
		this.pokemonAleatorio = pokemonAleatorio;
	}


	public boolean isPokeelige() {
		return pokeelige;
	}


	public void setPokeelige(boolean pokeelige) {
		this.pokeelige = pokeelige;
	}


	public boolean isCharman() {
		return charman;
	}


	public void setCharman(boolean charman) {
		this.charman = charman;
	}


	public boolean isPlanta() {
		return planta;
	}


	public void setPlanta(boolean planta) {
		this.planta = planta;
	}


	public boolean isTortu() {
		return tortu;
	}


	public void setTortu(boolean tortu) {
		this.tortu = tortu;
	}


	public boolean isPokedexSalir() {
		return pokedexSalir;
	}


	public void setPokedexSalir(boolean pokedexSalir) {
		this.pokedexSalir = pokedexSalir;
	}


	public int[][] getMapa() {
		return mapa;
	}


	public void setMapa(int[][] mapa) {
		this.mapa = mapa;
	}


	public Bueno getPerso() {
		return perso;
	}


	public void setPerso(Bueno perso) {
		this.perso = perso;
	}


	public PImage getInicioBlanco() {
		return inicioBlanco;
	}


	public void setInicioBlanco(PImage inicioBlanco) {
		this.inicioBlanco = inicioBlanco;
	}


	public PImage getInicioR() {
		return inicioR;
	}


	public void setInicioR(PImage inicioR) {
		this.inicioR = inicioR;
	}


	public PImage getPokeSalir() {
		return pokeSalir;
	}


	public void setPokeSalir(PImage pokeSalir) {
		this.pokeSalir = pokeSalir;
	}


	public PImage getAceptar() {
		return aceptar;
	}


	public void setAceptar(PImage aceptar) {
		this.aceptar = aceptar;
	}


	public PImage getPokebolita() {
		return pokebolita;
	}


	public void setPokebolita(PImage pokebolita) {
		this.pokebolita = pokebolita;
	}


	public PImage getCharmanderF() {
		return charmanderF;
	}


	public void setCharmanderF(PImage charmanderF) {
		this.charmanderF = charmanderF;
	}


	public PImage getSnivyF() {
		return SnivyF;
	}


	public void setSnivyF(PImage snivyF) {
		SnivyF = snivyF;
	}


	public PImage getSquirtleF() {
		return squirtleF;
	}


	public void setSquirtleF(PImage squirtleF) {
		this.squirtleF = squirtleF;
	}


	public PImage getPokebola() {
		return pokebola;
	}


	public void setPokebola(PImage pokebola) {
		this.pokebola = pokebola;
	}


	public ControlP5 getControl() {
		return control;
	}


	public void setControl(ControlP5 control) {
		this.control = control;
	}


	public PFont getFont() {
		return font;
	}


	public void setFont(PFont font) {
		this.font = font;
	}


	public LinkedList<Pokemon> getPokemonsitos() {
		return pokemonsitos;
	}


	public void setPokemonsitos(LinkedList<Pokemon> pokemonsitos) {
		this.pokemonsitos = pokemonsitos;
	}


	public LinkedList<Pokemon> getPokemonsotes() {
		return pokemonsotes;
	}


	public void setPokemonsotes(LinkedList<Pokemon> pokemonsotes) {
		this.pokemonsotes = pokemonsotes;
	}


	public LinkedList<Pokemon> getMios() {
		return mios;
	}


	public void setMios(LinkedList<Pokemon> mios) {
		this.mios = mios;
	}


	/*public LinkedList<User> getJugadores() {
		return jugadores;
	}


	public void setJugadores(LinkedList<User> jugadores) {
		this.jugadores = jugadores;
	}*/


	public int getxLogica() {
		return xLogica;
	}


	public void setxLogica(int xLogica) {
		this.xLogica = xLogica;
	}


	public int getyLogica() {
		return yLogica;
	}


	public void setyLogica(int yLogica) {
		this.yLogica = yLogica;
	}


	public int getSeMovio() {
		return seMovio;
	}


	public void setSeMovio(int seMovio) {
		this.seMovio = seMovio;
	}


	public int getxLab() {
		return xLab;
	}


	public void setxLab(int xLab) {
		this.xLab = xLab;
	}


	public int getyLab() {
		return yLab;
	}


	public void setyLab(int yLab) {
		this.yLab = yLab;
	}


	public int getMoveLab() {
		return moveLab;
	}


	public void setMoveLab(int moveLab) {
		this.moveLab = moveLab;
	}


	public Bueno getAsh() {
		return ash;
	}


	public void setAsh(Bueno ash) {
		this.ash = ash;
	}
	
	

}

package com.epicode.multimedial;

import java.util.Scanner;

public class MenuLettore {
	private Abstract[] memory = new Abstract[5];
	int space;

	public MenuLettore() {

	}

	public Object[] getMemory() {
		return memory;
	}

	public void setMemory(Object[] memory) {
		this.memory = (Abstract[]) memory;
	}
	
	
	public void selezioneCreazione() {
		System.out.println("crea file: 1-Audio,2,Immagine,3-Video");
		Scanner input = new Scanner(System.in);
		int option= input.nextInt();
		switch (option) {
		case 1: {
			newObject(option);
			break;
		}
		case 2: {
			newObject(option);
			break;
		}
		case 3: {
			newObject(option);
			break;
		}
		default:
			System.out.println("selezione errata");
			selezioneCreazione();
			break;
		}
	}
	
	public void newObject(int i) {
		int x = i;
		switch (x) {
		case 1: {
			//oggetto audio
			System.out.println("inserisci titolo:");
			Scanner input = new Scanner(System.in);
			String titolo = input.nextLine();
			System.out.println("inserisci durata:");
			Scanner inputureata = new Scanner(System.in);
			int durata = inputureata.nextInt();
			System.out.println("inserisci volume iniziale:");
			Scanner inputvolume = new Scanner(System.in);
			int volume = inputvolume.nextInt();
			LettoreAudio audio = new LettoreAudio(titolo, durata, volume);			
			memory[space]= audio;
			System.out.println("File creatto correttamente:" + memory[space].title);
			space++;
			if(space==5) {
				selectFile();
				break;
			}else {
				selezioneCreazione();
					break;
			}
		
			
		}
		case 2: {
			//oggetto immagine
			System.out.println("inserisci titolo:");
			Scanner input = new Scanner(System.in);
			String titolo = input.nextLine();
			System.out.println("inserisci volume iniziale:");
			Scanner inputluminosita = new Scanner(System.in);
			int luminosita = inputluminosita.nextInt();
			LettoreImmagini img = new LettoreImmagini(titolo, luminosita);
			memory[space]= img;
			System.out.println("File creatto correttamente:" + memory[space].title);			space++;
			if(space==5) {
				selectFile();
				break;
			}else {
				selezioneCreazione();
				break;
			}
			
		}
		case 3: {
			//oggetto video
			System.out.println("inserisci titolo:");
			Scanner input = new Scanner(System.in);
			String titolo = input.nextLine();
			System.out.println("inserisci luminosita iniziale:");
			Scanner inputluminosita = new Scanner(System.in);
			int luminosita = inputluminosita.nextInt();
			System.out.println("inserisci durata:");
			Scanner inputureata = new Scanner(System.in);
			int durata = inputureata.nextInt();
			System.out.println("inserisci volume iniziale:");
			Scanner inputvolume = new Scanner(System.in);
			int volume = inputvolume.nextInt();
			LettoreVideo video = new LettoreVideo(titolo, durata, volume, volume);
			memory[space]= video;
			System.out.println("File creatto correttamente:" + memory[space].title);			space++;
			if(space==5) {
				selectFile();
				break;
			}else {
				selezioneCreazione();
				break;
			}
			
		}
		
	}
	}
	
	public void selectFile() {
	
		for (Abstract ele : memory) {
			System.out.println(ele.title);
		}
		System.out.println("seleziona:" + "1) " + memory[0].getTitle() + " "
										+ "2) " + memory[1].getTitle() + " "
										+ "3)" + memory[2].getTitle() + " "
										+ "4) " + memory[3].getTitle()+ " "
										+ "5)" + memory[4].getTitle() + " "
										+ "0)" + "Per uscire dal programma");
	Scanner input =new Scanner(System.in);
	int i = input.nextInt();
		switch (i) {
		case 1: {
			System.out.println("file "+ memory[0].getTitle() + " avviato" );
			selectFile();
			break;
		}
		case 2: {
			System.out.println("file "+ memory[1].getTitle() + " avviato" );
			selectFile();
			break;
		}
		case 3: {
			
			System.out.println("file "+ memory[2].getTitle() + " avviato" );
			selectFile();
			break;
		}
		case 4: {
			System.out.println("file "+ memory[3].getTitle() + " avviato" );
			selectFile();
			break;
			
		}
		case 5: {
			System.out.println("file "+ memory[4].getTitle() + " avviato" );
			selectFile();
			break;
			
		}
		
		case 0: {
			stop();
			break;
		}
		default:
			System.out.println("tasto errato");
			selectFile();
			break;
			
		}
		

		
		
		
	}
	
	public void stop(){
		System.out.println("Fine programma");
		
	}
	
	
	
}

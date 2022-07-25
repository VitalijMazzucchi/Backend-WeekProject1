package com.epicode.multimedial;

public class LettoreVideo extends Abstract implements Volume,Lumionosita {
	private	int durata;
	private int vol;
	private int lum;

	public LettoreVideo(String title,int durata, int vol, int lum) {
		super(title);
		this.durata = durata;
		this.vol = vol;
		this.lum = lum;
	}
	

	public int getDurata() {
		return durata;
	}


	public void setDurata(int durata) {
		this.durata = durata;
	}


	public int getVol() {
		return vol;
	}


	public void setVol(int vol) {
		this.vol = vol;
	}


	public int getLum() {
		return lum;
	}


	public void setLum(int lum) {
		this.lum = lum;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void stampa() {
		String i= "";
		String temp = "";
		String sun="";
		for( int a =0; a < this.vol;a++) {
			i+="*";
		} 
		for( int a =0; a < this.durata;a++) {
			temp+= "//" + this.title;
		}
		for( int a =0; a < this.lum;a++) {
			sun+="!";
		}
		System.out.println("Volume:"+ i);
		System.out.println("Durata:"+temp);
		System.out.println("Luminosita" + sun);
	}

	@Override
	public void alzaLuninosita() {
		this.lum++;
		stampa();
	}

	@Override
	public void abbassaLuminosita() {
		this.lum--;
		stampa();
	}

	@Override
	public void Alzavolume() {
		this.vol++;
		stampa();		
	}

	@Override
	public void abbassaVolume() {
		this.vol--;
		stampa();		
	}

}

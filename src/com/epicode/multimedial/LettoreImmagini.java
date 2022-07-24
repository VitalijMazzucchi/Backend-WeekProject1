package com.epicode.multimedial;

public class LettoreImmagini extends Abstract implements Lumionosita {
	private int lum;
	
	public LettoreImmagini(String title,int lum) {
		super();
		this.lum = lum;
		this.title=title;
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
		String sun="";
		for( int a =0; a < this.lum;a++) {
			sun+="*";
			}
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

}

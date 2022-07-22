
public class LettoreAudio extends Abstract implements Volume {
	private	int durata;
	private int vol;

	public LettoreAudio(int durata, int vol, String title) {
		super();
		this.durata = durata;
		this.title=title;
		this.vol=vol;
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
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void stampa() {
		String i= "";
		String temp = "";
		for( int a =0; a < this.vol;a++) {
			i+="*";
		} 
		for( int a =0; a < this.durata;a++) {
			temp+="//this.tittle";
		}
		System.out.println("Volume:"+ i);
		System.out.println("Durata:"+temp);
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

	


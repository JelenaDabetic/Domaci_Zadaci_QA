package vezbanje30_08_nastavak_klase_auto;

public class KlaseAuto {

	
/*
		Napraviti klasu automobil i dve main klase gde ce se u jednoj stampati podaci preko praznog konstruktora, 
		a u drugom preko punog konstruktora. Atributi su marka, model, pogon, broj vrata i godiste.
*/		
		
		
	public String marka;
	public String model;
	public String pogon;
	public int brVrata;
	public int godiste;
	private int predjeniKm;
	public int potrosnjaGoriva;
	public int kubikaza;
	public int ukupnoZaGorivo;
	
	public KlaseAuto() {
		
	}
	
	public void stampanje() {
		System.out.println("Marka automobila je: " + marka 
				+ " , model je: " + model+" ima pogon na: " + pogon 
				+ "broj vrata: " +brVrata+ " godiste: " + godiste + " broj predjenih kilometara je: " 
				+ getPredjeniKm() + "kubikaza iznosi: " +kubikaza+ " trosi goriva na 100 km: " + potrosnjaKm() +"litara" 
				+ " i ukupna cena goriva za predjeni put je: " + cenaGoriva());
	}
	
	public KlaseAuto(String marka, String model, String pogon, int brVrata, int godiste, int kubikaza) {
		
		this.marka=marka;
		this.model=model;
		this.pogon=pogon;
		this.brVrata=brVrata;
		this.godiste=godiste;
		this.kubikaza=kubikaza;
	}


	public void setPredjeniKm (int kilometri) {
		this.predjeniKm=kilometri;
	}
	
	public int getPredjeniKm () {
		return this.predjeniKm;
	}
	
	/*
	  Ako kubikaza prelazi 1000 cm^3 onda stampati potrosnju da je 10 litara, 
	  ako je kubikaza ispod 1000 onda stampati da je potrosnja 8 litara.
	 */
	
	public int potrosnjaKm() {
		if(this.kubikaza>1000) {
			return this.potrosnjaGoriva=10;
		} else {
			return this.potrosnjaGoriva=8;
		}	
	}
	
	
	public int cenaGoriva() {
		int litar=120;
	return	this.ukupnoZaGorivo=litar* this.predjeniKm *this.potrosnjaKm()/100;
	}
    

	
	
}

package domaci_raspust;

public class Glumci {

	/*
	3.	Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina rodjenja, pol. 
	Private atributi su: da li su ozenjeni ili udati (boolean), prosecna zarada po filmu, broj snimljenih filmova. 
	Potrebno je izracunati i odstampati sve atribute, 
	koliko su ukupno zaradili u svim filmovima, 
	koliko godina pune u 2022. godini, 
	ako su muskog pola preko atributa treba pre imena da se doda "Mr." ili "Mrs." ako su zenskog pola. 
	Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih filmova 
	(pored naslova napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore ocenjenog filma od tih pet 
	(preko getera i setera).
	
	*/
	
	public String imeIPrezime;
	public int godinaRodjenja;
	public String pol;
	private boolean bracniStatus;
	private double prosecnaZaradaPoFilmu;
	private int brojFilmova;
	// private double ukupnaZaradaUFilmovima;  //nisam uspela da resim ako je private
	public double ukupnaZaradaUFilmovima;
	public int godineU2020;
	public String oznakaZaPol;
	
	
	public void stampanje() {
		System.out.println("Ime i prezime glumaca/glumice je: " + oznakaZaPol()+ " " + imeIPrezime+ " , rodjen/a je " 
	+ godinaRodjenja + " godine, a pol je: " + pol + " , u braku je: " 
				+ getBracniStatus() + ", prosecna zarada po filmu iznosi " + getProsecnaZaradaPoFilmu() 
				+ "eur, a ukupan broj snimljenih filmova je: " +getBrojFilmova() 
				+ ". \n Ukupna zarada u filmovima iznosi: " + ukupnaZaradaUFilmovima() 
				+ " eur. U 2022. godini ovaj glumac/glumica ce napuniti " + godineU2020());
	}
	
	public Glumci() {
		
	}
	
	public Glumci( String imeIPrezime, int godinaRodjenja, String pol) {
	
	this.imeIPrezime=imeIPrezime;
	this.godinaRodjenja=godinaRodjenja;
	this.pol=pol;
	this.godineU2020=godineU2020;
	
	}
	
	
	public void setBracniStatus (boolean bracnoStanje) {
		this.bracniStatus=bracnoStanje;
	}
	
	
	public boolean getBracniStatus() {
		return this.bracniStatus;
	}
	
	
	
	public void setProsecnaZaradaPoFilmu ( double zaradaAvg) {
		this.prosecnaZaradaPoFilmu=zaradaAvg;
	}
	
	public double getProsecnaZaradaPoFilmu () {
		return this.prosecnaZaradaPoFilmu;
	}
	
	
	
	public void setBrojFilmova (int filmovi) {
		this.brojFilmova=filmovi;
	}
	
	public int getBrojFilmova() {
		return this.brojFilmova;
	}
	
	
//	///greska
//	public void setUkupnaZaradaUFilmovima(double zaradaUkupna) {
//		zaradaUkupna=this.brojFilmova*this.prosecnaZaradaPoFilmu;
//		this.ukupnaZaradaUFilmovima=zaradaUkupna;
//	}
//	
//	//greska
//	public double getUkupnaZaradaUFilmovima () {
//		return ukupnaZaradaUFilmovima;
//	}
	
	public double ukupnaZaradaUFilmovima() {
		return this.ukupnaZaradaUFilmovima=this.brojFilmova*this.prosecnaZaradaPoFilmu;
	}
	
	public int godineU2020 () {
		int godina=2020;
		return godineU2020=godina-this.godinaRodjenja;
	}
	
	public String oznakaZaPol() {
		if(pol.equals("muski")) {
			this.oznakaZaPol= "Mr"; // + imeIPrezime;
		} else if(pol.equals("zenski")) {
			this.oznakaZaPol= "Mrs"; //+ imeIPrezime; -greska
		} else {
			this.oznakaZaPol= "neopredeljen"; //+ imeIPrezime;
		}
		return this.oznakaZaPol;
			
		}
		
		
	
	
}

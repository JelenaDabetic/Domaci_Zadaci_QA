package domaci;

public class Putnik extends Covek {

	private double novac;
	private double uplata;
	private double isplata;
	
	private double stanjeNovo;
	

	public Putnik(String ime, String prezime, double novac) { //double uplata, double isplata) {
		super(ime, prezime);
		this.novac = novac;
		this.uplata = uplata;
		this.isplata = isplata;
		this.stanjeNovo=stanjeNovo;
	}


	public double getNovacPocetni() {
		return novac;
	}


	public double getUplata() {
		return uplata;
	}

	public void setUplata(double uplata) {
		this.uplata = uplata;
	}

	public double getIsplata() {
		return isplata;
	}

	public void setIsplata(double isplata) {
		this.isplata = isplata;
	}
	

	public double dodavanjeNovca(double uplata) {
		if(uplata>0) {
			this.novac+=uplata;
		}else {
			System.out.println(" Neispravan unos, stanje se vraca na pocetno.");
		}
	return novac;
}	
	
		public double dodavanjeOduzimanjeSredstava ( double uplata, double isplata) {
		if (uplata>0 && isplata==0 ) {
			this.novac =this.novac+uplata;
		} else if(uplata==0 && isplata>0){
			this.novac=this.novac-isplata;
		}else if(uplata>0 && isplata>0) {
			this.novac=(this.novac+uplata) -isplata;
		}else if(uplata==0 && isplata==0) {
			this.novac=this.novac;
		}else if (uplata<0 && isplata<0) {
			this.novac=this.novac;
			System.out.println("Unos nije validan");
		}
		return this.novac;
	}
	
		@Override
		public String toString() {
			return super.toString() +" je covek u ulozi putnika, i ima kod sebe " + novac+  "dinara";
		}
	
}
	
	


package domaci;

public class Autobus {

	private String naziv;
	private Vozac odabraniVozaca;
	private double cenaKarte;
	private Putnik putnikUBusu;

	public Autobus(String naziv,double cenaKarte, Vozac odabraniVozac, Putnik putnikUBusu ) {
		
		this.naziv = naziv;
		this.odabraniVozaca=odabraniVozac;
		this.cenaKarte=cenaKarte;
		this.putnikUBusu=putnikUBusu;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCenaKarte() {
		return cenaKarte;
	}

	public void setCenaKarte(double cenaKarte) {
		this.cenaKarte = cenaKarte;
	}

	public Vozac getOdabraniVozaca() {
		return odabraniVozaca;
	}

	public Putnik getPutnikUBusu() {
		return putnikUBusu;
	}

	
	@Override
	public String toString() {
		return "Autobus " + naziv + ", zaduzeni vozac je " + odabraniVozaca + ", cena karte je " + cenaKarte+ "din, a " + putnikUBusu + ".";
	}
	
}

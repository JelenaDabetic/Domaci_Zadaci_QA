package domaciZooVrt;

public class Zivotinje {
	
	private String naziv;
	private String vrsta;
	private String ishrana;
	
	
	public Zivotinje(String naziv, String vrsta, String ishrana) {
		super();
		this.naziv = naziv;
		this.vrsta = vrsta;
		this.ishrana = ishrana;
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public String getVrsta() {
		return vrsta;
	}


	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}


	public String getIshrana() {
		return ishrana;
	}


	public void setIshrana(String ishrana) {
		this.ishrana = ishrana;
	}
	
	public void stampanje() {
		System.out.println(this.getNaziv()+ " je " + this.getVrsta() 
		+ " koji se hrani" + this.getIshrana());
	}

}

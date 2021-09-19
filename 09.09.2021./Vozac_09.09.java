package domaci;

public class Vozac extends Covek {

	
	private String zanimanje;

	public Vozac(String ime, String prezime) {
		super(ime, prezime);
		this.zanimanje = "sofer";
	}


	@Override
	public String toString() {
		return "Covek " + super.toString()+ " po zanimanju: " + this.zanimanje;
	}
	
	
}

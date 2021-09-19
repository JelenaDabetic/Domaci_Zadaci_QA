package domaciZooVrt;

public class NeSisari extends Zivotinje {

	private String mestoObitavanja;
	private int brojPeraja;
	private String vrstaPeraja;
	
	
	
	public NeSisari(String naziv, String vrsta, String ishrana, String mestoObitavanja, int brojPeraja,
			String vrstaPeraja) {
		super(naziv, vrsta, ishrana);
		this.mestoObitavanja = mestoObitavanja;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
	}



	public String getMestoObitavanja() {
		return mestoObitavanja;
	}



	public void setMestoObitavanja(String mestoObitavanja) {
		this.mestoObitavanja = mestoObitavanja;
	}



	public int getBrojPeraja() {
		return brojPeraja;
	}



	public void setBrojPeraja(int brojPeraja) {
		this.brojPeraja = brojPeraja;
	}



	public String getVrstaPeraja() {
		return vrstaPeraja;
	}



	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}
	
	
	public void stampanje() {
		System.out.print(super.getNaziv()+ " je " + super.getVrsta() 
		+ " koji se hrani" + super.getIshrana()+ ", a obitava u " +this.mestoObitavanja);
		System.out.println("  Vrsta peraja je: " + this.vrstaPeraja + ", a ukupan broj peraja je " + this.brojPeraja);
	}
	
}

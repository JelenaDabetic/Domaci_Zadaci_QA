package domaci_raspust;

public class Glavna_glumciPrazanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Glumci glumac1=new Glumci();
		
		glumac1.imeIPrezime="Dragan Nikolic";
		glumac1.godinaRodjenja=1924;
		glumac1.pol="muski";
		glumac1.setBracniStatus(true);
		glumac1.setProsecnaZaradaPoFilmu(1000);
	
		glumac1.setBrojFilmova(60);
		
		glumac1.stampanje();
		
		
		
	}

}

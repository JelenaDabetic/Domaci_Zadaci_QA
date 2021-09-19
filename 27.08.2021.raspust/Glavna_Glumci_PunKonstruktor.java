package domaci_raspust;

import java.util.ArrayList;

public class Glavna_Glumci_PunKonstruktor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Glumci glumac2 = new Glumci("Sandra Bullock", 1964, "zenski");
		glumac2.setBracniStatus(false);
		glumac2.setProsecnaZaradaPoFilmu(2000);
		glumac2.setBrojFilmova(20);
		glumac2.stampanje();
	
		
		ArrayList filmovi= new ArrayList();
		
		filmovi.add("Gravity, imdb: 7.7"); //0
		filmovi.add("Bird box, imdb: 6.6");//1
		filmovi.add("Ocena's 8, imdb: 6.3"); //2 
		filmovi.add("Minions, imdb: 6.4"); //3
		filmovi.add("The blind side, imdb: 7.6"); //4
		
		Object alt=filmovi.get(1);
		filmovi.set(1, filmovi.get(4));
		filmovi.set(4, alt);
		alt=filmovi.get(2);
		filmovi.set(2,  filmovi.get(4));
		filmovi.set(4, alt);
		for(int i=0; i<filmovi.size(); i++) {
			System.out.println((i+1)+". film po ocenama publike je: "+ filmovi.get(i));
		}
		

		
	}

}

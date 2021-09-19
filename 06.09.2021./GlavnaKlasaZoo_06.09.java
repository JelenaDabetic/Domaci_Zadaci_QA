package domaciZooVrt;


public class GlavnaKlasaZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		DOMACI
		Zooloski vrt
		U zoovrtu obitavaju razne zivotinje. Sve imaju svoju vrstu (kicmenjaci, beskicmenjaci), 
		konkretan naziv i cime se hrane.
		
		Ribe su kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda), broj peraja, vrsta peraja
		
		Sisari su kicmenjaci koje se razlikuju po boji dlake, nacinu ishrane 
		(biljojedi, mesojedi, svastojedi), i covekovoj podeli na divlje i domace.
		
		Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. 
		Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.
		Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
		Ispisati bar jedno staniste.
		Jednom sisaru zameniti ulogu koju mu je covek dodelio.
	*/



		
		NeSisari ns1= new NeSisari("Smudj", "riba", "larve insekata", "slanoj vodi", 4, "tvrda peraja");
		NeSisari ns2= new NeSisari("Stuka", "riba", "plankton", "slatkoj vodi", 4, "meka peraja");
		Sisari s1= new Sisari( "Medved", "sisar", "zivotinje/biljke", "braon/bela", "svastojed", true);
		Sisari s2= new Sisari( "Konj", "sisar", "biljke", "crna", "biljojed", true);
		ns1.stampanje();
		ns2.stampanje();
		s1.stampanje();
		s2.stampanje();
		System.out.println("--------------------");
		Staniste stan1= new Staniste();
		stan1.dodavanjeZivotinja(s2);
		stan1.dodavanjeZivotinja(s1);
		stan1.dodavanjeZivotinja(ns1);
		stan1.dodavanjeZivotinja(ns2);
		stan1.stampanje();
		
		
	}
}


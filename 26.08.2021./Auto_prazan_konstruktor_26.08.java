package vezbanje30_08_nastavak_klase_auto;

public class Auto_prazan_konstruktor {
	public static void main(String[] args) {
		
		KlaseAuto auto1= new KlaseAuto();
		
		auto1.marka="Opel";
		auto1.model="Astra";
		auto1.pogon="dizel";
		auto1.brVrata=5;
		auto1.godiste=2002;
		auto1.setPredjeniKm(100);
		auto1.kubikaza=900;
		
		
		auto1.stampanje();
		
		
	}

}

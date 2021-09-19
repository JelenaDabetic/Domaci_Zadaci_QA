package domaci;

public class GlavnaCovek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vozac v1=new Vozac("Misko", "Miskovic");
		System.out.println(v1);
		
		Putnik p1=new Putnik ("Milos", "Markovic", 20000);
		
		
		
		System.out.println(p1);
		System.out.println("--------");
		p1.dodavanjeOduzimanjeSredstava(500, 0);
		System.out.println(p1);
		
		

		Autobus a1=new Autobus("Nis Ekspres", 200, v1, p1);
		System.out.println(a1);
	}

}

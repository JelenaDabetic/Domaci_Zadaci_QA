package paket1;
import java.util.Scanner;

public class Prva_klasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		1.	Domaci 19.08.2021.-Napisati program gde korisnik
		unosi pozitivne brojeve, kad unese negativan broj
		prikaze mu se suma svih prethodno unetih brojeva i na
		kraju zakomentarisati koje ste brojeve sve unosili po
		testu
na primer:
//test 1 x, y, z
//test 2 x, y, z
//test 3 x, y, z

		*/

		Scanner sc= new Scanner (System.in);
		int sum =0;
		 int broj= 0;
		 do {
			 sum=sum+ broj;
			 System.out.println("Unesi broj: ");
			 broj = sc.nextInt();
			 // a da smo stavili ovde sum=sum+broj; on bi izracunao sa - ../
		 } while (broj>=0);
		 System.out.println("sum je: " + sum);


		// test1: 1,2,3,4,5,-9 sum je:15
	// test 2 : -6 sum je: 0
		 // test 3: 5,6,5,-10 sumje: 16

	}

}

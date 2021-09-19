package paket1;

import java.util.Scanner;

public class DomaciZadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	Domaci 13.08.2021.
1.	-Napisati program gde preko skenera unesete broj,
ako je broj manji od 10 onda ga pomnoziti sa 100,
ako je broj veci od 100 onda ga podeliti sa 10.
Na kraju zakomentarisite koje brojeve ste koristili za
proveru programa.
	*/
		Scanner scanner = new Scanner (System.in);


		System.out.println("Unesite broj a:  ");


		double a = scanner.nextDouble();

		double b = a*100;

		double c = a /10;


		if (a< 10) {
			System.out.println(b);
		} else if (a>100) {
			System.out.println(c);
		} else {
			System.out.println("broj ne ispunjava uslov");
		}


	//  	Za proveru sam koristila brojeve  9,10, 99, 100, 101, -9, 0


/*
2.	Napisati program gde kroz switch se unosi broj od
1 do 12 i program ispisuje koji je to mesec u godini.
Ako korisnik unese drugi broj treba da se ispise poruka
"Potrebno je uneti broj od 1 do 12"
*/

		System.out.println("Unesite broj: ");

		int broj = scanner.nextInt();


		switch (broj) {

		case 1:
			System.out.println("Januar");
			break;
		case 2:
			System.out.println("Februar");
			break;
		case 3:
			System.out.println("Mart");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("Maj");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("Avgust");
			break;
		case 9:
			System.out.println("Septembar");
			break;
		case 10:
			System.out.println("Oktobar");
			break;
		case 11:
			System.out.println("Novembar");
			break;
		case 12:
			System.out.println("Decembar");
			break;

		default:
			System.out.println("Potrebno je uneti broj od 1 do 12");
		}


	}

}

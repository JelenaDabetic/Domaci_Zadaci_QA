package primer02;

import java.util.Scanner;

public class VezbanjeDomaci {

	public static void main(String[] args) {

		/*
		Domaci 12.08.2021.
Napisati program gde deklarisete vase ime, prezime kao
string, pol kao char i odstampajte adekvatno sva tri unosa.
Nakon toga preko skenera treba da unesete ukupan broj
medalja koliko je Srbija osvojila na olimpijskim igrama
i ukupan broj zlatnih medalja koliko je Srbija osvojila
na olimpijskim igrama, na kraju treba odstampati procenat
zlatnih medalja u odnosu na ukupan broj medalja. 
		*/

		String ime = "Jelena";
		String prezime = "Dabetic";
		char pol= 'ž';

		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("Pol: " + pol);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Unesite koliko je medalja ukupno osvojila Srbija na OI: ");
		int ukupanBrojMedalja = scanner.nextInt();

		System.out.println("Unesite koliko je zlatnih medalja osvojila Srbija na OI: ");
		double zlatneMedalje = scanner.nextDouble();


		double procenatZlatnihMedalja = (zlatneMedalje * 100) / ukupanBrojMedalja;
		System.out.println("Procenat osvojenih zlatnih medalja u odnosu na ukupan broj medalja: " + procenatZlatnihMedalja + "%");

		scanner.close();

	}

}

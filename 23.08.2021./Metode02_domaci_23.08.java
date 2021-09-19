package metod_pocetak;

import java.util.Scanner;

public class Metode02_domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	
		Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.
		
	*/
		
		Scanner sc =new Scanner(System.in);

		int[] unetiBr = new int[3];
		for (int i = 0; i < unetiBr.length; i++) {
			System.out.println("Unesi broj:");
			unetiBr[i] = sc.nextInt();
		}
		sc.close();

		int proizvodMetoda = proizvod(unetiBr);
		System.out.println("Proizvod brojeva je: " + proizvodMetoda);
		 

}


		private static int proizvod(int[] unetiBr) {
				int proizvodMetoda = unetiBr[0];
				for (int i = 0; i < unetiBr.length; i++) {
					proizvodMetoda = proizvodMetoda* unetiBr[i];
					}
					return proizvodMetoda;
				}

		
		
		

	

}

package metod_pocetak;

import java.util.Scanner;

public class Metode03_domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 DodatniFunkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima -> Napisati program koji ce procitati 3 cela broja 
		 sa standardnog ulaza i poziva i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva.
		Da li u nasoj klasi mozemo da imamo sledece funkcije i zasto?
			
			public static void vrati() {
			System.out.println(“Vrati mi olovku”);
		}
			
			
			public static String vrati() {
				return “Vrati mi svesku”;
				
			}
			
			-Void nece vratiti nista u main funkciju.
			a druga metoda ce vratiti ispisan string u main funkciju.
		 */

		
		Scanner sc= new Scanner(System.in);
		
	

			int[] unetiBroj = new int[3];
			for (int i = 0; i < unetiBroj.length; i++) {
				System.out.println("Unesi broj: ");
				unetiBroj[i] = sc.nextInt();
			}
			sc.close();

			int zbir = sabiranje(unetiBroj);
			int maxBr = maksimum(unetiBroj);
			System.out.println("Zbir unetih brojeva je: " + zbir + ", a najveci broj je: " + maxBr);

		}

		private static int sabiranje(int[] unetiBroj) {
			int zbir = unetiBroj[0];
			for (int i = 1; i < unetiBroj.length; i++) {
				zbir += unetiBroj[i];
			}
			return zbir;
		}

		private static int maksimum(int[] unetiBroj) {
			int maxBr = unetiBroj[0];
			for (int i = 0; i < unetiBroj.length; i++) {
				if (maxBr < unetiBroj[i]) {
					maxBr = unetiBroj[i];
				}
			}
			return maxBr;
		}
	}

	
	
	


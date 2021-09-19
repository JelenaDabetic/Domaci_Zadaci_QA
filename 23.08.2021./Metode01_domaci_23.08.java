package metod_pocetak;

import java.util.Scanner;

public class Metode01_domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Domaci:
Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci da korisnik unosi tri broja) 
i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena broja.
	 */
		
		Scanner sc = new Scanner (System.in);
		
//	//----------	
//		int [] niz1= new int[3];
//		for(int i= 0; i<niz1.length; i++) {
//			System.out.println("Unesi broj: ");
//			niz1[i]=sc.nextInt();
//		}
//		int mini=minimalniBroj(niz1);
//		System.out.println("Najmanji broj je: " + mini);
//			
//		
//		//----------u skoli:
		
				int[] unos = new int[3];
				for (int i = 0; i < unos.length; i++) {
					System.out.println("Unesi broj:");
					unos[i] = sc.nextInt();
				}
				sc.close();

				int min = minBroj(unos);
				System.out.println("Najmanji broj je: " + min);
				
		
	}

	
	private static int minBroj(int[] unos) {
		int min = unos[0];
		for (int i = 0; i < unos.length; i++) {
			if (min > unos[i]) {
				min = unos[i];
			}
		}
		return min;
	}
//	
	
	
//	//------------
//	private static int minimalniBroj(int[]niz1) {
//		int mini=niz1[0];
//		for (int i=0; i<niz1.length; i++) {
//			if(mini>niz1[i]) {
//				mini=niz1[i];
//			}
//			}
//		return mini;
//		}
//	}
	
}

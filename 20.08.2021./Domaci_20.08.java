package vezbanje_21_08;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Napisati program gde u nizu napisete 5 gradova, a program vam 
		odstampa sve osim prvog i poslednjeg unosa.
		-Napisati program gde u nizu napisete ovih 5 gradova 
		(Lisabon, London, Helsinki, Prag i Madrid) a program
		stampa gradove sve dok ne dodje do "Prag"-a
		
		Dva zadatka koje mozete pisati u istoj klasi ako zelite, kratki 
		su zadaci ali bitno je samo da se napise preko niza
		
*/		
		//1. zadatak
		
		
		String[] gradovi= { "Beograd", "Doha", "Delhi", "Berlin", "Dablin"};
		 
				
		
		for(int i=1; i<4; i++) {
			System.out.println(gradovi[i]);
		}

	
		//2. zadatak
		
		
		String[] gradovi2= {"Lisabon", "London", "Helsinki", "Prag", "Madrird"};
		
		
		for (String grad: gradovi2) {
			if (grad.equals("Prag")) {
				break;
			}
			System.out.println(grad);
		}
		
	
		
		
	}

}

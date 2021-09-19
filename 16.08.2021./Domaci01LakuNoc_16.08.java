package paket_3_vezbanje;

import java.util.Scanner;

public class Domaci01LakuNoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
/* While2: Napisati program koji ce na standardnom izlazu ispisati poruku
  “Laku noc!” onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! 
treba ispisati 20 puta  (
*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko puta zelite da se poruka \"Laku noc\" ispise: ");
		
		int brojPonavljanja =sc.nextInt();
		int i =0;
		
		while (i<brojPonavljanja) {
			i ++;
			System.out.println("Laku noc");
		}
	
	}

}

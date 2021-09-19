package paket_3_vezbanje;

import java.util.Scanner;

public class DomaciSabiranjeBrojevaDoUnosaNegativnog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Napisati program koji unosi i sabira brojeve dokle god nije unesen 
		  negativan broj, 
		  i ispisuje njihov zbir (zbir pozitivnih brojeva).
		primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
	*/
		
		Scanner sc = new Scanner(System.in);
		
		int unetiBroj=0;
		int zbir =0;
		
		
		while (unetiBroj >= 0 ) {
			System.out.println( "Unesite broj: ");
			unetiBroj = sc.nextInt();
			if (unetiBroj<0) {
				break;
				
			}
		
			zbir = zbir + unetiBroj;
			System.out.println( "Zbir pozitivnih brojeva: " + zbir);
		}
		
		
		
		
	}

}

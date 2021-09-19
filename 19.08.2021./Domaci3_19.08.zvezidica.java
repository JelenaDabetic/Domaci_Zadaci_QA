package paket1;

import java.util.Scanner;

public class Treci_domaci_zvezdica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*

3.	(Koristiti while petlju)-Napisati program koji stampa
sliku na ekranu za N redova. N unosi korisnik preko
skenera.
(Koristiti for petlju)
Na primer N: 5
*
**
***
****
*****

		*/


		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi broj: ");
		int n= sc.nextInt();
/*		String z = "*';";

		for(int i =0; i<n; i++) {
			System.out.println(z);
			z= z+ "*";
		}
*/

	//----------------
		String zv= "";
		for(int j=1; j<n; j++) {
			zv=zv+ "*";
			System.out.println(zv);
		}


	}

}

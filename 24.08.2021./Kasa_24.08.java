package vezbanje30_08_OdPocetka;

import java.util.Scanner;

public class LjiljinZadatak_Kasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Napisati program koji ima meni za samousluznu kasu u prodavnici. 
//		Meni za potrosace sadrzi sledece opcije:0 - Izlaz iz programa (zatvaranje kase)
//		
//		1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
//		2 - naplata racuna.
		//Ukoliko korisnik unese opciju 0 program se zavrsava.
//		
//		Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda 
//		i ta cena se dodaje na racun u prodavnici.
//		
//		Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
//		
//		Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, 
//		bez umanjenja racuna i da se ponovo ispise meni.
//		
//		Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur 
//		i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.

		
		Scanner sc=new Scanner(System.in);
		
		int opcija;
		double racun=0;
		double ceneProizvodaKupovina=0;
		double ukupnoZaNaplatu=0; 
		double kusur=0;
		 
		 do{ System.out.println("***Kasa***");
		 
		 System.out.println("Odaberite opciju: ");
		 System.out.println("0) Zatvori kasu/napusti kupovinu");
		 System.out.println("1) Dodavanje cene proizvoda na racun (ubaci u korpu)");
		 System.out.println("2) Naplata racuna");
		 
		 opcija= sc.nextInt();
		 
		 switch (opcija) {
			 
		 case 1:
			 System.out.println("Dodaj proizvod u korpu");
			 System.out.println("Unesite cenu novog proizvoda:");
             ceneProizvodaKupovina = sc.nextDouble();
             //ne moze ovako: opcija>0 && opcija<2
			while(ceneProizvodaKupovina<0) {
				System.out.println("Ne postoje besplatni proizvodi!");
			 System.out.println("Unesite cenu proizvoda");
			 ceneProizvodaKupovina=sc.nextDouble();
			}
			racun= racun+ ceneProizvodaKupovina;
			 //System.out.println("Vas racun iznosi: " + racun);
			 break;	
			 
		 case 2:
			 System.out.println("Naplata racuna");
			 if(racun==0) {
				 System.out.println("Neemamo sta da naplatimo.");
			 } else {
				 System.out.println("Vas racun iznosi " + racun + " din. "
		             		+ "Molimo unesite koliko novca stavljate u kasu:");
			// System.out.println("Ukupno za naplatu: ");
			 ukupnoZaNaplatu=sc.nextDouble();
			 	if(ukupnoZaNaplatu==0) {
			 		System.out.println("Odlucili ste se da vratite sve proizvode");
                    System.out.println("Pokusajte opet.");
                    racun=0;
                    break;
			 	}
			 	while (ukupnoZaNaplatu<racun && ukupnoZaNaplatu!=0) {
			 		 System.out.println("Vas iznos ne pokriva troskove racuna: " + racun + " din. "
	                     		+ "Molimo Vas ponovo unesite koliko novca dajete:");
			 		 ukupnoZaNaplatu=sc.nextDouble();
			 	}
			 		kusur=racun-ukupnoZaNaplatu;
			 		System.out.println("Vas kusur iznosi " +kusur + " din. Hvala!  Dodjite nam opet! \n");
	                 racun = 0;
	             }
	             break;  
	             
		  case 0:
              if (racun > 0) {
                  System.out.println("Vas racun nije naplacen. Morate da platite racun ili vratite sve proizvode");
                  opcija = 2;
              } else
                  System.out.println("Kasa se gasi. Izlazak iz programa.");
                  break;               
               default:
              System.out.println("Pogresan unos. Molimo Vas odaberite jednu od ponudjenih operacija.");
              break;
      }
  }
  while (opcija != 0);
			 		
			 
			 
			 //-------
	
			 
        		 
		
		
	}

}

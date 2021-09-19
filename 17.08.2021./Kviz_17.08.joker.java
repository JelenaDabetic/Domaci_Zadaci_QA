package primeri_sa_casa_vezbanje;

import java.util.Scanner;

public class RadUSkoliJoker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dobrodosli u kviz: \"Pogodite glavni grad! \" ");
		 boolean condition = true;
		  
		 
		 
		 do {
			 System.out.println("Izaberite opciju: \n" +
		 
					 "1. Francuska \n" +
					 "2. Italija \n " +
					 "3. Srbija \n" +
					 "4. Izlaz");
			 
			 int indexOpcije = sc.nextInt();
			 String glavniGrad;
			 
			 switch (indexOpcije) {
			 	case 1:
			 		System.out.println("Koji je glavni grad Francuske?");
			 		glavniGrad= sc.next(); //nextLine(); -hoce da zezne stvar, uradi nesto, uzme nesto dodatno, pa ubacuje jos nesto (moguce karakter za enter) pa vuce kasnije i program izbacuje gresku...
			 		
			 		if(glavniGrad.equalsIgnoreCase("pariz")) {
			 			System.out.println("To je tacan odgovor");													// glavniGrad.toLowerCase().equals("pariz);
			 																// glavniGrad.toLowerCase().equals("PARIZ");
			 		} else {
			 			System.out.println("To nije tacan odgovor");
			 			
			 		}
			 		
			 		break;
			 		
			 	case 2:
			 		System.out.println("Koji je glavni grad Italije?");
			 		glavniGrad= sc.next();
			 		
			 		if(glavniGrad.equalsIgnoreCase("Rim")) {
			 			System.out.println("To je tacan odgovor");													// glavniGrad.toLowerCase().equals("pariz);
			 																// glavniGrad.toLowerCase().equals("PARIZ");
			 		} else {
			 			System.out.println("To nije tacan odgovor");
			 			
			 		}
			 		break;
			 		
			 	case 3:
			 		System.out.println("Koji je glavni grad Srbije?");
			 		glavniGrad= sc.next(); 
			 		
			 		if(glavniGrad.equalsIgnoreCase("Beograd")) {
			 			System.out.println("To je tacan odgovor");													// glavniGrad.toLowerCase().equals("pariz);
			 																// glavniGrad.toLowerCase().equals("PARIZ");
			 		} else {
			 			System.out.println("To nije tacan odgovor");		// da smo ovde stavili condition= false, gore smo ga definisali kao true, tako bi nas ovde izbacilo iz petlje u ovom (ili bilo kom koraku)
			 			
			 		}
			 		break; //brejk je nasilan izlaz
			 		
			 	case 4:
			 		System.out.println("Odabrali ste izlaz");
			 		condition=false; //jako vazno, ovde manipulisemo ovim uslovom -elegantni nacin da izadjemo, jeste da definisemo uslov.
			 		break;
			 		
			 	default:
			 		System.out.println("Niste odabrali odgovarajucu opciju");
			 
			 }
			 
					 
		 }while (condition );
		 
		 sc.close();
		
		System.out.println("Kraj programa");
		
	}

}

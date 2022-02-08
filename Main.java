 /**
 * 
 * @author Gruppe 20 
 *
 */

class Main {
 /**
 * 
 * @param args ikke i bruk
 */

  public static void main(String[] args) {

	  
	  Utleiekontor kontor1 = new Utleiekontor(new Adresse("Olsvikåsen", "5178", "OLSVIK"), "12345678");
	  Bil bil1 = new Bil("42069", "BMW", "X7", "Hvit", Utleiegruppe.C, true);
	  Bil bil2 = new Bil("12345", "Lamborghini", "Gallardo", "Gul", Utleiegruppe.A, true);
	  Bil bil3 = new Bil("23456", "Tesla", "S", "Hvit", Utleiegruppe.B, true);
    Bil bil4 = new Bil("69013", "Volvo", "v90", "Sølv",Utleiegruppe.D, true);

	  kontor1.leggTilBil(bil1);
	  kontor1.leggTilBil(bil2);
	  kontor1.leggTilBil(bil3);
    kontor1.leggTilBil(bil4);
   
   Utleiekontor kontor2 = new Utleiekontor(new Adresse("bærum", "1338", "sayna"), "12346788"); 
	
	System.out.println("\n");
	//Brukercase 1:
	//Søk etter biler
	System.out.println("Første søk etter bil");
	System.out.println("====================");
	kontor1.sokBil();


	//Brukercase 2:
	//Reserver en bil
	 Kunde kunde1 = new Kunde("Kasper","Jespersen", new Adresse("Kardemommeby 3", "5187", "Kardemomme"),"345 719 19");
	kontor1.leiUt("42069", kunde1, 4);

	System.out.println("");   
	System.out.println("");
  System.out.println("Andre søk etter bil");
	System.out.println("====================");
	kontor1.sokBil();

	//Brukercase 3:
	//lever en bil tilbake

	System.out.println("Tredje søk etter bil");
	System.out.println("====================");
	
	//Det skal være en bil i kontor 2
	System.out.println("Biler i kontor 2");
	kontor2.returner(kunde1); 
	kontor2.sokBil();
	
	//Det skal bare være 3 biler i kontor 1
	System.out.println("Biler i kontor 1");
	kontor1.sokBil();
	//må gjøre noe med regning

  }
} 


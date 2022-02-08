 /**
 * 
 * @author Gruppe 20 
 *
 */

class Bilutleieselskap{

private String navn;
private String telefonnummer;
private Adresse firmaAdresse; 
private Utleiekontor[] utleiekontorer; 
private int antall;

 /**
 * 
 * @param navn
 * @param telefonnummer
 * @param firmaAdresse
 */


public Bilutleieselskap (String navn, String telefonnummer, Adresse firmaAdresse) {

this.navn = navn;
this.telefonnummer = telefonnummer;
this.firmaAdresse = firmaAdresse;
this.antall = 0;

}


/**
* Legg til utleiekontor til selskapet
* @return boolean, true/false om har klart å legge til 
*/
public boolean leggTilKontor(Utleiekontor utleiekontor){
	if(utleiekontorer.length < antall){
			return false;
		}
		utleiekontorer[antall] = utleiekontor;
		antall++;
		return true;
}

/**
*Metode for å søke etter alle ledige biler som tilhører
*bilutleieselskapet
*/
public void sokUtleieKontor(){
	for(int i = 0; i < antall; i++) {
    System.out.println(utleiekontorer[i].toString()); 
		utleiekontorer[i].sokBil(); 
	}

}

/**
	 * 
	 * @param x
	 * @param y
	 * @param bilNummer
	 */
	
	public void flytt(Utleiekontor x, Utleiekontor y, String bilNummer) {

		Bil[] kontor1 = x.getBiler();
		

		Bil utilgjengeligBil = null;

		for (int i = 0; i < x.getAntall(); i++) {

			if (kontor1[i].getLedig() && kontor1[i].getRegistreringsNr().equals(bilNummer)) {

				// Vi har plukket ut en bil med et spesifikt bilnummer
				utilgjengeligBil = kontor1[i];

				// Fjerne bile fra tabellen i kontor 1
				x.fjernBil(bilNummer);

				break;

			}

		}
		//Legg til bilen vi fjernet i kontor 2 
		
		y.leggTilBil(utilgjengeligBil); 
		
	}
	
/**
 * 
 * @param IdKontor1, id til kontor man flytter fra
 * @param IdKontor2, id til kontor man flytter til
 * @param regBil, id til bil man vil leie
 * @param kunde, kunden som leier bil
 * @param antallDager, antall dager bilen blir leid
 */
	
	public void leiUt(int IdKontor1, int IdKontor2, String regBil, Kunde kunde, int antallDager ) {
		
		Utleiekontor kontor1 = null; 
		Utleiekontor kontor2 = null; 
		
		
		for(int i = 0; i < antall; i++) {
			
			//Her finner vi et utleiekontor som har samme id osm regKontor1
			if( utleiekontorer[i].getIdNummer() == IdKontor1) {
				
				kontor1 = utleiekontorer[i];   		
			}
			
			if(utleiekontorer[i].getIdNummer() == IdKontor2) {
				
				kontor2 = utleiekontorer[i];
			}
			
			
		}
		
		
		flytt(kontor1, kontor2, regBil);
		kontor2.leiUt(regBil, kunde, antallDager);
		
  }

  /**
 * 
 * @param kunde
 */
	
	public void returner(Kunde kunde) {
		
		Utleiekontor kontor1 = null;
		
		for(int i = 0; i < antall; i++) {
			Bil[] biler = utleiekontorer[i].getBiler();
			for(int j = 0; j < utleiekontorer[i].getAntall(); j++) {
				if(kunde.getReservasjon().getBil().getRegistreringsNr().equals(biler[j].getRegistreringsNr())) {
					kontor1 = utleiekontorer[i];
					break;
				}
			}
		}
		
		kontor1.returner(kunde);
		
		
		
		
	}

}
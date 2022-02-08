
import java.time.LocalDateTime;
 /**
 * 
 * @author Gruppe 20 
 *
 */

class Utleiekontor {

	//static variabel er felles for alle objekter,
	//så dette kan vi bruke til å ha en verdi øke med 1 for hver gang vi...
	//oppretter et nytt objekt ved å øke den i konstruktøren
	private static int inkrementer = 0;
	private int idNummer;
	private Adresse kontorAdresse;
	private String telefon;
	private Bil[] biler;
	//Antall biler i bil tabellen
	private int antall;

/*
 * 
 * @param kontorAdresse
 * @param telefon
 */


	public Utleiekontor(Adresse kontorAdresse, String telefon){
		inkrementer++;
		this.idNummer = inkrementer;
		this.kontorAdresse = kontorAdresse;
    	this.telefon = telefon;
		this.biler = new Bil[50];
   		this.antall = 0;
	}
 
 /**
 * 	
 * @return the Antall
 */

	public int getAntall() {
		return antall;
	}

	
/**
 * 
 * @param antall the antall to set 
 */
	public void setAntall(int antall) {
		this.antall = antall;
	}

 /*
 * Legger til bil i utleiekontoret 
 * @param bil, bil som blir lagt til i tabellen
 * @return boolean, true/false om har klart å legge til bil
 */

	//Legg til bil i tabellen
	public boolean leggTilBil(Bil bil){
		if(biler.length < antall){
			return false;
		}
		biler[antall] = bil;
		antall++;
		return true;
	}

/**
*
* @param registreringsNr, id til bil som skal fjernes
* @return boolean, true/false om blir blir fjernet
*/
	public boolean fjernBil(String registreringsNr){
		
		for(int i = 0; i < antall; i++){
			if(biler[i].getRegistreringsNr().equals(registreringsNr)){

				//funker dette??!?!?!?!?!?!
				biler[i] = biler[antall];
				biler[antall] = null;
				antall--;
				return true;
			}
		}

		return false;
	}



 /**
 * Søker etter biler som er ledig 
 */

	//Gir deg alle ledige bilder
	public void sokBil(){
    
    for(int i = 0; i < antall; i++){
		if (biler[i].getLedig()){
        	System.out.println(biler[i]); 
      }
    }
	}

 /*
 * Leie ut en bil og sjekker om den er ledig 
 */

	//leier ut en bil til en kunde
	public boolean leiUt(String registreringsNr, Kunde kunde, int antallDager) {

	for(int i=0; i < biler.length; i++) {

		if(registreringsNr.equals(biler[i].getRegistreringsNr()) && biler[i].getLedig()){
			//si noe med at bilen tilhører en person
            
            kunde.setReservasjon(new Reservasjon(biler[i], kontorAdresse,antallDager));

            System.out.println("");  
            System.out.println("Regning før retur: ");

            int gruppePris = kunde.getReservasjon().getBil().getGruppePris();
            
            Regning regning = new Regning(registreringsNr, 60000, LocalDateTime.now(), antallDager * gruppePris);
            
			kunde.getReservasjon().setRegning(regning);
            biler[i].setLedig(false);
            System.out.println(regning.toString()); 
			return true;
        }

	}
	return false;

}

/*
	 * Utskrift av leiet bil som regning
	 */

	public Bil[] getBiler() {
		return biler;
	}

/**
 * 
 * @param biler the biler to set 
 */
	
	public void setBiler(Bil[] biler) {
		this.biler = biler;
	}

/**
 * 
 * @return the IdNummer 
 */
	
	public int getIdNummer() {
		return idNummer;
	}
	
/**
 * 
 * @param idNummer the IdNummer to set
 */

	public void setIdNummer(int idNummer) {
		this.idNummer = idNummer;
	}

 /*
 * returnere en bil til utleiekontor 
 */

	//Når man skal returnere en bil til et bilutleiekontor sier
	//vi at vi henter reservasjonen (get reservasjon) og setter den bilen som er registrer i reservasjonen til ledig
	
	public boolean returner(Kunde kunde) {
		if(kunde.getReservasjon() == null){
			return false; 
		}
		Bil bil = kunde.getReservasjon().getBil(); 
		bil.setLedig(true);
		

    double getKM = kunde.getReservasjon().getRegning().getNaKMavstand();

		kunde.getReservasjon().getRegning().setKmAvstand(getKM + antall * 150);


    System.out.println(kunde.getReservasjon().getRegning().toString()); 

		kunde.setReservasjon(null);
		
		return true;
		
	}

}

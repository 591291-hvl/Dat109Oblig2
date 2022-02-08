 /**
 *
 * @author Gruppe 20 
 *
 */

class Kunde{
  private String fornavn;
  private String etternavn;
  private Adresse adresse;
  private String telefon;
  private Reservasjon reservasjon;
  
 /**
 * 
 * @param fornavn
 * @param etternavn
 * @param adresse
 * @param telefon
 */
  
  public Kunde (String fornavn, String etternavn, Adresse adresse, String telefon) {
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.adresse = adresse;
    this.telefon = telefon;
  }
 
/**
 * 
 * @param reservasjon the reservasjon to set
 */

  public void setReservasjon(Reservasjon reservasjon){
	  this.reservasjon = reservasjon;
  }

 /**
 * 
 * @return the reservasjon 
 */

  public Reservasjon getReservasjon(){
	  return reservasjon;
  }

}
 /**
 * 
 * @author Gruppe 20 
 *
 */
class Adresse{

  public String gateadresse; 
  public String postnummer; 
  public String poststed; 
 /**
 * 
 * @param gateadresse
 * @param postnummer
 * @param poststed
 */

  public Adresse(String gateadresse, String postnummer, String poststed){
    this.gateadresse = gateadresse;
    this.postnummer = postnummer; 
    this.poststed = poststed; 
  }

 /**
 * 
 * @return the gateadresse 
 */

  public String getGateAdresse(){
    return gateadresse;
  }

 /**
  * 
  * @param gateadresse the gateadresse to set 
  */

  public void setGateAdresse(String gateadresse){
    this.gateadresse = gateadresse;
  }
 /**
   * 
   * @return the postnummer
   */

  public String getPostnummer(){
    return postnummer;
  }
 
  /**
  * 
  * @param postnummer the postnummer to set 
  */
 
  public void setPostnummer(String postnummer){
    this.postnummer = postnummer;
  }

  /**
   * 
   * @return the poststed 
   */
  
  public String getPoststed(){
    return poststed;
  }

 /**
   * 
   * @param poststed the poststed to set 
   */
   
  public void setPoststed(String poststed){
    this.poststed = poststed;
  }
  
}
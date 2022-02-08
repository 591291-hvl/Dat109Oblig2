 /**
 * 
 * @author Gruppe 20 
 *
 */

class Bil {
	private String registreringsNr;
	private String merke;
	private String modell;
	private String farge;
	private Utleiegruppe utleiegruppe;
	private boolean ledig;
  
 /**
 * 
 * @param registreringsNr
 * @param merke
 * @param modell
 * @param farge
 * @param utleiegruppe
 * @param ledig
 */

	public Bil(String registreringsNr, String merke, String modell, String farge, Utleiegruppe utleiegruppe, boolean ledig){
		this.registreringsNr = registreringsNr;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.utleiegruppe = utleiegruppe;
		this.ledig = ledig;
		
    }

 /**
 * 
 * @return the RegistreringsNr
 */
 
    public String getRegistreringsNr(){
        return registreringsNr;
    }

/**
 * 
 * @param registreringsNr the registreringsNr to set
 */
  
 public void setRegistreringsNr(String registreringsNr) {
		this.registreringsNr = registreringsNr;
	}
    
 /**
 * 
 * @return the ledig 
 */

	public boolean getLedig(){
		return ledig;
	}
  
/**
 * Endrer ledigheten til en bil
 * @param ledig the ledig to set 
 */
  
	public void setLedig(boolean ledig){
		this.ledig = ledig;
	}

/**
 * Gir pris bassert på utleiegruppen
 * @return prisForGruppe
 */
 public int getGruppePris(){
	 int prisForGruppe = 0;
	 switch(utleiegruppe){
		 case A:
		 prisForGruppe = 100;
		 break;
		 case B:
		 prisForGruppe = 150;
		 break;
		 case C:
		 prisForGruppe = 200;
		 break;
		 case D:
		 prisForGruppe = 250;
		 break;
		 default:
		 System.out.println("Feil i gruppePris");
		 break;

	 }

	return prisForGruppe;
 }


  public String toString(){
    return "Registreringsnr: " + registreringsNr + ", bilmerke: " + merke +
    ", modell: " + modell + ", farge: " + farge + ", utleiegruppe: " + utleiegruppe + 
    " ledig: " + ledig + "\n";
  }
	
}
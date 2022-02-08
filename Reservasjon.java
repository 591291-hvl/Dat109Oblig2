  
import java.time.LocalDateTime;

 /**
 * 
 * @author Gruppe 20
 *
 */

class Reservasjon{
	
	private Bil bil;
	private Adresse utleiested;
	private LocalDateTime dato;
	private int antallDager; 
  private Regning regning; 
 
 /**
 * 
 * @param Reservasjon
 * @param Bil 
 * @param antallDAger
 */

	//reserver i skranke
	//-> tid bestemmes fra og med nå
	public Reservasjon(Bil bil, Adresse utleiested, int antallDager){
    
	this.bil = bil;
	this.utleiested = utleiested;
	this.antallDager = antallDager;

	}

 /**
 * 
 * @param bil
 * @param utleiested
 * @param dato
 * @param antallDager
 */

  //Reserver på nett
  //-> tid kan bestemmes fram i tid
  public Reservasjon(Bil bil, Adresse utleiested, LocalDateTime dato, int antallDager){ 
  }

 /**
  * 
  * @return the bil
  */

  public Bil getBil() {
	return bil;

 /**
  * 
  * @param bil the bil to set 
  */

  }
  public void setBil(Bil bil) {
	this.bil = bil;
}

public Regning getRegning() {
	return regning;
}
public void setRegning(Regning regning) {
	this.regning = regning;
}



    
    
  }
  





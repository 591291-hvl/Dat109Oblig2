import java.time.LocalDateTime;

public class Regning {
	
	public String kredittkort; 
	public String regnr; 
	public double naKMavstand; 
	public LocalDateTime utleie; 
	public LocalDateTime retur;
	public double kmAvstand; 
	public int pris; 
	
/**
 * 
 * @param regnr
 * @param naKMavstand Start avstand
 * @param utleie
 * @param pris
 */
	public Regning(String regnr, double naKMavstand, 
			LocalDateTime utleie, int pris) {	
	
		this.regnr = regnr; 
		this.naKMavstand = naKMavstand; 
		this.utleie = utleie; 
		this.pris = pris; 
	} 

	public void setRetur(LocalDateTime retur) {
		this.retur = retur;
	}

public double getNaKMavstand() {
		return naKMavstand;
	}

	public void setNaKMavstand(double naKMavstand) {
		this.naKMavstand = naKMavstand;
	}

  public double getKmAvstand() {
		return kmAvstand;
	}

	public void setKmAvstand(double kmAvstand) {
		this.kmAvstand = kmAvstand;
	}


	public String toString() {
		
		if (kmAvstand == 0) {
			return "Registreringsnr: " + regnr + ", nåværende km avstand: " + 
			+ naKMavstand + ", utleie dato og tid: " + utleie; 
			
		}
		
		return "Registreringsnr: " + regnr + ", nåværende km avstand: "
				+ naKMavstand + ", utleie dato og tid: " + utleie + 
				", return dato og tid:" + retur + ", km avstand etter retur:" + kmAvstand + ", pris:" + pris; 
	}
	
	
}
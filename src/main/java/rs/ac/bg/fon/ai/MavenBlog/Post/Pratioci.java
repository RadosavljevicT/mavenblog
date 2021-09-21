package rs.ac.bg.fon.ai.MavenBlog.Post;

/**
 * KLasa koja predstavlja pratioce bloga.
 * @author Tamara Radosavljevic
 *
 */
public class Pratioci {

	/**
	 * Redni broj pratioca bloga kao int.
	 */
  public	int brojPratioca =0;
  
  /**
   * Ime pratioca bloga kao String.
   */
  public 	String ime = null;
	
  /**
   * Konstruktor koji inicijalizuje objekat i postavlja vrednost za redni broj pratioca i ime.
   * @param bP redni broj pratioca bloga kao int.
   * @param i ime pratioca bloga kao String.
   */
	public Pratioci (int bP, String i) {
		
		brojPratioca = bP;
		ime= i;
		
	}
	

	/**
	 * Metoda koja vraca redni broj pratioca bloga.
	 * @return brojPratioca redni broj pratioca bloga kao int.
	 */
	public int getBrojPratioca() {
		return brojPratioca;
	}
	
	/**
	 * Metoda koja postavlja redni broj pratioca na novu vrednost.
	 * @param brojPratioca broj pratioca bloga kao int.
	 * @throws java.lang.RuntimeException ako je vrednost rednog broja pratioca manja od nule.
	 */
	public void setBrojPratioca(int brojPratioca) {
		
		if (brojPratioca <0)
			throw new RuntimeException("Broj pratioca ne moze biti ispod 0!");
		this.brojPratioca = brojPratioca;
	}
	
	/**
	 * Metoda koja vraca ime pratioca bloga.
	 * @return ime ime pratioca bloga kao String.
	 */
	public String getIme() {
		return ime;
	}
	
	/**
	 * Metoda koja postavlja ime pratioca na novu vrednost.
	 * @param ime ime pratioca kao String.
	 * @throws java.lang.NullPointerException ako je ime pratioca null.
	 */
	public void setIme(String ime) {
		
		if (ime ==null)
			throw new NullPointerException("Ime pratioca ne moze biti null!");
		this.ime = ime;
	}
	
	
	
}
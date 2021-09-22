package rs.ac.bg.fon.ai.MavenBlog.Prevodilac;
/**
 * Klasa koja predstavlja recnik znacenja reci.
 * @author Tamara Radosavljevic
 *
 */
public class Recnik {
	
	/**
	 * Rec kao String.
	 */
	String rec;

	
	/**
	 * Metoda koja vraca rec.
	 * @return rec rec kao String.
	 */
	public String getRec() {
		return rec;
	}
	
	/**
	 * Metoda koja postavlja rec na novu vrednost.
	 * @param rec rec kao String.
	 * @throws java.lang.NullPointerException ako je rec null.
	 */

	public void setRec(String rec) {
		
		if (rec == null)
			throw new NullPointerException ("Rec ne sme biti null");
		
		this.rec = rec; 
	}
	
	
	

}

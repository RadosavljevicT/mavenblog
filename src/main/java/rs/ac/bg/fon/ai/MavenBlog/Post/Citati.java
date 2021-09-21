package rs.ac.bg.fon.ai.MavenBlog.Post;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import rs.ac.bg.fon.ai.MavenBlog.Interface.BlogInterface;
/**
 * Klasa koja predstavlja citate i nasledjuje interfejs BlogInterface.
 * @author Tamara Radosavljevic
 *
 */
public class Citati implements BlogInterface {
	
	/**
	 * Ime autora citata kao String.
	 */
	String imeAutora;
	
	/**
	 * Citat kao String.
	 */
	String citat;
	
	/**
	 * Metoda koja vraca ime autora citata.
	 * @return ime  ime autora citata kao String.
	 */
	public String getImeAutora() {
		return imeAutora;
	}
	
	/**
	 * Metoda koja postavlja ime autora citata na novu vrednost.
	 * @param ime ime autora citata kao String.
	 * @throws java.lang.NullPointerException ako je uneto ime null.
	 */

	public void setImeAutora(String imeAutora) {
		if (imeAutora == null)
			throw new NullPointerException ("Ime autora bloga ne sme biti null!");
		
		this.imeAutora = imeAutora;
	}
	
	/**
	 * Metoda koja vraca citat.
	 * @return citat citat kao String.
	 */
	public String getCitat() {
		return citat;
	}
	
	/**
	 * Metoda koja postavlja citata na novu vrednost.
	 * @param citat citat kao String.
	 * @throws java.lang.NullPointerException ako je vrednost citata null.
	 */
	public void setCitat(String citat) {
		
		if (citat == null)
		throw new NullPointerException ("Citat ne sme biti null!");
		
		this.citat = citat;
	}
	
	/**
	 * Metoda koja prikazuje citate u formatu: ime autora + citat
	 */
	@Override
	public void prikazi() {
	
		System.out.println(imeAutora + ": " +citat);
		
	}
	
	
	
	

}

package rs.ac.bg.fon.ai.MavenBlog.Post;

import java.util.Arrays;

import rs.ac.bg.fon.ai.MavenBlog.Autor.Autor;
/**
 * Klasa koja predstavlja objavu na blogu(post).
 * @author Tamara Radosavljevic
 *
 */
public class Post {

	/**
	 * Sadrzaj objave kao Sadrzaj.
	 */
	Sadrzaj sadrzaj;
	
	/**
	 * Autor objave kao Autor.
	 */
	Autor autor;
	
	/**
	 * Tagovi objave kao String[].	
	 */
	String[] tagovi;
	
	/**
	 * Datum objavljivanje objave kao String.
	 */
	String datum;
	
	/**
	 * Metoda koja vraca sve tagove na objavi.
	 * @return tagovi tagove kao String[].
	 */
	public String[] getTagovi() {
		return tagovi;
	}
	
	/**
	 * Metoda koja postavlja tagove na novu vrednost.
	 * @param tagovi tagovi kao String[].
	 * @throws java.lang.NullPointerException ako je vrednost tagova null.
	 */
	public void setTagovi(String[] tagovi) {
		
		if (tagovi ==null)
			throw new NullPointerException ("Blog mora imati tag!");
		this.tagovi = tagovi;
	}
	
	/**
	 * Metoda koja vraca datum objavljivanja objave.
	 * @return datum datum kao String.
	 */
	public String getDatum() {
		return datum;
	}
	
	/**
	 * Metoda koja postavlja datum na novu vrednost.
	 * @param datum datum kao String
	 * @throws java.lang.NullPointerException ako je vrednost datuma null.
	 */
	public void setDatum(String datum) {
		
		if (datum == null)
			throw new NullPointerException("Datum ne sme biti null!");
		this.datum = datum;
	}
	
	
}
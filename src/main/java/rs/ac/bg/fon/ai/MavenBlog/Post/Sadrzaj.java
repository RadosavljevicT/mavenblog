package rs.ac.bg.fon.ai.MavenBlog.Post;

import rs.ac.bg.fon.ai.MavenBlog.Interface.BlogInterface;

/**
 * Klasa koja predstavlja sadrzaj objave na blogu i nasledjuje interfejs BlogInterface.
 * @author Tamara Radosavljevic
 *
 */
public class Sadrzaj implements BlogInterface {
	
	/**
	 * Naslov objave kao String.
	 */
	String naslov;
	
	/**
	 * Tekst objave kao String.
	 */
	String tekst;
	
	/**
	 * Identifikacioni broj objave kao long.
	 */
	long postId;
	
	/**
	 * Metoda koja vraca identifikacioni broj objave.
	 * @return postId identifikacioni broj objave kao long.
	 */
	public long getPostId() {
		return postId;
	}
	
	/**
	 * Metoda koja postavlja identifikacioni broj objave na novu vrednost.
	 * @param postId identifikacioni broj objave kao long
	 * @throws java.lang.RuntimeException ako je identifikacioni broj objave manji od nule.
	 */
	public void setPostId(long postId) {
		
		if (postId<0)
			throw new RuntimeException("Nije dobro unet id objave!");
		this.postId = postId;
	}
	
	/**
	 * Metoda koja vraca naslov objave.
	 * @return naslov naslov objave kao String.
	 */
	public String getNaslov() {
		return naslov;
	}
	
	/**
	 * Metoda koja postavlja naslov objave na novu vrednost.
	 * @param naslov naslov objave kao String.
	 * @throws java.lang.NullPointerException ako je naslov objave null.
	 */
	public void setNaslov(String naslov) {
		
		if (naslov == null)
			throw new NullPointerException("Naslov ne sme biti null");
		
		this.naslov = naslov;
	}
	
	/**
	 * Metoda koja vraca tekst objave.
	 * @return tekst tekst objave kao String.
	 */
	public String getTekst() {
		return tekst;
	}
	
	/**
	 * Metoda koja tekst objave postavlja na novu vrednost.
	 * @param tekst tekst objave kao String.
	 * @throws java.lang.NullPointerException ako je tekst objave null.
	 */
	public void setTekst(String tekst) {
		
		if (tekst == null)
			throw new NullPointerException("Tekst ne sme biti null");
		this.tekst = tekst;
	}
	
	/**
	 * Metoda koja prikazuje informacije o sadrzaju objave u formatu:naslov + tekst.
	 */
	@Override
	public void prikazi() {
		
		System.out.println("Naslov: " +naslov+ "\n" + tekst);
		
	}
	
	

}

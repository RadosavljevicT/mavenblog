package rs.ac.bg.fon.ai.MavenBlog.Autor;

import rs.ac.bg.fon.ai.MavenBlog.Interface.BlogInterface;
/**
 * Klasa koja predstavlja autora blog posta.
 * Autor ima ime i prezime kao String vrednosti
 * @author Tamara Radosavljevic
 * @version 0.1
 *
 */
public class Autor implements BlogInterface {

	/**
	 * Ime autora kao String.
	 */
	String ime;
	/**
	 * Prezime autora kao String.
	 */
	String prezime;
	
	/**
	 * Metoda koja vraca ime autora.
	 * @return ime  ime autora kao String.
	 */
	
	public String getIme() {
		
		return ime;
	}
	
	/**
	 * Metoda koja postavlja ime autora na novu vrednost.
	 * @param ime ime autora kao String.
	 * @throws java.lang.NullPointerException ako je uneto ime null.
	 */
	public void setIme(String ime) {
		
		if (ime == null)
			throw new NullPointerException("Ime ne sme biti null");
		
		this.ime = ime;
	}
	
	/**
	 * Metoda koja vraca prezime autora.
	 * @return prezime prezime autora kao String.
	 *
	 */
	public String getPrezime() {
		
		return prezime;
	}
	
	/**
	 * Metoda koja postavlja prezime autora na novu vrednost.
	 * @param prezime prezime autora kao String.
	 * @throws java.lang.NullPointerException ako je uneto prezime null.
	 */
	public void setPrezime(String prezime) {
		
		if (prezime == null)
			throw new NullPointerException("Prezime ne sme biti null");
		
		this.prezime = prezime;
	}
	/**
	 * Metoda koja ispisuje prezime i ime autora.
	 */
	@Override
	public void prikazi() {
		
		System.out.println("Prezime: " +prezime + "\nIme: " +ime);
		
	}
	
	
}

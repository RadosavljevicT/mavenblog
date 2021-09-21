package rs.ac.bg.fon.ai.MavenBlog.Autor;

/**
 * Klasa koja predstavlja mesto stanovanja autora.
 * @author Tamara Radosavljevic
 *
 */
public class MestoStanovanja {
	/**
	 * Postanski broj mesta stanovanja autora kao int.
	 */
	int postanskiBrojMesta;
	
	/**
	 * Naziv mesta stanovanja autora kao String.
	 */
	String nazivMesta;
	
	/**
	 * Naziv drzave u kojoj autor zivi kao String.
	 */
	String nazivDrzave;
	
	/**
	 * Metoda koja vraca postanski broj mesta stanovanja.
	 * @return postanskiBrojMesta postanski broj mesta kao int.
	 */
	public int getPostanskiBrojMesta() {
		return postanskiBrojMesta;
	}
	
	/**
	 * Metoda koja postavlja postanski broj mesta stanovanja na novu vrednost.
	 * @param postanskiBrojMesta postanski broj stanovanja kao int.
	 * @throws java.lang.RuntimeException ako je postanski broj mesta manji od nule.
	 */
	public void setPostanskiBrojMesta(int postanskiBrojMesta) {
		
		if (postanskiBrojMesta<0)
			throw new RuntimeException("Niste dobro uneli postanski broj mesta!");
		
		this.postanskiBrojMesta = postanskiBrojMesta;
	}
	
	/**
	 * Metoda koja vraca naziv mesta stanovanja.
	 * @return nazivMesta naziv mesta stanovanja kao String.
	 */
	public String getNazivMesta() {
		return nazivMesta;
	}
	
	/**
	 * Metoda koja postavlja naziv mesta na novu vrednost.
	 * @param nazivMesta naziv mesta stanovanja kao String.
	 * @throws java.lang.NullPointerException ako je naziv mesta null.
	 */
	public void setNazivMesta(String nazivMesta) {
		
		if (nazivMesta ==null)
			throw new NullPointerException("Naziv mesta ne sme biti null");
		
		this.nazivMesta = nazivMesta;
	}
	
	/**
	 * Metoda koja vraca naziv drzave u kojoj autor zivi.
	 * @return nazivDrzave naziv drzave kao String.
	 */
	public String getNazivDrzave() {
		return nazivDrzave;
	}
	
	/**
	 * Metoda koja postavlja naziv drzave na novu vrednosti.
	 * @param nazivDrzave naziv drzave u kojoj autor zivi kao String.
	 * @throws java.long.NullPointerException ako je naziv drzave null.
	 */
	public void setNazivDrzave(String nazivDrzave) {
		
		if (nazivDrzave ==null)
			throw new NullPointerException("Naziv drzave ne sme biti null");
		
		this.nazivDrzave = nazivDrzave;
	}
	
	

}

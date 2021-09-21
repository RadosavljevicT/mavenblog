package rs.ac.bg.fon.ai.MavenBlog.Autor;

/**
 * Klasa koja predstavlja zanimanje autora.
 * @author Tamara Radosavljevic
 *
 */
public class Zanimanje {

	/**
	 * Sifra zanimanja autora kao int.
	 */
	int sifraZanimanja;
	
	/**
	 * Naziv zanimanja autora kao String.
	 */
	String nazivZanimanja;
	
	/**
	 * Metoda koja vraca sifru zanimanja autora.
	 * @return sifraZanimanja sifra zanimanja autora kao int.
	 */
	public int getSifraZanimanja() {
		return sifraZanimanja;
	}
	
	/**
	 * Metoda koja postavlja sifru zanimanja autora na novu vrednost.
	 * @param sifraZanimanja sifra zanimanja autora kao int.
	 * @throws java.lang.RuntimeException ako je sifra zanimanja manja od nule.
	 */
	public void setSifraZanimanja(int sifraZanimanja) {
		
		if (sifraZanimanja<0)
			throw new RuntimeException("Sifra zanimanja ne sme biti null!");
		this.sifraZanimanja = sifraZanimanja;
	}
	
	/**
	 * Metoda koja vraca naziv zanimanja autora.
	 * @return nazivZanimanja naziv zanimanja autora kao String.
	 */
	public String getNazivZanimanja() {
		return nazivZanimanja;
	}
	
	/**
	 * Metoda koja podstavlja naziv zanimanja autora na novu vrednost.
	 * @param nazivZanimanja naziv zanimanja autora kao String.
	 * @throws java.lang.NullPointerException ako je vrednost naziva zanimanja null.
	 */
	public void setNazivZanimanja(String nazivZanimanja) {
		if (nazivZanimanja ==null)
			throw new NullPointerException("Naziv zanimanje ne sme biti null");
		
		this.nazivZanimanja = nazivZanimanja;
	}
	
	
}

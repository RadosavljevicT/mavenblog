package rs.ac.bg.fon.ai.MavenBlog.Prevodilac;

/**
 * Klasa koja predstavlja recnik stranih reci.
 * @author Tamara Radosavljevic
 *
 */
public class StraniJezik {

	/**
	 * Izvorni jezik kao String.
	 */
	String izvorniJezik;
	/**
	 * Strani jezik kao String.
	 */
	String straniJezik;
	/**
	 * Tekst za prevodjenje kao String.
	 */
	String tekst;
	
	/**
	 * Metoda koja vraca izvorni jezik.
	 * @return izvorniJezik izvorniJezik kao String.
	 */
	public String getIzvorniJezik() {
		return izvorniJezik;
	}
	
	/**
	 * Metoda koja postavlja izvorni jezik na novu vrednost.
	 * @param izvorniJezik izvorni jezik kao String.
	 * @throws java.lang.NullPointerException ako je vrednost izvornog jezika null.
	 */
	public void setIzvorniJezik(String izvorniJezik) {
		
		if (izvorniJezik == null)
			throw new NullPointerException("Izvorni jezik ne sme biti null");
		this.izvorniJezik = izvorniJezik;
	}
	
	/**
	 * Metoda koja vraca strani jezik.
	 * @return straniJezik straniJezik kao String.
	 */
	public String getStraniJezik() {
		return straniJezik;
	}
	
	/**
	 * Metoda koja postavlja strani jezik na novu vrednost.
	 * @param straniJezik strani jezik kao String.
	 * @throws java.lang.NullPointerException ako je vrednost stranog jezika null.
	 */
	public void setStraniJezik(String straniJezik) {
		if (straniJezik == null)
			throw new NullPointerException("Strani jezik ne sme biti null");
		this.straniJezik = straniJezik;
	}
	
	/**
	 * Metoda koja vraca tekst koji treba da se prevede.
	 * @return tekst tekst koji treba da se prevede kao String.
	 */
	public String getTekst() {
		return tekst;
	}
	
	/**
	 * Metoda koja postavlja tekst koji treba da se prevede na novu vrednost.
	 * @param tekst tekst koji treba da se prevede kao String.
	 * @throws java.lang.NullPointerException ako je tekst koji treba da se prevede null.
	 */
	public void setTekst(String tekst) {
		
		if (tekst == null)
			throw new NullPointerException("Tekst za prevodjenje ne sme biti null!");
		this.tekst = tekst;
	}
	
	/**
	 * Metoda koja kao izlaz vraca String
	 * @return tekst vraca tekst + strani jezik + izvorni jezik kao string
	 */
	@Override
	public String toString() {
		return "q=" + tekst + "&target=" + straniJezik + "&source=" + izvorniJezik;
	}
	
	
}

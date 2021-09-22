package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

/**
 * Klasa koja predstavlja sistemsku operaciju za vracanje teksta.
 * @author Tamara Radosavljevic
 *
 */
public class SOVratiTekst {

	/**
	 * Metoda koja vraca tekst. Tekst se ucitava preko tastature.
	 * @return str tekst kao String.
	 * @throws java.lang.NullPointerException ako je vrednost teksta null.
	 */
	public static String vratiTekst() {
		
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Unesite tekst: ");
		String str= sc.nextLine();
		if ( str==null)
			throw new NullPointerException("Niste dobro uneli tekst!");
		 
		
		return str;
	}
	
}

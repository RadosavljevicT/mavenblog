package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

/**
 * Klasa koja predstavlja sistemsku operaciju za vracanje jednog tokena.
 * @author Tamara Radosavljevic
 *
 */
public class SOVratiToken {

	/**
	 * Metoda koja vraca token. Token se ucitava preko tastature.
	 * @return str token kao String.
	 * @throws java.lang.NullPointerException ako je vrednost tokena null.
	 */
	public static String vratiToken() {
		
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Unesite token: ");
		String str= sc.nextLine(); 
		if ( str==null)
			throw new NullPointerException("Niste dobro uneli token!");
		 
		
		return str;
		
	}
	
}

package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

/**
 * Klasa koja predstavlja sistemsku operaciju za vracanje naslova objave.
 * @author Tamara Radosavljevic
 *
 */
public class SOVratiNaslov {
	/**
	 * Metoda koja vraca naslov objave. Naslov se ucitava preko tastature.
	 * @return tekst tekst o uspesnosti kao String.
	 * @throws java.lang.NullPointerException ako je vrednost naslova null.
	 */
	public static String vratiNaslov() {
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Unesite naslov: ");
		
		if ( sc.nextLine()==null)
			throw new NullPointerException("Niste dobro uneli naslov!");
		String str= sc.nextLine(); 
		
		return str;
		
	}

}

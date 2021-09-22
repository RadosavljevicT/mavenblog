package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;
/**
 * Klasa koja predstavlja sistemsku operaciju za vracanje identifikacionog broja objave.
 * @author Tamara Radosavljevic
 *
 */
public class SOVratiPostID {
	
	/**
	 * Metoda koja vraca identifikacioni broj objave. Identifikacioni broj objave se ucitava preko tastature.
	 * @return num indentifikacioni broj objave kao long
	 * @throws java.lang.RuntimeException ako je vrednost identifikacionog broja manja od nule.
	 */
	public static long vratiPostID(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite ID objave: ");
		long num = sc.nextLong();
		if (num <0)
			throw new RuntimeException("Niste dobro uneli ID objave!");
		
		
		
		return num;
		
	}

}

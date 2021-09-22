package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

import com.tumblr.jumblr.JumblrClient;
/**
 * Klasa koja predstavlja sistemsku aplikaciju za kreiranje Oauth autentifikacije.
 * @author Tamara Radosavljevic
 *
 */
public class SOOauthAutentifikacija {

	/**
	 * Metoda koja kreira Oauth autentifikaciju. Kreira se tako sto se ucitaju vrednosti dva tokena sa tastature i pozove odgovarajuca metoda koja postavlja vrednost tokena.
	 * @throws java.lang.NullPointerException ako su vrednosti prvog tokena i/ili drugog tokena null.
	 */
	public static void oauthAutentifikacija() {
		
		
				JumblrClient client = new JumblrClient(
				  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
				  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
				);
				
				System.out.println("Unesite prvi token:");
				Scanner in = new Scanner(System.in);
				 
		        String s1 = in.nextLine();
		        
		        System.out.println("Unesite drugi token:");
		        Scanner in2 = new Scanner(System.in);
				 
		        String s2 = in2.nextLine();
		 
		        if (s1 ==null || s2 == null)
		   		 throw new NullPointerException ("Tokeni ne smeju biti null!");
		        else
				client.setToken(s1,s2);

		
		
	}
	
}

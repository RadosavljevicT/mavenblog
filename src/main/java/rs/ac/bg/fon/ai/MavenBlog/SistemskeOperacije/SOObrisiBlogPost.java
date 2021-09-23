package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import com.tumblr.jumblr.JumblrClient;
/**
 * Klasa koja predstavlja sistemsku operaciju za brisanje objave na blogu.
 * @author Tamara Radosavljevic
 *
 */
public class SOObrisiBlogPost {
	
	/**
	 * Metoda koja brise objavu na blogu. Brisanje je omoguceno uz pomocu dva tokena i identifikacionog broja objave.
	* @param s1 prvi token kao String
	 * @param s2 drugi token kao String
	 * @param postId identifikacioni broj objave koju zelimo da obrisemo
	 * @throws java.lang.NullPointerException ako je vrednost prvog tokena i/ili drugog tokena null.
	 */

public static void obrisiBlogPost(String s1, String s2, long postId) {
	
	JumblrClient client = new JumblrClient(
			  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
			  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
			);
			
	if (s1 ==null || s2 == null)
		 throw new NullPointerException ("Tokeni ne smeju biti null!"); 
	
	
	client.setToken(s1,s2);
			
			client.postDelete("student-engineer.tumblr.com",postId);
			System.out.println("Uspesno ste obrisali objavu!");
			
			

	
}
}

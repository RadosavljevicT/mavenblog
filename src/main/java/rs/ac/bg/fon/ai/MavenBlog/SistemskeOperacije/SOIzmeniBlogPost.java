package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.TextPost;
/**
 * Klasa koja predstavlja sistemsku operaciju za izmenu objave na blogu
 * @author Tamara Radosavljevic
 *
 */
public class SOIzmeniBlogPost {

	/**
	 * Metoda koja izmenjuje objavu na blogu. To radi pomocu dva tokena i identifikacionog broja objave koju zelimo da izmenimo.
	 * @param s1 prvi token kao String
	 * @param s2 drugi token kao String
	 * @param naslov novi naslov objave kao String
	 * @param tekst novi tekst objave kao String
	 * @param postId identifikacioni broj objave koju zelimo da menjamo
	 * @return poruka o uspesnosti
	 * @throws java.lang.NullPointerException ako je vrednost prvog tokena i/ili drugog tokena i/ili naslova i/ili teksta null.
	 */
public static String izmeniBlogPost(String s1, String s2, String naslov, String tekst, long postId) {
	
	JumblrClient client = new JumblrClient(
			  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
			  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
			);
			
	 if (s1 ==null || s2 == null || tekst == null || naslov==null)
		 throw new NullPointerException ("Tokeni ne smeju biti null!");
	 
	 client.setToken(s1,s2);
	TextPost post =  (TextPost)client.blogPost("student-engineer.tumblr.com", postId);
			
	post.setBody(tekst); 
	post.setTitle(naslov);
	post.save();
	
	System.out.println("Uspesno ste izmenili objavu!");
	
	return "Uspesno ste izmenili objavu!";
	
}
}

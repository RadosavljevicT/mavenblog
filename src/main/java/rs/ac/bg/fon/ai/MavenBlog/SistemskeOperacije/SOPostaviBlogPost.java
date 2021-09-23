package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.TextPost;

/**
 * Klasa koja predstavlja sistemsku operaciju za postavljanje objave na blog.
 * @author Tamara Radosavljevic
 *
 */
public class SOPostaviBlogPost {

	
	/**
	 * Metoda koja postavlja objavu na blog. To radi pomocu dva tokena.
	 * @param s1 prvi token kao String
	 * @param s2 drugi token kao String
	 * @param naslov novi naslov objave kao String
	 * @param tekst novi tekst objave kao String
	 * @return postId identifikacioni broj novog posta
	 * @throws java.lang.NullPointerException ako je vrednost prvog tokena i/ili drugog tokena i/ili naslova i/ili teksta null.
	 */
	
public static long postaviBlogPost(String s1, String s2, String tekst, String naslov) throws Exception, InstantiationException {

	JumblrClient client = new JumblrClient(
			  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
			  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
			);
			
	if (s1 ==null || s2 == null || tekst == null || naslov == null)
		 throw new NullPointerException ("Tokeni ne smeju biti null!");
			

	client.setToken(s1,s2);



	TextPost post = client.newPost("student-engineer.tumblr.com", TextPost.class);
	post.setBody(tekst);
	post.setTitle(naslov);
	post.save();
	
	/*System.out.println("Uspesno ste objavili objavu!");*/
		
	return post.getId();
	
}
	
}

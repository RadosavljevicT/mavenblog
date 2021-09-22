package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.Blog;
import com.tumblr.jumblr.types.User;

import rs.ac.bg.fon.ai.MavenBlog.Post.BlogInf;
/**
 * Klasa koja predstavlja sistemsku operaciju za vracanje informacija o blogu.
 * @author Tamara Radosavljevic
 *
 */

public class SOVratiInformacijeOBlogu {

	/**
	 * Metoda koja vraca informacije o blogu pomocu tokena.
	 * @param s1 prvi token kao String.
	 * @param s2 drugi token kao String.
	 * @return tekst tekst o uspesnosti.
	 * @throws java.lang.NullPointerException ako je vrednost prvog tokena i/ili drugog tokena null.
	 */
	public static String vratiInformacijeOBlogu(String s1, String s2)  {
		JumblrClient client = new JumblrClient(
				  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
				  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
				);
				
		 
		if (s1 ==null || s2 == null)
			 throw new NullPointerException ("Tokeni ne smeju biti null!");
			
		
				client.setToken(s1,s2);
		
		BlogInf binf = new BlogInf();
		Blog blog = client.blogInfo("student-engineer.tumblr.com");
		User user = client.user();
		
		binf.setNaslovBloga(blog.getTitle());
		binf.setUkupanBrojObjava(blog.getPostCount());
		binf.setNazivBloga(blog.getName());
		binf.setOpisBloga(blog.getDescription());
		binf.setFollowings(user.getFollowingCount());
		binf.prikazi();
		
		
		return "Uspesno ste vratili informacije o blogu!";
	}
	
}

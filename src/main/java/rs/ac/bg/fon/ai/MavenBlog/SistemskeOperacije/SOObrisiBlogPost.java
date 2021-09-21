package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import com.tumblr.jumblr.JumblrClient;

public class SOObrisiBlogPost {

public static String obrisiBlogPost(String s1, String s2, long postId) {
	
	JumblrClient client = new JumblrClient(
			  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
			  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
			);
			
	if (s1 ==null || s2 == null)
		 throw new NullPointerException ("Tokeni ne smeju biti null!"); 
	
	
	client.setToken(s1,s2);
			
			client.postDelete("student-engineer.tumblr.com",postId);
		
			System.out.println("Uspesno ste obrisali objavu!");
			
			return "Uspesno ste obrisali objavu!";
	
	
}
}

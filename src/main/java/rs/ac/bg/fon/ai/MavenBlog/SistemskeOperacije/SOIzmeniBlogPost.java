package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.TextPost;

public class SOIzmeniBlogPost {

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

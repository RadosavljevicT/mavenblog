package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.TextPost;

public class SOPostaviBlogPost {

	
	
	
public static void postaviBlogPost(String s1, String s2, String tekst) throws Exception, InstantiationException {

	JumblrClient client = new JumblrClient(
			  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
			  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
			);
			
	if (s1 ==null || s2 == null)
		 throw new NullPointerException ("Tokeni ne smeju biti null!");
			
	else {
	client.setToken(s1,s2);



	TextPost post = client.newPost("student-engineer.tumblr.com", TextPost.class);
	post.setBody(tekst);
	post.save();
	
	System.out.println("Uspesno ste objavili objavu!");
		
	}
	
}
	
}

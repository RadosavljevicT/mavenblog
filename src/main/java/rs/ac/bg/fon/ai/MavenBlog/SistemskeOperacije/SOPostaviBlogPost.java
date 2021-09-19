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
			
	 
			client.setToken(s1,s2);


	// Make the request
	TextPost post = client.newPost("student-engineer.tumblr.com", TextPost.class);
	post.setBody(tekst);
	post.save();
	
		
	}
	
	
	
}

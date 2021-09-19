package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import com.tumblr.jumblr.JumblrClient;

public class SOObrisiBlogPost {

public static void obrisiBlogPost(String s1, String s2, long postId) {
	
	JumblrClient client = new JumblrClient(
			  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
			  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
			);
			
	 
			client.setToken(s1,s2);
			
			client.postDelete("student-engineer.tumblr.com",postId);
		
	}
	
	
}

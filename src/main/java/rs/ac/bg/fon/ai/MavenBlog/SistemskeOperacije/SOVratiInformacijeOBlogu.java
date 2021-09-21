package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.Blog;
import com.tumblr.jumblr.types.User;

import rs.ac.bg.fon.ai.MavenBlog.Post.BlogInf;

public class SOVratiInformacijeOBlogu {

	
	public static void vratiInformacijeOBlogu(String s1, String s2) throws Exception {
		JumblrClient client = new JumblrClient(
				  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
				  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
				);
				
		 
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
		
		
		
	}
	
}

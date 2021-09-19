import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.Blog;
import com.tumblr.jumblr.types.Post;
import com.tumblr.jumblr.types.TextPost;
import com.tumblr.jumblr.types.User;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//Authenticate via OAuth
		JumblrClient client = new JumblrClient(
		  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
		  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
		);
		client.setToken(
		  "Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r",
		  "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG"
		);

		// Make the request
	/*	List<User> blogs = client.blogFollowers("student-engineer.tumblr.com");
		
		for (int i=0; i< blogs.size(); i++)
			System.out.println(blogs.get(i).getName()); */
		

		// Authenticate via OAuth
		/*JumblrClient client = new JumblrClient(
		  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
		  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
		);
		client.setToken(
		  "Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r",
		  "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG"
		);*/
		

		// Make the request
		TextPost post1;
		long num = 662786408964046848L;
		TextPost post =  (TextPost)client.blogPost("student-engineer.tumblr.com", num);
		
		//post1 = (TextPost) post;
		
		post.setBody("Pokusavamo da izmenimo blog post");
		post.setTitle("Izmena1");
		post.save();
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.Blog;
import com.tumblr.jumblr.types.Post;
import com.tumblr.jumblr.types.TextPost;
import com.tumblr.jumblr.types.User;

import rs.ac.bg.fon.ai.MavenBlog.Post.Pratioci;

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
		List <User> users =client.blogFollowers("student-engineer");
		Pratioci[] pratioci = new Pratioci[100];
		
		for(int i =0; i< users.size(); i++) {
			
			System.out.println(users.get(i).getName());
			
			String ime = users.get(i).getName();
			int broj = ++i;
			pratioci[i] =new Pratioci(broj,ime);
			
			
			System.out.println(pratioci[i].getBrojPratioca()+"." + pratioci[i].getIme());}
	
		
	}}

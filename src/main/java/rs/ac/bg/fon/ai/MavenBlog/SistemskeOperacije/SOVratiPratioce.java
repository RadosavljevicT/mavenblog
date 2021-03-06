package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import com.github.scribejava.apis.TumblrApi;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth1AccessToken;
import com.github.scribejava.core.model.OAuth1RequestToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth10aService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.User;

import rs.ac.bg.fon.ai.MavenBlog.Post.Pratioci;

/**
 * Klasa koja predstavlja sistemsku operaciju za vracanje pratioca.
 * @author Tamara Radosavljevic
 *
 */
public class SOVratiPratioce {

	 
	 /**
	  * Metoda koja vraca pratioce. Operacija se obavlja uz pomoc dva tokena.
	  * @param s1 prvi token kao String.
	  * @param s2 drugi token kao String.
	  * @return pratioci listu sa imenima pratioca tipa String.
	  * @throws java.lang.NullPointerException ako je vrednost prvog tokena i/ili drugog tokena null. 
	  */
	public static List<String> vratiPratioce(String s1, String s2) {
		
		JumblrClient client = new JumblrClient(
				  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
				  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
				);
				
		if (s1 ==null || s2 == null)
			 throw new NullPointerException ("Tokeni ne smeju biti null!");
		
		client.setToken(s1,s2);
		
		List <User> users =client.blogFollowers("student-engineer");
		List <String>pratioci = new ArrayList<String>();
		
		for(int i =0; i< users.size(); i++) {
			
			Pratioci p = new Pratioci(i,users.get(i).getName());
			pratioci.add(p.getIme());
			
		
			
			
			//System.out.println(pratioci.get(i));}
	}
		return pratioci;
}
}


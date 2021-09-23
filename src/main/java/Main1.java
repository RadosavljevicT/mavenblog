import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.tumblr.jumblr.JumblrClient;

import rs.ac.bg.fon.ai.MavenBlog.Post.Citati;
import rs.ac.bg.fon.ai.MavenBlog.Prevodilac.StraniJezik;
import rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije.SOObrisiBlogPost;
import rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije.SOPrevedi;

public class Main1 {
	
	
	
	public static void main(String[] args) throws Exception  {
		
		SOObrisiBlogPost.obrisiBlogPost("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG", 663133003145428992L);
	              
		

	}
		
		
	}

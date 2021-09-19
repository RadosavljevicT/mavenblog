package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class SOVratiInformacijeOBlogu {

	
	public static void vratiInformacijeOBlogu() throws Exception {
		
		
Gson gson= new Gson();
		
		URL url;
		try {
			url = new URL ("https://api.tumblr.com/v2/blog/student-engineer.tumblr.com/info?api_key=QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl");
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			JsonObject rez = gson.fromJson(reader, JsonObject.class);
			System.out.println(rez);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}

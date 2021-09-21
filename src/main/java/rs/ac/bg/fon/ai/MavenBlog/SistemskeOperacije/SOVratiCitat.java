package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import rs.ac.bg.fon.ai.MavenBlog.Post.Citati;

public class SOVratiCitat {

	
	public static void vratiCitat() throws Exception, Throwable {
		
		Citati citat = new Citati();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://andruxnet-random-famous-quotes.p.rapidapi.com/?count=1&cat=famous"))
				.header("x-rapidapi-host", "andruxnet-random-famous-quotes.p.rapidapi.com")
				.header("x-rapidapi-key", "17207c40ddmsh64e1bbf04da8840p134ddcjsn34b1d476e8e9")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
	
		
		Gson gson = new Gson();

		JsonArray r = gson.fromJson(response.body(), JsonArray.class);
		
		JsonObject c = r.get(0).getAsJsonObject();
		
		citat.setCitat(c.get("quote").getAsString());
		
		citat.setImeAutora(c.get("author").getAsString());
		
		String s = citat.toString();
		System.out.println(s);
	}
}

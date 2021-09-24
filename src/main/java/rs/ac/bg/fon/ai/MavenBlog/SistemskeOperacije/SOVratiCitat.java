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
/**
 * Klasa koja predstavlja sistemsku operaciju za vracanje citata na osnovu slucajnog odabira.
 * @author Tamara Radosavljevic
 *
 */
public class SOVratiCitat {

	/**
	 * Metoda koja vraca citat slucajnim odabirom ujedno i imenuje autora citata.
	 * @return citat objekat klase Citati.
	 * @throws Exception ako dodje do greske prilikom http odgovora.
	 * @throws Throwable ako dodje do greske prilikom http odgovora.
	 * @throws NullPointerException ukoliko su vrednosti dobijenog citata i/ili autora null.
	 */
	public static Citati vratiCitat() throws Exception, Throwable {
		
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
		
		if (c.get("quote").getAsString() == null || c.get("author").getAsString() == null)
			throw new NullPointerException ("Neispravan zahtev za dobijanje citata!");
		
		
		citat.setCitat(c.get("quote").getAsString());
		
		citat.setImeAutora(c.get("author").getAsString());
		
		//citat.prikazi();
		
		return citat;
	}
}

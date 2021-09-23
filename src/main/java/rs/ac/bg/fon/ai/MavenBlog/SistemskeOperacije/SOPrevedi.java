package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import rs.ac.bg.fon.ai.MavenBlog.Prevodilac.StraniJezik;
/**
 * Klasa koja predstavlja sistemsku operaciju za prevodjenje teksta.
 * @author Tamara Radosavljevic
 *
 */
public class SOPrevedi {

	/**
	 * Metoda koja prevodi tekst na drugi strani jezik.
	 * @param tekst tekst koji zelimo da prevedemo kao String.
	 * @return tekst prevedeni tekst kao String.
	 * @throws Exception ako dodje do greske prilikom http odgovora.
	 * @throws InterruptedException ako dodje do greske prilikom http odgovora.
	 * @throws java.langNullPointerException ukoliko su vrednosti izvornog jezika, stranog jezika, teksta ili dobijenog odgovora za prevodjenje null.
	 */
public static String prevedi(String tekst) throws Exception, InterruptedException {
		
	StraniJezik straniJezik = new StraniJezik();
	Scanner sc= new Scanner(System.in);
	System.out.println("Unesite izvorni jezik od ponudjenih:\nfr - FRANCUSKI\nen - ENGLESKI\nes - SPANSKI\nde - NEMACKI\nit - ITALIJANSKI\nru - RUSKI :");
	straniJezik.setIzvorniJezik(sc.nextLine());
	Scanner sc1= new Scanner(System.in);
	System.out.println("Unesite jezik na koji zelite da prevedete od ponudjenih:\nfr - FRANCUSKI\nen - ENGLESKI\nes - SPANSKI\nde - NEMACKI\nit - ITALIJANSKI\nru - RUSKI :");
	straniJezik.setStraniJezik(sc1.nextLine());
	Scanner sc2 = new Scanner(System.in);
	/*System.out.println("Unesite tekst:");
	straniJezik.setTekst(sc2.nextLine());*/
	straniJezik.setTekst(tekst);
	if (straniJezik.getIzvorniJezik() == null || straniJezik.getStraniJezik()== null || straniJezik.getTekst() ==null)
		throw new NullPointerException("Izvorni jezik, strani jezik i tekst ne smeju biti null!");
	
	    
	
		String t = straniJezik.toString();
	

HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://google-translate1.p.rapidapi.com/language/translate/v2"))
		.header("content-type", "application/x-www-form-urlencoded")
		.header("accept-encoding", "application/gzip")
		.header("x-rapidapi-host", "google-translate1.p.rapidapi.com")
		.header("x-rapidapi-key", "17207c40ddmsh64e1bbf04da8840p134ddcjsn34b1d476e8e9")
		.method("POST", HttpRequest.BodyPublishers.ofString(t)).build();
 HttpClient client = HttpClient.newHttpClient();
HttpResponse<String> response =client.send(request,HttpResponse.BodyHandlers.ofString());

 
Gson gson = new Gson();

JsonObject r = gson.fromJson(response.body(), JsonObject.class);

JsonArray terms = r.getAsJsonObject("data").getAsJsonArray("translations");
JsonObject translations = terms.get(0).getAsJsonObject();

if (translations == null)
	throw new NullPointerException("Neuspesan zahtev za prevodjenje!");

	    String result = translations.get("translatedText").toString();
	    System.out.println(result);


	
              return result;
}

}
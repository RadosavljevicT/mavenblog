package rs.ac.bg.fon.ai.MavenBlog.Post;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import rs.ac.bg.fon.ai.MavenBlog.Interface.BlogInterface;

public class Citati implements BlogInterface {
	
	String imeAutora;
	String citat;
	public String getImeAutora() {
		return imeAutora;
	}
	public void setImeAutora(String imeAutora) {
		this.imeAutora = imeAutora;
	}
	public String getCitat() {
		return citat;
	}
	public void setCitat(String citat) {
		this.citat = citat;
	}
	
	@Override
	public void prikazi() {
	
		System.out.println(imeAutora + ": " +citat);
		
	}
	
	
	
	

}

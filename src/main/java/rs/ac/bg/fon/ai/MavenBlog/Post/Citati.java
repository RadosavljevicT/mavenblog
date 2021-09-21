package rs.ac.bg.fon.ai.MavenBlog.Post;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Citati {
	
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
	public String toString() {
		return imeAutora + ": " +citat;
	}
	
	
	
	

}

package rs.ac.bg.fon.ai.MavenBlog.Post;

import java.util.Arrays;

public class Post {

	
	Sadrzaj sadrzaj;
	Autor autor;
	String[] tagovi;
	String datum;
	
	public String[] getTagovi() {
		return tagovi;
	}
	public void setTagovi(String[] tagovi) {
		this.tagovi = tagovi;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	
	
}
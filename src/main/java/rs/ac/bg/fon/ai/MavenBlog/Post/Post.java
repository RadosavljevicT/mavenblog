package rs.ac.bg.fon.ai.MavenBlog.Post;

import java.util.Arrays;

import rs.ac.bg.fon.ai.MavenBlog.Autor.Autor;

public class Post {

	
	Sadrzaj sadrzaj;
	Autor autor;
	String[] tagovi;
	String datum;
	
	public String[] getTagovi() {
		return tagovi;
	}
	public void setTagovi(String[] tagovi) {
		
		if (tagovi ==null)
			throw new NullPointerException ("Blog mora imati tag!");
		this.tagovi = tagovi;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		
		if (datum == null)
			throw new NullPointerException("Datum ne sme biti null!");
		this.datum = datum;
	}
	
	
}
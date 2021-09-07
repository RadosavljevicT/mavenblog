package rs.ac.bg.fon.ai.MavenBlog.Post;

import java.util.Arrays;

public class Post {

	
	String naslov;
	String sadrzaj;
	String autor;
	String[] kategorije;
	String[] tagovi;
	String datum;
	
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		
		if (naslov == null)
			throw new NullPointerException("Naslov ne sme biti null");
		
		this.naslov = naslov;
	}
	public String getSadrzaj() {
		return sadrzaj;
	}
	public void setSadrzaj(String sadrzaj) {
		
		if (sadrzaj == null)
			throw new NullPointerException("Sadrzaj ne sme biti null");
		this.sadrzaj = sadrzaj;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		
		if (autor == null)
			throw new NullPointerException("Autor ne sme biti null");
		this.autor = autor;
	}
	public String[] getKategorije() {
		return kategorije;
	}
	public void setKategorije(String[] kategorije) {
		this.kategorije = kategorije;
	}
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
		if (datum == null)
			throw new NullPointerException("Datum ne sme biti null");
		
		this.datum = datum;
	}
	
	
	@Override
	public String toString() {
		return "Post [naslov=" + naslov + ", sadrzaj=" + sadrzaj + ", autor=" + autor + ", kategorije="
				+ Arrays.toString(kategorije) + ", tagovi=" + Arrays.toString(tagovi) + ", datum=" + datum + "]";
	}
	
	
}

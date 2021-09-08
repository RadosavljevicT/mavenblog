package rs.ac.bg.fon.ai.MavenBlog.Post;

public class Sadrzaj {
	
	String naslov;
	String tekst;
	
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		
		if (naslov == null)
			throw new NullPointerException("Naslov ne sme biti null");
		
		this.naslov = naslov;
	}
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		
		if (tekst == null)
			throw new NullPointerException("Tekst ne sme biti null");
		this.tekst = tekst;
	}
	
	

}

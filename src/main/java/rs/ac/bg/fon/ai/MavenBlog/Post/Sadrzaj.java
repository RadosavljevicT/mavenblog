package rs.ac.bg.fon.ai.MavenBlog.Post;

import rs.ac.bg.fon.ai.MavenBlog.Interface.BlogInterface;

public class Sadrzaj implements BlogInterface {
	
	String naslov;
	String tekst;
	long postId;
	
	
	public long getPostId() {
		return postId;
	}
	public void setPostId(long postId) {
		
		if (postId<0)
			throw new RuntimeException("Nije dobro unet id objave!");
		this.postId = postId;
	}
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
	@Override
	public void prikazi() {
		
		System.out.println("Naslov: " +naslov+ "\n" + tekst);
		
	}
	
	

}

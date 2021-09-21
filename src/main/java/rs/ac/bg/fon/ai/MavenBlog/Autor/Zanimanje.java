package rs.ac.bg.fon.ai.MavenBlog.Autor;

public class Zanimanje {

	
	int sifraZanimanja;
	String nazivZanimanja;
	
	
	public int getSifraZanimanja() {
		return sifraZanimanja;
	}
	public void setSifraZanimanja(int sifraZanimanja) {
		
		if (sifraZanimanja<0)
			throw new RuntimeException("Sifra zanimanja ne sme biti null!");
		this.sifraZanimanja = sifraZanimanja;
	}
	public String getNazivZanimanja() {
		return nazivZanimanja;
	}
	public void setNazivZanimanja(String nazivZanimanja) {
		if (nazivZanimanja ==null)
			throw new NullPointerException("Naziv zanimanje ne sme biti null");
		
		this.nazivZanimanja = nazivZanimanja;
	}
	
	
}

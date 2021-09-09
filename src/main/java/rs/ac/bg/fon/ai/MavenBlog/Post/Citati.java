package rs.ac.bg.fon.ai.MavenBlog.Post;

public class Citati {
	
	int brojCitata;
	String kategorija;
	
	
	public int getBrojCitata() {
		return brojCitata;
	}
	public void setBrojCitata(int brojCitata) {
		
		if (brojCitata <0 || brojCitata>10)
			throw new RuntimeException("Broj citata mora biti izmedju 0 i 10");
		
		this.brojCitata = brojCitata;
	}
	public String getKategorija() {
		return kategorija;
	}
	public void setKategorija(String kategorija) {
		
		if (kategorija == null)
			throw new NullPointerException("Kategorija ne sme biti null");
		
		this.kategorija = kategorija;
	}
	
	

}

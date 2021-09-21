package rs.ac.bg.fon.ai.MavenBlog.Autor;

public class MestoStanovanja {
	
	int postanskiBrojMesta;
	String nazivMesta;
	String nazivDrzave;
	
	
	public int getPostanskiBrojMesta() {
		return postanskiBrojMesta;
	}
	public void setPostanskiBrojMesta(int postanskiBrojMesta) {
		
		if (postanskiBrojMesta<0)
			throw new RuntimeException("Niste dobro uneli postanski broj mesta!");
		
		this.postanskiBrojMesta = postanskiBrojMesta;
	}
	public String getNazivMesta() {
		return nazivMesta;
	}
	public void setNazivMesta(String nazivMesta) {
		
		if (nazivMesta ==null)
			throw new NullPointerException("Naziv mesta ne sme biti null");
		
		this.nazivMesta = nazivMesta;
	}
	public String getNazivDrzave() {
		return nazivDrzave;
	}
	public void setNazivDrzave(String nazivDrzave) {
		
		if (nazivDrzave ==null)
			throw new NullPointerException("Naziv drzave ne sme biti null");
		
		this.nazivDrzave = nazivDrzave;
	}
	
	

}

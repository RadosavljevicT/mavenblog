package rs.ac.bg.fon.ai.MavenBlog.Post;

public class Pratioci {

	
  public	int brojPratioca =0;
  public 	String ime = null;
	
	public Pratioci (int bP, String i) {
		
		brojPratioca = bP;
		ime= i;
		
	}

	public int getBrojPratioca() {
		return brojPratioca;
	}
	public void setBrojPratioca(int brojPratioca) {
		
		if (brojPratioca <0)
			throw new RuntimeException("Broj pratioca ne moze biti ispod 0!");
		this.brojPratioca = brojPratioca;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		
		if (ime ==null)
			throw new NullPointerException("Ime pratioca ne moze biti null!");
		this.ime = ime;
	}
	
	
	
}
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
		this.brojPratioca = brojPratioca;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	
	
}

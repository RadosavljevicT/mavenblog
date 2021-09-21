package rs.ac.bg.fon.ai.MavenBlog.Autor;

import rs.ac.bg.fon.ai.MavenBlog.Interface.BlogInterface;

public class Autor implements BlogInterface {

	String ime;
	String prezime;
	
	
	
	public String getIme() {
		
		return ime;
	}
	public void setIme(String ime) {
		
		if (ime == null)
			throw new NullPointerException("Ime ne sme biti null");
		
		this.ime = ime;
	}
	public String getPrezime() {
		
		return prezime;
	}
	public void setPrezime(String prezime) {
		
		if (prezime == null)
			throw new NullPointerException("Prezime ne sme biti null");
		
		this.prezime = prezime;
	}
	@Override
	public void prikazi() {
		
		System.out.println("Prezime: " +prezime + "\nIme: " +ime);
		
	}
	
	
}

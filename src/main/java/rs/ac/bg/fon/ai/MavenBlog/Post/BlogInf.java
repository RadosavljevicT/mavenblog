package rs.ac.bg.fon.ai.MavenBlog.Post;

import rs.ac.bg.fon.ai.MavenBlog.Interface.BlogInterface;

public class BlogInf implements BlogInterface  {

	String nazivBloga;
	String naslovBloga;
	int ukupanBrojObjava;
	String opisBloga;
	int followings;
	


	public String getNazivBloga() {
		return nazivBloga;
	}
	public void setNazivBloga(String nazivBloga) {
		
		if (nazivBloga ==null)
			throw new NullPointerException("Naziv bloga ne sme biti null");
		this.nazivBloga = nazivBloga;
	}
	public String getNaslovBloga() {
		return naslovBloga;
	}
	public void setNaslovBloga(String naslovBloga) {
		if (naslovBloga ==null)
			throw new NullPointerException("Naslov ne sme biti null");
		this.naslovBloga = naslovBloga;
	}
	public int getUkupanBrojObjava() {
		return ukupanBrojObjava;
	}
	public void setUkupanBrojObjava(int ukupanBrojObjava) {
		
		if (ukupanBrojObjava<0)
			throw new RuntimeException ("Ukupan broj objava ne moze biti manji od 0!");
		this.ukupanBrojObjava = ukupanBrojObjava;
	}
	public String getOpisBloga() {
		return opisBloga;
	}
	public void setOpisBloga(String opisBloga) {
		if (opisBloga ==null)
			throw new NullPointerException("Opis bloga ne sme biti null!");
		
		this.opisBloga = opisBloga;
	}

	public int getFollowings() {
		return followings;
	}
	public void setFollowings(int followings) {
		if(followings <0)
			throw new RuntimeException ("Broj ljudi koji prate blog ne moze biti manji od 0!");
		
		this.followings = followings;
	}
	
	
	@Override
	public void prikazi() {
		
		System.out.println("INFORMACIJE O BLOGU\nnaziv bloga=" + nazivBloga + "\nnaslov bloga=" + naslovBloga + "\nopis bloga=" + opisBloga +"\nukupan broj objava="
				+ ukupanBrojObjava +  "\nkoliko blogova prati=" + followings);
		
	}

	
	
	

}

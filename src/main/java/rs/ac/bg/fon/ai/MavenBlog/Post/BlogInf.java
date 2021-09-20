package rs.ac.bg.fon.ai.MavenBlog.Post;



public class BlogInf  {

	String nazivBloga;
	String naslovBloga;
	int ukupanBrojObjava;
	String opisBloga;
	int followings;
	


	public String getNazivBloga() {
		return nazivBloga;
	}
	public void setNazivBloga(String nazivBloga) {
		this.nazivBloga = nazivBloga;
	}
	public String getNaslovBloga() {
		return naslovBloga;
	}
	public void setNaslovBloga(String naslovBloga) {
		this.naslovBloga = naslovBloga;
	}
	public int getUkupanBrojObjava() {
		return ukupanBrojObjava;
	}
	public void setUkupanBrojObjava(int ukupanBrojObjava) {
		this.ukupanBrojObjava = ukupanBrojObjava;
	}
	public String getOpisBloga() {
		return opisBloga;
	}
	public void setOpisBloga(String opisBloga) {
		this.opisBloga = opisBloga;
	}

	public int getFollowings() {
		return followings;
	}
	public void setFollowings(int followings) {
		this.followings = followings;
	}
	
	@Override
	public String toString() {
		return "INFORMACIJE O BLOGU\nnaziv bloga=" + nazivBloga + "\nnaslov bloga=" + naslovBloga + "\nopis bloga=" + opisBloga +"\nukupan broj objava="
				+ ukupanBrojObjava +  "\nkoliko blogova prati=" + followings;
	}

	
	
	

}

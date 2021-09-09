package rs.ac.bg.fon.ai.MavenBlog.Prevodilac;

public class Recnik {
	
	String rec;

	public String getRec() {
		return rec;
	}

	public void setRec(String rec) {
		
		if (rec == null)
			throw new NullPointerException ("Rec ne sme biti null");
		
		this.rec = rec;
	}
	
	
	

}

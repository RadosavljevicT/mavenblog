package rs.ac.bg.fon.ai.MavenBlog.Prevodilac;

public class StraniJezik {

	
	String izvorniJezik;
	String straniJezik;
	
	
	public String getIzvorniJezik() {
		return izvorniJezik;
	}
	public void setIzvorniJezik(String izvorniJezik) {
		
		if (izvorniJezik == null)
			throw new NullPointerException("Naslov ne sme biti null");
		this.izvorniJezik = izvorniJezik;
	}
	public String getStraniJezik() {
		return straniJezik;
	}
	public void setStraniJezik(String straniJezik) {
		if (straniJezik == null)
			throw new NullPointerException("Naslov ne sme biti null");
		this.straniJezik = straniJezik;
	}
	
	
}

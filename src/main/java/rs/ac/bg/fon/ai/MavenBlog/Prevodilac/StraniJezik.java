package rs.ac.bg.fon.ai.MavenBlog.Prevodilac;

public class StraniJezik {

	
	String izvorniJezik;
	String straniJezik;
	String tekst;
	
	
	public String getIzvorniJezik() {
		return izvorniJezik;
	}
	public void setIzvorniJezik(String izvorniJezik) {
		
		if (izvorniJezik == null)
			throw new NullPointerException("Izvorni jezik ne sme biti null");
		this.izvorniJezik = izvorniJezik;
	}
	public String getStraniJezik() {
		return straniJezik;
	}
	public void setStraniJezik(String straniJezik) {
		if (straniJezik == null)
			throw new NullPointerException("Strani jezik ne sme biti null");
		this.straniJezik = straniJezik;
	}
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		
		if (tekst == null)
			throw new NullPointerException("Tekst za prevodjenje ne sme biti null!");
		this.tekst = tekst;
	}
	@Override
	public String toString() {
		return "q=" + tekst + "&target=" + straniJezik + "&source=" + izvorniJezik;
	}
	
	
}

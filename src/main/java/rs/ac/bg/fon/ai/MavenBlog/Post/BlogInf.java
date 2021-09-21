package rs.ac.bg.fon.ai.MavenBlog.Post;

import rs.ac.bg.fon.ai.MavenBlog.Interface.BlogInterface;

/**
 * Klasa koja predstavlja osnovne informacije o blogu i nasledjuje interfejs BlogInterface.
 * @author Tamara Radosavljevic
 *
 */
public class BlogInf implements BlogInterface  {

	/**
	 * Naziv bloga kao String.
	 */
	String nazivBloga;
	
	/**
	 * Naslov bloga kao String.
	 */
	String naslovBloga;
	
	/**
	 *Ukupan broj objava na blogu kao int. 
	 */
	int ukupanBrojObjava;
	
	/**
	 * Opis bloga kao String.
	 */
	String opisBloga;
	
	/**
	 * Broj blogova koje blog prati kao int.
	 */
	int followings;
	


	/**
	 * Metoda koja vraca naziv bloga.
	 * @return nazivBloga naziv bloga kao String.
	 */
	public String getNazivBloga() {
		return nazivBloga;
	}
	
	/**
	 * Metoda koja postavlja naziv bloga na novu vrednost.
	 * @param nazivBloga naziv bloga kao String.
	 * throws java.lang.NullPointerException ako je naziv bloga null.
	 */
	public void setNazivBloga(String nazivBloga) {
		
		if (nazivBloga ==null)
			throw new NullPointerException("Naziv bloga ne sme biti null");
		this.nazivBloga = nazivBloga;
	}
	
	/**
	 * Metoda koja vraca naslov bloga.
	 * @return naslovBloga naslov bloga kao String.
	 */
	public String getNaslovBloga() {
		return naslovBloga;
	}
	
	/**
	 * Metoda koja postavlja naslov bloga na novu vrednost.
	 * @param naslovBloga naslov bloga kao String.
	 * throws java.lang.NullPointerException ako je naslov bloga null.
	 */
	public void setNaslovBloga(String naslovBloga) {
		if (naslovBloga ==null)
			throw new NullPointerException("Naslov ne sme biti null");
		this.naslovBloga = naslovBloga;
	}
	
	/**
	 * Metoda koja vraca ukupan broj objava na blogu.
	 * @return ukupanBrojObjava ukupan broj objava kao int.
	 */
	public int getUkupanBrojObjava() {
		return ukupanBrojObjava;
	}
	
	/**
	 * Metoda koja postavlja ukupan broj objava na novu vrednost.
	 * @param ukupanBrojObjava ukupan broj objava kao int.
	 * @throws java.lang.RuntimeException ako je vrednost ukupnog broja objava manja od nule.
	 */
	public void setUkupanBrojObjava(int ukupanBrojObjava) {
		
		if (ukupanBrojObjava<0)
			throw new RuntimeException ("Ukupan broj objava ne moze biti manji od 0!");
		this.ukupanBrojObjava = ukupanBrojObjava;
	}
	
	/**
	 * Metoda koja vraca opis bloga.
	 * @return naslovBloga opis bloga kao String.
	 */
	public String getOpisBloga() {
		return opisBloga;
	}
	
	/**
	 * Metoda koja postavlja opis bloga na novu vrednost.
	 * @param opisBloga opis bloga kao String.
	 * throws java.lang.NullPointerException ako je opis bloga null.
	 */
	public void setOpisBloga(String opisBloga) {
		if (opisBloga ==null)
			throw new NullPointerException("Opis bloga ne sme biti null!");
		
		this.opisBloga = opisBloga;
	}

	/**
	 * Metoda koja vraca ukupan broj blogova koje blog prati.
	 * @return followings ukupan broj blogova koje blog prati kao int.
	 */
	public int getFollowings() {
		return followings;
	}
	
	/**
	 * Metoda koja postavlja ukupan broj blogova koje blog prati na novu vrednost.
	 * @param followings ukupan broj blogova koje blog prati kao int.
	 * @throws java.lang.RuntimeException ako je vrednost ukupnog broja blogova koje blog prati manja od nule.
	 */
	public void setFollowings(int followings) {
		if(followings <0)
			throw new RuntimeException ("Broj ljudi koji prate blog ne moze biti manji od 0!");
		
		this.followings = followings;
	}
	
	/**
	 * Metoda koja prikazuje informacije o blogu u formatu: naziv bloga + naslov bloga + opis bloga + ukupan broj objava+ ukupan broj blogova koje blog prati
	 */
	@Override
	public void prikazi() {
		
		System.out.println("INFORMACIJE O BLOGU\nnaziv bloga=" + nazivBloga + "\nnaslov bloga=" + naslovBloga + "\nopis bloga=" + opisBloga +"\nukupan broj objava="
				+ ukupanBrojObjava +  "\nkoliko blogova prati=" + followings);
		
	}

	
	
	

}

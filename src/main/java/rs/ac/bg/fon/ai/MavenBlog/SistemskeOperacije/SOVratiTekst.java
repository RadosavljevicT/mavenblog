package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

public class SOVratiTekst {

	
	public static String vratiTekst() {
		
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Unesite tekst: ");
		String str= sc.nextLine();
		if ( str==null)
			throw new NullPointerException("Niste dobro uneli tekst!");
		 
		
		return str;
	}
	
}

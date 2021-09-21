package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

public class SOVratiNaslov {
	
	public static String vratiNaslov() {
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Unesite naslov: ");
		
		if ( sc.nextLine()==null)
			throw new NullPointerException("Niste dobro uneli naslov!");
		String str= sc.nextLine(); 
		
		return str;
		
	}

}

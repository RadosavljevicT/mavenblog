package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

public class SOVratiToken {

	public static String vratiToken() {
		
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Unesite token: ");
		
		if ( sc.nextLine()==null)
			throw new NullPointerException("Niste dobro uneli token!");
		String str= sc.nextLine(); 
		
		return str;
		
	}
	
}

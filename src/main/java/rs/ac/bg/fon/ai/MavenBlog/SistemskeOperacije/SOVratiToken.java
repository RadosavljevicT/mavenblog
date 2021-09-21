package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

public class SOVratiToken {

	public static String vratiToken() {
		
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Unesite token: ");
		String str= sc.nextLine(); 
		if ( str==null)
			throw new NullPointerException("Niste dobro uneli token!");
		 
		
		return str;
		
	}
	
}

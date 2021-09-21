package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

public class SOVratiPostID {
	
	public static long vratiPostID(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite ID objave: ");
		long num = sc.nextLong();
		if (num <0)
			throw new RuntimeException("Niste dobro uneli ID objave!");
		
		
		
		return num;
		
	}

}

package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import java.util.Scanner;

import com.tumblr.jumblr.JumblrClient;

public class SOOauthAutentifikacija {

	public static void oauthAutentifikacija() {
		
		
				JumblrClient client = new JumblrClient(
				  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
				  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
				);
				
				System.out.println("Unesite prvi token:");
				Scanner in = new Scanner(System.in);
				 
		        String s1 = in.nextLine();
		        
		        System.out.println("Unesite drugi token:");
		        Scanner in2 = new Scanner(System.in);
				 
		        String s2 = in2.nextLine();
		 
				client.setToken(s1,s2);

		
		
	}
	
}

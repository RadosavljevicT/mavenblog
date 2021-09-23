package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.TextPost;

class SOIzmeniBlogPostTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIzmeniBlogPost() {
		
		
		String s = SOIzmeniBlogPost.izmeniBlogPost("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG", "Naslov 1", "Izmenjen tekst.",662957173863809024L);
		assertEquals("Uspesno ste izmenili objavu!", s);
		
		JumblrClient client = new JumblrClient(
				  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
				  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
				);
		 client.setToken("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG");
		 TextPost post =  (TextPost)client.blogPost("student-engineer.tumblr.com", 662957173863809024L);
		 
		
		 assertEquals("Naslov 1", post.getTitle());
		 assertEquals("<p>Izmenjen tekst.</p>", post.getBody());
		
	}
	@Test
	void testIzmeniBlogPostNull() {
		assertThrows(java.lang.NullPointerException.class, ()-> SOIzmeniBlogPost.izmeniBlogPost(null, null, null, null, 0));
	}

}

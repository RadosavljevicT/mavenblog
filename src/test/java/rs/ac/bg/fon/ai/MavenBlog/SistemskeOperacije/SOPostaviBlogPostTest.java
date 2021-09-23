package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.TextPost;

class SOPostaviBlogPostTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPostaviBlogPost() throws InstantiationException, Exception {
		
		long num = SOPostaviBlogPost.postaviBlogPost("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG", "Danas je lep dan.", "Dan 1");
		
		
		JumblrClient client = new JumblrClient(
				  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
				  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
				);
		 client.setToken("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG");
		 TextPost post =  (TextPost)client.blogPost("student-engineer.tumblr.com", num);
		 
		
		 assertEquals("Dan 1", post.getTitle());
		 assertEquals("<p>Danas je lep dan.</p>", post.getBody());
	}
	
	@Test
	void testPostaviBlogPostNull() {


		assertThrows(java.lang.NullPointerException.class, ()-> SOPostaviBlogPost.postaviBlogPost(null, null, null, null));
	}

}

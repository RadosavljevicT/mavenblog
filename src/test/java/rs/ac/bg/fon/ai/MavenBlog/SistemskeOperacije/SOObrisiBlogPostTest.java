package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.exceptions.JumblrException;
import com.tumblr.jumblr.types.Post;
import com.tumblr.jumblr.types.TextPost;

class SOObrisiBlogPostTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test 
	void testObrisiBlogPost() {
		
		/*String s = SOObrisiBlogPost.obrisiBlogPost("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG",662957722535428096L);
		assertEquals("Uspesno ste obrisali objavu!", s);*/
		
		
		JumblrClient client = new JumblrClient(
				  "QcfVaxZBTRF4Z0e03I8pTRAPV4OLmxnzWVtyZff2R5azVBhpKl",
				  "TKDxnP0l1JgGP6eOKmeUGzSu6v8Mow5siUpoYyeoMdkJsZpSVG"
				);
		client.setToken("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG");
		
		SOObrisiBlogPost.obrisiBlogPost("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG", 663136780291358720L);
		
		assertThrows(JumblrException.class, ()-> client.blogPost("student-engineer.tumblr.com", 663136780291358720L));
		
		
		
	
		
	}

	@Test
	void testObrisiBlogPostNull() {
		assertThrows(java.lang.NullPointerException.class, ()-> SOObrisiBlogPost.obrisiBlogPost(null, null, 0));
	}
}

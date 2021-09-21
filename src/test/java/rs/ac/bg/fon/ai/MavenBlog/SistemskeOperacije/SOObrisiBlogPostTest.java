package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SOObrisiBlogPostTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testObrisiBlogPost() {
	
		String s = SOObrisiBlogPost.obrisiBlogPost("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG",662957722535428096L);
		assertEquals("Uspesno ste obrisali objavu!", s);
		
	}

	@Test
	void testObrisiBlogPostNull() {
		assertThrows(java.lang.NullPointerException.class, ()-> SOObrisiBlogPost.obrisiBlogPost(null, null, 0));
	}
}

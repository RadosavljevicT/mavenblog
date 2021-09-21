package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SOPostaviBlogPostTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPostaviBlogPost() throws InstantiationException, Exception {
		String s = SOPostaviBlogPost.postaviBlogPost("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG", "Danas je lep dan.", "Dan 1");
		assertEquals("Uspesno ste objavili objavu!", s);
	}
	
	@Test
	void testPostaviBlogPostNull() {


		assertThrows(java.lang.NullPointerException.class, ()-> SOPostaviBlogPost.postaviBlogPost(null, null, null, null));
	}

}

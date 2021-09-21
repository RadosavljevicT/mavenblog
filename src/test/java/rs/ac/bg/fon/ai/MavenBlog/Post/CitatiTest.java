package rs.ac.bg.fon.ai.MavenBlog.Post;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CitatiTest {

	Citati c;
	@BeforeEach
	void setUp() throws Exception {
		c = new Citati();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetImeAutora() {
		c.setImeAutora("Marcus Aurelius");
		assertEquals("Marcus Aurelius", c.getImeAutora());
	}
	
	@Test
	void testSetImeAutoraNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> c.setImeAutora(null));
		
	}

	@Test
	void testSetCitat() {
		c.setCitat("Dwell on the beauty of life. Watch the stars, and see yourself running with them.");
		assertEquals("Dwell on the beauty of life. Watch the stars, and see yourself running with them.", c.getCitat());
	}
	
	@Test
	void testSetCitatNaNUll() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> c.setCitat(null));
	}
}

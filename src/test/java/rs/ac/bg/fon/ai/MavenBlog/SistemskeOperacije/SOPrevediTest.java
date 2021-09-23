package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SOPrevediTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPrevedi() throws InterruptedException, Exception {
		String s = SOPrevedi.prevedi("Hello");
		assertNotEquals("Hello",s);
	}
	
	@Test
	void testPrevediNull() {
		assertThrows(java.lang.NullPointerException.class, ()-> SOPrevedi.prevedi(null));
		
	}

}

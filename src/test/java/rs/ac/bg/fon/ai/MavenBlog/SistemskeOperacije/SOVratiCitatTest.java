package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rs.ac.bg.fon.ai.MavenBlog.Post.Citati;

class SOVratiCitatTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testVratiCitat() throws Exception, Throwable {
		Citati c = SOVratiCitat.vratiCitat();
		
		assertNotNull(c.getCitat());
		assertNotNull(c.getImeAutora());
		
		
	}
	

}

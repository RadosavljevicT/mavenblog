package rs.ac.bg.fon.ai.MavenBlog.Post;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PratiociTest {

	Pratioci p;
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPratioci() {
		 p = new Pratioci(3, "Ana");
		 
		 assertNotNull(p);
		 assertEquals(3, p.getBrojPratioca());
		 assertEquals("Ana", p.getIme());
		 
	}

	@Test
	void testSetBrojPratioca() {
		p = new Pratioci(3, "Ana");
		 assertEquals(3, p.getBrojPratioca());
	}

	void testSetBrojPratiocaNijeNula() {
		
		assertThrows(java.lang.RuntimeException.class, ()-> p.setBrojPratioca(Integer.MIN_VALUE));
	}
	@Test
	void testSetIme() {
		 p = new Pratioci(3, "Ana");
		 assertEquals("Ana", p.getIme());
	}
	
	@Test
	void testSetImeNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> p.setIme(null));
	}

}

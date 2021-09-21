package rs.ac.bg.fon.ai.MavenBlog.Autor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZanimanjeTest {

	Zanimanje z;
	@BeforeEach
	void setUp() throws Exception {
		z= new Zanimanje();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetSifraZanimanja() {
		z.setSifraZanimanja(1010);
		assertEquals(1010, z.getSifraZanimanja());
	}

	@Test
	void testSetSifraZanimanjaManjaOdNule() {
		assertThrows(java.lang.RuntimeException.class, ()-> z.setSifraZanimanja(Integer.MIN_VALUE));
	}
	@Test
	void testSetNazivZanimanja() {
		z.setNazivZanimanja("vaspitacica");
		assertEquals("vaspitacica", z.getNazivZanimanja());
	}

	@Test
	void testSetNazivZanimanjaNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()->z.setNazivZanimanja(null));
	}

}

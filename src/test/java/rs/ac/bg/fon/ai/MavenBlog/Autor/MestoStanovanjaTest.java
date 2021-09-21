package rs.ac.bg.fon.ai.MavenBlog.Autor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MestoStanovanjaTest {

	MestoStanovanja m;
	@BeforeEach
	void setUp() throws Exception {
		
		m = new MestoStanovanja();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetPostanskiBrojMesta() {
		m.setPostanskiBrojMesta(26300);
		
		assertEquals(26300, m.getPostanskiBrojMesta());
	}
	@Test
	void testSetPostanskiBrojMestaManjiOdNule() {
		
		
		assertThrows(java.lang.RuntimeException.class, ()-> m.setPostanskiBrojMesta(Integer.MIN_VALUE));
	}

	@Test
	void testSetNazivMesta() {
		m.setNazivMesta("Vrsac");
		assertEquals("Vrsac", m.getNazivMesta());
	}

	@Test
	void testSetNazivMestaNull() {
		
		
		assertThrows(java.lang.NullPointerException.class, ()-> m.setNazivMesta(null));
	}
	@Test
	void testSetNazivDrzave() {
		m.setNazivDrzave("Srbija");
		assertEquals("Srbija", m.getNazivDrzave());
	}

	@Test
	void testSetNazivDrzaveNull() {
		
		
		assertThrows(java.lang.NullPointerException.class, ()-> m.setNazivDrzave(null));
	}
}

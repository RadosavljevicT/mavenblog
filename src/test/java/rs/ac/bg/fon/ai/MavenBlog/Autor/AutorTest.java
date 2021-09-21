package rs.ac.bg.fon.ai.MavenBlog.Autor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AutorTest {

	Autor a;
	
	@BeforeEach
	void setUp() throws Exception {
		a = new Autor();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetIme() {
	
	a.setIme("Tamara");
	assertEquals("Tamara", a.getIme());
	}
	
	@Test
	void testSetImeNull() {
		
	
	assertThrows(java.lang.NullPointerException.class, ()-> a.setIme(null));
	}

	@Test
	void testSetPrezime() {
	
	a.setPrezime("Radosavljevic");
	assertEquals("Radosavljevic", a.getPrezime());
	}
	
	@Test
	void testSetPrezimeNull() {
	
	
	assertThrows(java.lang.NullPointerException.class, ()-> a.setPrezime(null));
	}

}

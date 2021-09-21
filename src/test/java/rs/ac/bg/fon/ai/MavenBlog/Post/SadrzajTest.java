package rs.ac.bg.fon.ai.MavenBlog.Post;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SadrzajTest {

	Sadrzaj s;
	@BeforeEach
	void setUp() throws Exception {
		
		s = new Sadrzaj();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetPostId() {
		s.setPostId(1234567);
		
		assertEquals(1234567, s.getPostId());
	}
	
	@Test
	void testSetPostIdNula() {
	
		assertThrows(java.lang.RuntimeException.class, ()-> s.setPostId(Integer.MIN_VALUE));
	}

	@Test
	void testSetNaslov() {
		
		s.setNaslov("Prva objava");
		assertEquals("Prva objava", s.getNaslov());
	}
	
	@Test
	void testSetNaslovNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> s.setNaslov(null));
	}

	@Test
	void testSetTekst() {
		s.setTekst("Moj prvi tekst.");
		assertEquals("Moj prvi tekst.", s.getTekst());
	}
	
	@Test
	void testSetTekstNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> s.setTekst(null));
	}
	}



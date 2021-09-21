package rs.ac.bg.fon.ai.MavenBlog.Post;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostTest {

	Post p;
	@BeforeEach
	void setUp() throws Exception {
		p= new Post();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetTagovi() {
		String[] tag = new String[2];
		tag[0] = "blog";
		tag[1]= "post";
		p.setTagovi(tag);
		
		assertEquals(tag, p.getTagovi());
	}

	@Test
	void testSetTagoviNull(){
		
		assertThrows(java.lang.NullPointerException.class, ()->p.setTagovi(null));
		
	}
	@Test
	void testSetDatum() {
		p.setDatum("01/01/2021");
		assertEquals("01/01/2021", p.getDatum());
	}

	@Test
	void testSetDatumNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> p.setDatum(null));
	}
}

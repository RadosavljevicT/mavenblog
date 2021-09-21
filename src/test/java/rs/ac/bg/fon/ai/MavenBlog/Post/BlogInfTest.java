package rs.ac.bg.fon.ai.MavenBlog.Post;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BlogInfTest {

	BlogInf b;
	@BeforeEach
	void setUp() throws Exception {
		b = new BlogInf();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetNazivBloga() {
		b.setNazivBloga("student-engineer");
		assertEquals("student-engineer", b.getNazivBloga());
	}
	@Test
	void testSetNazivBlogaNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> b.setNazivBloga(null));
	}

	@Test
	void testSetNaslovBloga() {
		b.setNaslovBloga("IT Student");
		assertEquals("IT Student", b.getNaslovBloga());
	}
	@Test
	void testSetNaslovBlogaNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> b.setNaslovBloga(null));
		
	}
	@Test
	void testSetUkupanBrojObjava() {
		b.setUkupanBrojObjava(52);
		assertEquals(52, b.getUkupanBrojObjava());
	}

	@Test
	void testSetUkupanBrojObjavaManjiOdNula() {
		
		assertThrows(java.lang.RuntimeException.class, ()-> b.setUkupanBrojObjava(Integer.MIN_VALUE));
	}
	@Test
	void testSetOpisBloga() {
		b.setOpisBloga("Ovo je blog za testiranje studentskog koda");
		assertEquals("Ovo je blog za testiranje studentskog koda", b.getOpisBloga());
	}
	@Test
	void testSetOpisBlogaNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> b.setOpisBloga(null));
	}

	@Test
	void testSetFollowings() {
		b.setFollowings(0);
		assertEquals(0, b.getFollowings());
	}
	
	void testSetFollowingManjiOdNule() {
		
		assertThrows(java.lang.RuntimeException.class, ()-> b.setFollowings(Integer.MIN_VALUE));
	}

}

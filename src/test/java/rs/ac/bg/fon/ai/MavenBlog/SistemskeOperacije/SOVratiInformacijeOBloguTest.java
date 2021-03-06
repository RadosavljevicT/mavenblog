package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rs.ac.bg.fon.ai.MavenBlog.Post.BlogInf;

class SOVratiInformacijeOBloguTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testVratiInformacijeOBlogu() throws Exception {
	
		BlogInf b = SOVratiInformacijeOBlogu.vratiInformacijeOBlogu("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG");
		assertNotNull(b.getFollowings());
		assertNotNull(b.getNaslovBloga());
		assertNotNull(b.getNazivBloga());
		assertNotNull(b.getOpisBloga());
		assertNotNull(b.getUkupanBrojObjava());
	}

	@Test
	void testVratiInformacijeOBloguNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> SOVratiInformacijeOBlogu.vratiInformacijeOBlogu(null, null));
	}
}

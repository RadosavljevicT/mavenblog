package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SOVratiInformacijeOBloguTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testVratiInformacijeOBlogu() throws Exception {
	
		String s = SOVratiInformacijeOBlogu.vratiInformacijeOBlogu("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG");
		assertEquals("Uspesno ste vratili informacije o blogu!", s);
	}

	@Test
	void testVratiInformacijeOBloguNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> SOVratiInformacijeOBlogu.vratiInformacijeOBlogu(null, null));
	}
}

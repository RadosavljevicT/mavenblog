package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SOVratiPratioceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testVratiPratioce() {
		String s = SOVratiPratioce.vratiPratioce("Z1WRBy57YUtf1S6JsOGhERZn7lfPjquiFmXcRJVvYfDW4o9P6r", "XXyP03ryxjCHomA1Qi5cRzCDMnZyoPr4ZbxBdpWSloJTD7sWxG");
		assertEquals("Uspesno ste vratili pratioce!", s);
	}
	
	@Test
	void testVratiPratioceNull() {
		assertThrows(java.lang.NullPointerException.class, ()-> SOVratiPratioce.vratiPratioce(null, null) );
	}

}
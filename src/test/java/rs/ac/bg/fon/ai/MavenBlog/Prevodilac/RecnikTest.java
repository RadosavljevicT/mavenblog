package rs.ac.bg.fon.ai.MavenBlog.Prevodilac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecnikTest {

	Recnik r;
	void setUp() throws Exception {
		
		}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetRec() {
		r = new Recnik();
		r.setRec("rec");
		 assertEquals("rec", r.getRec());
	}

	@Test
	void testSetRecNull() {
		
		assertThrows(java.lang.NullPointerException.class, ()-> r.setRec(null));
		
	}
}

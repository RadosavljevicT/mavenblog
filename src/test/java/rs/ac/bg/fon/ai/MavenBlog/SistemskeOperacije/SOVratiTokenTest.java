package rs.ac.bg.fon.ai.MavenBlog.SistemskeOperacije;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SOVratiTokenTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testVratiToken() {
	assertNotNull(SOVratiToken.vratiToken());
	}

}

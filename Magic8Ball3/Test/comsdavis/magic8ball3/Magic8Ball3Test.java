package comsdavis.magic8ball3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Magic8Ball3Test {
	
	private static Magic8Ball3 m8b3;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		m8b3 = new Magic8Ball3();
		
	}

	@Test
	@Order(1)
	void magic8Ball3_GivenNoParameters_ShouldContructObject() {
		assertTrue(m8b3 instanceof Magic8Ball3);
	}
	
	@Test
	@Order(2)
	void askQestion_GivenAString_ShouldReturnTrue() {
		boolean success = false;
		String question = "Should I cut bangs into my hair?";
		
		success = m8b3.askQuestion(question);
		assertTrue(success);
		assertEquals(question, m8b3.getQuestion());
		
			
		
	}
	@Test
	@Order(3)
	void shake_GivenNoParameters_ShouldReturnAnser() {
		String answer = null;
		answer = m8b3.shake();
		assertNotEquals("Idiot!", answer);
		assertNotNull(answer);
		
		
		

		

	}
		
}
	


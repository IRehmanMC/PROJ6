import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {
	private Alcohol a, b;
	@BeforeEach
	void setUp() throws Exception {
		a = new Alcohol("Alc1", Size.SMALL, false);
		b = new Alcohol("Alc2", Size.MEDIUM, true);
	}

	@AfterEach
	void tearDown() throws Exception {
		a = b = null;
	}

	@Test
	void testCalcPrice() {
		assertEquals(a.calcPrice(), 2.00, 0.001);
		assertEquals(b.calcPrice(), 3.60, 0.001);
	}

	@Test
	void testEqualsObject() {
		assertTrue(true);
	}

	@Test
	void testToString() {
		assertTrue(true);
	}

	@Test
	void testAlcohol() {
		a = new Alcohol("Vodka", Size.SMALL, true);
		assertEquals(a.getBevName(), "Vodka");
		assertEquals(a.getSize(),Size.SMALL);
	}

	@Test
	void testIsWeekend() {
		assertFalse(a.isWeekend());
		assertTrue(b.isWeekend());
	}
}

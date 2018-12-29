package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import elements.Floor;

class FloorTest {

	@Test
	void test() {
		fail("Not yet implemented");
		
		Floor floor1 = new Floor(1);
		Floor floor2 = new Floor(2);
		
		assertTrue( floor1.equals(floor1) );		
		assertFalse( floor1.equals(floor2) );
	}
	
	@Test
	void testSome() {
		
	}

}

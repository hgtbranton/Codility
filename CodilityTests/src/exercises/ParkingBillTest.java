package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParkingBillTest {

	@Test
	void sample() {
		assertEquals(17, ParkingBill.solution("10:00", "13:21"));
	}
	
	@Test
	void simple() {
		assertEquals(29, ParkingBill.solution("12:49", "19:00"));
	}
	
	@Test
	void edgeCase() {
		assertEquals(5, ParkingBill.solution("10:00", "10:01"));
		assertEquals(97, ParkingBill.solution("00:01", "23:59"));
	}

}

package buildToTestLab;


import static org.junit.Assert.*;

import org.junit.*;

public class DateAddDaysTest {
	
	@Test
	public static void TestaddMonth() {
		Date over = new Date(1, 30, 2024);
		over.addOneDay();
		assertEquals(new Date(2,1,2024), over);
	}
	
	@Test
	public static void TestaddYear() {
		Date year = new Date(12, 31, 2024);
		year.addOneDay();
		assertEquals(new Date(1, 1, 2025), year);
	}
	
	@Test
	public void stayInSameMonth() {
			
		Date startDate = new Date("June", 10, 2019);
		startDate.addOneDay();
		assertEquals(new Date("June", 11, 2019), startDate);
	}

}

class DateSetDateTest {
	@Test
	public void TestSet() {
		Date changed = new Date(1,1,2024);
		changed.setDate("January", 2, 2025);
		assertEquals(new Date("January", 2, 2025), changed);
	}
	@Test
	public void TestIllegalDate() {
		Date wrong = new Date(1,1,2024);
		wrong.setDate("January", 40, 2024);
		assertEquals(new Date("January",40,2024), wrong);
	}
}

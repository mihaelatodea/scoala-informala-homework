package ro.sci.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeesTest {

	@Test
	public void test() {
		Employees employee = new Employees("Valerian", "tester", 1, false);
		

		if (employee instanceof Employees) {

			assertEquals("Valerian", employee.getName());
			assertEquals("tester", employee.getPosition());
			assertEquals(1, employee.getSeniority());
			assertEquals(false, employee.isParking());
		}
		
	}
	
	@Test
	public void anotherTest(){
		
		Employees employee1 = new Employees("Valentin", "manager", 15, true);
		
             if (employee1 instanceof Employees) {
			
			assertEquals("Valentin", employee1.getName());
			assertEquals("manager", employee1.getPosition());
			assertEquals(15, employee1.getSeniority());
			assertEquals(true, employee1.isParking());
			
			
		}
		
	}

}

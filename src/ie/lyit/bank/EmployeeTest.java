package ie.lyit.bank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	Employee n1;
	@Before
	public void setUp() throws Exception {
		n1 = new Employee(new Name("Mr", "Jeff", "Surname"), 
						  new Date(25,12,1995), 
						  new Date(21,2,2018), 45000);
	}
	
	// assert is like assume...
	@Test
	public void testSetName() {
		n1.setName(new Name("Mrs", "Jess", "Surname"));
		assertEquals(n1.getName(), new Name("Mrs", "Jess", "Surname"));
	}

	@Test
	public void testSetDateOfBirth() {
		n1.setDateOfBirth(new Date(31, 11, 1999));
		assertEquals(n1.getDateOfBirth(), new Date(31, 11, 1999));
	}

	@Test
	public void testEmployeeNameDateDateDouble() {
		assertEquals(n1.getName(), new Name("Mr", "Jeff", "Surname"));
		assertEquals(n1.getDateOfBirth(), new Date(25,12,1995));
		assertEquals(n1.getstartDate(), new Date(21, 2, 2018));
		assertTrue(n1.getSalary() == 45000);
	}

	@Test
	public void testIncrementSalary() {
		try 
		{
			n1.incrementSalary(50);
			assertTrue(n1.getSalary()==45050);
		}catch(IllegalArgumentException e)
		{
			System.out.print(e.getMessage());
		}
	}

	@Test
	public void testCalculateWage() {
		assertTrue(40500 == n1.calculateWage(10));
	}

	@Test
	public void testSetStartDate() {
		assertEquals(n1.getstartDate(), new Date(21, 2, 2018));
	}

	@Test
	public void testSetSalary() {
		n1.setSalary(18000);
		assertTrue(n1.getSalary() == 18000);	
	}
	
	// test for increment salary
	@Test (expected = IllegalArgumentException.class)
	public void testIncrementSalaryEception(){
		n1.incrementSalary(150000);
	}

}

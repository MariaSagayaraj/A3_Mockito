import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

//importing the respective class and interface
import Tax.IEmployee;
import Tax.Employee;

public class EmployeeTest {
	
//(a) Declaring the objects of classes and interfaces
	
	Employee classobj;
	IEmployee interfaceobj;
	
// Declaring the variables used for testing----> Tax and kiwisaver percentages are approximately taken
	int salary=30000;
	double tax=0.4;
	double kiwisaver=0.3;
	int totalnumberofweeks=52;
	
//(b) Initialize and instantiate the object and the variables in the setUp()method. 
	@Before
	public void setUp() throws Exception {
		classobj=new Employee(salary);
		
//(c) Creating mock object
		interfaceobj=Mockito.mock(IEmployee.class);
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		classobj=null;
		interfaceobj=null;
	}
//Assertion for different methods
	@Test
	public void testComputeTax() {
		assertEquals(classobj.getsalary()*tax, classobj.computeTax(salary),2);
		
	}
	
	@Test
	public void testWeeklySalary() {
		assertEquals(classobj.getsalary() / totalnumberofweeks, classobj.weeklysalary(classobj),2);
		
	}
	
	@Test
	public void testfortnightSalary() {
		assertEquals(classobj.getsalary() / (totalnumberofweeks / 2), classobj.fortnightsalary(classobj),2);
		
	}
	
	@Test
	public void testComputekiwisaver() {
	assertEquals(classobj.getsalary() / (totalnumberofweeks * kiwisaver), classobj.computekiwisaver(classobj),2);
		
	}
	

}

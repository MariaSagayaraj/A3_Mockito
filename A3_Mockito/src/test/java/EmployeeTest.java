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
	int salary=40000;
	double tax=0.04;
	double kiwisaver=0.03;
	int totalnumberofweeks=52;
	
//(b) Initialize and instantiate the object and the variables in the setUp()method. 
	@Before
	public void setUp() throws Exception {
		classobj=new Employee(salary);
		
//(c) Creating mock object
		interfaceobj=Mockito.mock(IEmployee.class);
		
		Mockito.when(interfaceobj.computeTax(classobj.getsalary())).thenReturn((double) (40000));
		Mockito.when(interfaceobj.weeklysalary(classobj)).thenReturn(2576.07);
		Mockito.when(interfaceobj.fortnightsalary(classobj)).thenReturn(4675.30);
		Mockito.when(interfaceobj.computekiwisaver(classobj)).thenReturn(213.76);
		
	classobj.setobj(interfaceobj);
		
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

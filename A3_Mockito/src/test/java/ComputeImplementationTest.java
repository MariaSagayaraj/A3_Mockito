import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Tax.ComputeImplementation;
import Tax.ICompute;

public class ComputeImplementationTest {
	//Creating objects of interfaces and classes
	
	ICompute interfaceobj;
	ComputeImplementation implementationobj;
	
	//Declaring input variables
	int n1;
	int n2;
	

	@Before
	public void setUp() throws Exception {
		n1 = 12;
		n2 = 6;
		implementationobj = new ComputeImplementation();
		
		//Mock object initialisation
		
		interfaceobj = Mockito.mock(ICompute.class);
		Mockito.when(interfaceobj.multiply(n1, n2)).thenReturn(72);
		implementationobj.setobj(interfaceobj);
		
	}

	@After
	public void tearDown() throws Exception {
		implementationobj=null;
		interfaceobj=null;
	}

	@Test
	public void testsquare() {
		fail("Not yet implemented");
	}
	@Test
	public void testmultiply() {
		assertEquals(72, implementationobj.multiply(n1,n2));
		
	}


}

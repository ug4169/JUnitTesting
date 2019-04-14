package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction jtest =new jUnitFunction();
		int result= jtest.addnumbers(80, 70);
		assertEquals(150,result);
	}

}

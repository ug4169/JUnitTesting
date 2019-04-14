package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {
	@Test
	public void test() {
		jUnitFunction teststring=new jUnitFunction();
		String result=teststring.addStrings("Software", "Engineering");
		assertEquals("SoftwareEngineering",result);
		}

}

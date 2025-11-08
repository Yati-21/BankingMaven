import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MathCalculationTest {

	@Test
	public void testadd()
	{
		MathOperation obj = new MathOperation();
		int i = 10;
		int j = 20;
//		assertEquals(j,40);
//		assertEquals(40,40);
		
		assertEquals(obj.add(i,j),30);
		System.out.println("Test successful");
	}

	@Test
	public void testMultipply()
	{
//		String name = null;
//		assertNotNull(name);  //will fail
//		
//
//		String name1 = "abc";
//		assertNotNull(name1,"abc");  //will pass
//	

		
		MathOperation obj = new MathOperation();
		int i = 10;
		int j = 20;
		assertEquals(obj.multiply(i,j),200);
		
		System.out.println("multiply Test successful");
	}

}

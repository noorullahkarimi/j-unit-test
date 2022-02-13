import org.junit.Test;
import static org.junit.Assert.*;

public class JunitTests {
	
	private MathCaculate mth;
	
	public JunitTests() {
		mth= new MathCaculate();
	}

	@Test
	public void testCross (){
		
		assertEquals(mth.cross(1, 2), 2);
		assertEquals(mth.cross(4, 5),20);
		
	}
	@Test
	public void testDivision(){
		assertEquals(mth.division(5, 1),5);
		assertEquals(mth.division(8, 2), 4);
		assertEquals(mth.division(0, 5), 0);
		try {
			mth.division(5, 0);
			fail();
		} catch (Exception e) {
			assertTrue(e instanceof ArithmeticException);
		}
	}
	@Test
	public void testHello(){
		assertEquals(mth.hello(), "hello");
		
	}
}

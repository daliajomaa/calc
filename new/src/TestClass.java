
import static org.junit.Assert.*;

import org.junit.*;
import java.lang.*;


import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class TestClass {

	
		
Model calc = new Model();


		    @Test
		    public void testAdd() throws Exception {
		    	double expected = 3.0 ;
		     calc.compute(2.0,1.0,0);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }

		    
		    
		    
		    
		    @Test
		    public void testAdd2() throws Exception {
		    	double expected = -1.0 ;
		     calc.compute(-2.0,1.0,0);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }
		    
		    @Test
		    public void testAdd3() throws Exception {
		    	double expected = -3.0 ;
		     calc.compute(-2.0,-1.0,0);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }
		    
		    
		    
		    @Test
		    public void testSub() throws Exception {
		    	double expected = 1.0 ;
		     calc.compute(2.0,1.0,1);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }
		    
		    
		    
		    
		    
		    @Test
		    public void testSub2() throws Exception {
		    	double expected = -3.0 ;
		     calc.compute(-2.0,1.0,1);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }
		    
		    
		    @Test
		    public void testSub3() throws Exception {
		    	double expected = -1.0 ;
		     calc.compute(-2.0,-1.0,1);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    @Test
		    public void testMul() throws Exception {
		    	double expected = 2.0 ;
		     calc.compute(2.0,1.0,2);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }
		    
		    
		    
		    
		    
		    
		    @Test
		    public void testMul2() throws Exception {
		    	double expected = -2.0 ;
		     calc.compute(-2.0,1.0,2);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }
		    
		    
		    @Test
		    public void testMul3() throws Exception {
		    	double expected = 2.0 ;
		     calc.compute(-2.0,-1.0,2);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }
		    
		    @Test
		    public void testDiv() throws Exception {
		    	double expected = 0.5 ;
		     calc.compute(2.0,4.0,3);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }
		    
		    
		    
		    @Test
		    public void testDiv2() throws Exception {
		    	double expected = -0.5 ;
		     calc.compute(-2.0,4.0,3);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }
		    
		    
		    
		    @Test
		    public void testDiv3() throws Exception {
		    	double expected = 0.5 ;
		     calc.compute(-2.0,-4.0,3);
		     String x = calc.getResult();
		     assertEquals(expected , Double.parseDouble(x));

		    }
		    
		    
		    
		    
		    
		    
		    public void testDiv4() throws Exception {
			    
			    try {
			        calc.compute(2.0, 0.0,3);
			        fail("Should have thrown an exception!");
			      }
			      catch (ArithmeticException e) {
			        // Good, that's what we expect
			      }
			    
			    }
		 
}
package hello;



import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;





public class TestGreeter {



   private Greeter g;

	

   @Before

   public void setUp() throws Exception 

   {

      g = new Greeter();

   }



   @Test

   public void testGreeterEmpty() 

   {

      assertEquals(g.getName(),"");

      assertEquals(g.sayHello(),"Hello!");

   }

	

   @Test

   public void testGreeter() 

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }
	
	
   @Test	
	
   public void MPMtestGreeter2()
   {
	g.setName("Omicron Persei 8");
	   
	assertTrue(8 > 7);
	   
	assertEquals(g.sayHello(),"Hello Omicron Persei 8!");
   }
	
	
  @Test
	
  public void newtestMPMGreeterFail()
  {
	g.setName("Rick King"); 
	   
	assertNotEquals(g.getName(), "Rick King");   
  }
	
}

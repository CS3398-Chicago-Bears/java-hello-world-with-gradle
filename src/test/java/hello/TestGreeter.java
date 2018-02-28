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
	
	
   public void testGreeter2()
   {
	g.setName("Omicron Persei 8");
	   
	assertGreaterThan(g.getName(), "Omicron Persei 7");
	   
	assertEquals(g.sayHello(),"Greetings puny Earthlings!");
   }
	
   public void newtest<MPM>GreeterFail()
   {
	g.setName("Rick King"); 
	   
	assertNotEquals(g.getName(), "Rick King");   
   }
	
}

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
   
   public void newtestJBKGreeterPass() 

   {

      g.setName("James");

      assertEquals(g.getName(),"James");

      assertEquals(g.sayHello(),"Hello World!");

   }
   
   public void newtestJBKGreeterFail() 

   {

      g.setName("World");

      assertEquals(g.getName(),"Not World");

      assertEquals(g.sayHello(),"Hello World!");

   }



}

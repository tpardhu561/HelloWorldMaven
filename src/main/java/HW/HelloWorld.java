package HW;
public class HelloWorld 
{
	
 
   public String printMessage(String name) 
   {
      if (name == "") 
      {
         return "Hello!";
      }
      else 
      {
         return "Hello " + name + "!";
      }
   }

   public static void main(String[] args)
   {
	   HelloWorld hw = new HelloWorld();
	   System.out.println(hw.printMessage(""));
	   System.out.println(hw.printMessage("World"));
	   
   }
		
}

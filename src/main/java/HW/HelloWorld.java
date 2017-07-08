package HW;
public class HelloWorld 
{
	
   private String name = "";

   public String getName() 
   {
      return name;
   }

   public String getMessage() 
   {
      if (name == "") 
      {
    	 System.out.println("Hello!");
         return "Hello!";
      }
      else 
      {
    	  System.out.println("Hello"+name+"!");
         return "Hello " + name + "!";
      }
   }

   public void setName(String name) 
   {
      this.name = name;
   }
		
}

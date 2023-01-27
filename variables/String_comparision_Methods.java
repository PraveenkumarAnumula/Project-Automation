package variables;


public class String_comparision_Methods {

	public static void main(String[] args) 
	
	{
	String Act_fiber="internet";
	String Jio="inTernet";
	
	//"equals" depends on case sensitivity(uppercase or Lower case)/
	
	boolean flag=Act_fiber.equals(Jio);
	System.out.println("Equal comparision is " +flag);
	
	
	//"equalsIgnoreCase" doesnot consider the Case sensitivity of the letters and gives the result/
	
	
	boolean flag1=Jio.equalsIgnoreCase(Act_fiber);
    System.out.println("EqualsIgnoreCase comparasion is " +flag1);
			
		
		
		
		
		
	}

}

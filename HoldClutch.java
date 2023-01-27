package practice;


public class HoldClutch 
{

	public HoldClutch() 
	{
	System.out.println("Holding Clutch");
	}
	
     public void Change_First_Gear() 
{
	   System.out.println("Changed to First Gear");
}

           public void change_Second_Gear() 
{
	           System.out.println("Changed to Second Gear");
	       
	       
}
public static void main(String[] args) 
{
	new HoldClutch().Change_First_Gear();
	new HoldClutch().change_Second_Gear();
}

}

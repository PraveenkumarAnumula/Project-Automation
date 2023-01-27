package practice;

public class CAR

{

	public void KeyOnn()

{
	System.out.println("Door unlocks");

}
public void KeyOff()

{
	
System.out.println("Door locks");


}

public static void main(String[] args)

{
	
	new CAR().KeyOnn();
	new CAR().KeyOff();
	
}
}
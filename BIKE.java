package practice;

public class BIKE

{
public void KeyOnn()

{
System.out.println("Engine Starts");

}

public void KeyOff() 
{
System.out.println("Engine Stops");

}
public static void main(String[] args) {
	new BIKE().KeyOnn();
	new BIKE().KeyOff();
}
}

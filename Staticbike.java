package practice;

public class Staticbike
{
public static void Holdbreak() 
{
	System.out.println("Bike stops");
}
public static void Leavebreak() 
{
	System.out.println("Bike moves");
}

public static void main(String[] args) {
	Staticbike.Holdbreak();
	Staticbike.Leavebreak();
}
}

package practice;

public class CallbyValue
{

void M1(int x, int y)
{
	System.out.println(x+y);
}

public static void main(String[] args) {
	CallbyValue obj=new CallbyValue();
	obj.M1(10,20);
}
}



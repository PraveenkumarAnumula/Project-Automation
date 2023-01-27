package practice;

	public class DatatypesMethod
     	{
		
		private static final char CONS = 0;

		//method without parameter
		public void method1()
		{
			System.out.println("Method1 Executed");
		}
		
		//Method with Integer parameter
		public void method2(int x)
		{
			System.out.println(x);
		}
		
		//Method with String parameter
		public void method3(String name)
		{
			System.out.println(name);
		}
		
		//Method with Boolean parameter
		public void method4(boolean flag)
		{
			System.out.println(flag);
		}
		
		//Method with double parameter
		public void method5(double price)
		{
			System.out.println(price);
		}
		
		//Method with char parameter
		public void method6(char ch)
		{
			System.out.println(ch);
		}
		
		//Method with float value
		public void method7(float f)
		{
			System.out.println(f);
		}
		
public static void main(String[] args) {
	
DatatypesMethod obj=new DatatypesMethod();
     obj.method1();
     obj.method2(100);
     obj.method3("Chintu");
     obj.method4(true);
     obj.method5(1000000);
     obj.method6(CONS);
   
     
     }
     	}



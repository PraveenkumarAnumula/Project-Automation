package practice;

public class Global_variables {
	int num=1;
	char ch='A';
	boolean Yes=true;
	String str="Sandy";
	double db=1234.12;
	float f=12;
	public static void main(String[] args) {
		
		
		//Calling global variables in Data-types using object creation
		
		
		Global_variables Val=new Global_variables();
char n=Val.ch;
                                         System.out.println(n);
                                         
int p=Val.num;
                                         System.out.println(p);

String st=Val.str;
                                          System.out.println(st);

double dec=Val.db;
                                          System.out.println(dec);

 
float fl=Val.f;
                                           System.out.println(fl);
 
 boolean tr=Val.Yes;
                                           System.out.println(tr);


		
		
	}
	
			

}

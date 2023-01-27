package call_by_reference;

public class Getinfo {

	public static void main(String[] args) {
	Info details=new Info();
	String str=details.GetProductDetails().Getdetails();
	System.out.println(str);
Product name=new Product();
String model=name.name;
System.out.println(model);
double db=details.GetProductDetails().price;
System.out.println(db);

	}

}


public class Overloading {
	
	
	public void MyMethod(int a,int b)
	
	{
		System.out.println(a+b);
		
	}
	
public void MyMethod(int a,int b,int c)
	
	{
		System.out.println(a+b+c);
		
	}
	

	public static void main(String[] args) {
		
		Overloading obj=new Overloading();
		obj.MyMethod(5,10);
		obj.MyMethod(20, 10, 15);
		

	}

}

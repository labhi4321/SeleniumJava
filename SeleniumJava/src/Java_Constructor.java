
public class Java_Constructor {
	
	int modelyear;
	String car;
	
	
	public Java_Constructor(int Year,String name)
	
	{
		
		modelyear=Year;
		car=name;
		
	}
	
	
	public static void main(String[] args) {
		
		Java_Constructor obj=new Java_Constructor(1969, "Mustang");
		Java_Constructor obj2=new Java_Constructor(1989, "Alto");
		
		System.out.println(obj.modelyear);
		System.out.println(obj.car);
		
		System.out.println(obj2.modelyear);
		System.out.println(obj2.car);

	}

}

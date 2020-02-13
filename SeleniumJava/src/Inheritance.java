
public class Inheritance {

	protected String Brand="Ford";
	public void horn()
	{
		System.out.println("peppeep");
		
	}
	
 class Child extends Inheritance {
	
	private String modelName = "Mustang";
	
}


	
public static void main(String[] args) {
		
		Child obj  =  new Child();
		obj.horn();
				
		
			
	}


}

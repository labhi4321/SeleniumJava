
class Overriding {
	
	void mymethod()
	{
		System.out.println("in Class Overriding");
		
	}
	
}
	
class NewOverloading extends Overriding{
	
	void mymethod()
	{
		System.out.println("In class NewOverloading");
	}

public static void main(String[] args) {
		
		
		NewOverloading obj=new NewOverloading();
		obj.mymethod();
		

}
}

	

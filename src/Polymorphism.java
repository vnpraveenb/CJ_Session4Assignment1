
//Parent Class
class Animal{
	
	//Method implementation
	 public void makeSound()
	 {
		 System.out.println("No animal chosen");
	 }
	 
}

//Child Class
class Dog extends Animal{
	
 	//Method implementation
	
	//Overloading makeSound Methods one has no argument one has String argument
	
	//No argument method
	public void makeSound()
	{
		System.out.println("Dog says Woof");
	}
	
	//Single String argument method
	public void makeSound(String dogName)
	{
		System.out.println(dogName + " says Woof to you too");
	}
}



public class Polymorphism {

	public static void main(String[] args) {
		
		//Method Overriding
		System.out.println("Method Overriding");
		System.out.println("------------------");
		
		Animal animal1 = new Animal(); // Animal reference and object

		animal1.makeSound();
		
		// Method Overriding
		System.out.println("\nMethod Overriding ");
		System.out.println("------------------");
			
		Animal dog1 = new Dog();  // Animal reference but Dog object
		dog1.makeSound(); 
		
		
		//Method Overloading
		System.out.println("\nMethod Overloading");
		System.out.println("------------------");
		
		Dog dog2 = new Dog(); // Dog reference but Dog object
		dog2.makeSound();
		
		Dog dog3 = new Dog(); // Dog reference but Dog object
		dog3.makeSound("Tiger");
	}

}

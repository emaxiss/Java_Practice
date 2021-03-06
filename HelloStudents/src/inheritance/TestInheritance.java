package inheritance;

public class TestInheritance
{
	public static void main(String[] args)
	{
		Animal animal = new Animal("A big scary animal");
		animal.eat();
		
		Dog dog = new Dog("A small dog", "Tuzik", "Chihuahua");
		dog.eat();
		dog.bark();
		
		System.out.println("Dog's type: " + dog.getType());
		System.out.println("Dog's name: " + dog.getName());
		
		Animal ani = new Dog("Very big dog", "Rex", "Labrador");
		ani.eat();
		System.out.println(ani.getType());
		
		((Dog)ani).getName(); //refers to Dog
		
		ani = new Cat("Siam");
		ani.eat();
	}
}

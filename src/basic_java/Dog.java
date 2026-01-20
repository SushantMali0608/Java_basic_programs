package basic_java;

public class Dog extends Animal {

	public static void main(String[] args) {
     
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		d.sleep();
		
		IntefaceImplement im =new IntefaceImplement();
		im.fulllName();
		im.name();
		im.nickname();

	}
	 
	public void bark() {
		System.out.println("Barking");
	}
	
	
	

}

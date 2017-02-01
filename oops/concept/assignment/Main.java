package oops.concept.assignment;

public class Main {

	public static void main(String[] args) {
		
		NikonOne no=new NikonOne();
		
		
		no.flash();//parent class method inherited by child class implemented from interface(Inheritance & Abstraction)
		no.print("Overloaded method");//inherited method overloaded by child class(Polymorphism)
		no.snap();//inherited method overridden by child class
		no.fly();//child class method
		System.out.println("ISO is "+no.getISO());//accessing private variable from parent class

	}

}

package generics;

public class Dog {
	String name;
	int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object o) {
		Dog d = (Dog) o;
		return (this.name.equals(d.name) 
				&& this.age == d.age);
	}
	
	public void bark() {
		if (this.age < 2) {
			System.out.println("Tiaf-tiaf");
		}
		else if (this.age < 6) {
			System.out.println("Hav-hav");
		}
		else {
			System.out.println("Woof-woof");
		}
	}
	
	public String toString() {
		return "<Dog "+this.name + " of age: " + this.age +">";
	}
}

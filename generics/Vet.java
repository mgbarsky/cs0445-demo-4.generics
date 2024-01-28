package generics;

public class Vet {
	String name;
	String address;
	
	public Vet (String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public boolean equals(Object o) {
		Vet v = (Vet) o;
		return (this.name.equals(v.name) 
				&& this.address.equals(v.address));
	}
	
	public String toString() {
		return "<Vet "+this.name + " address: " + this.address +">";
	}

}

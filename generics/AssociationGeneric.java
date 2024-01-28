package generics;

import java.util.ArrayList;

public class AssociationGeneric<A,B> {
	private A key;
	private B value;
	
	public AssociationGeneric (A key, B val) {
		this.key = key;
		this.value = val;
	}
	
	public A getKey() {
		return key;
	}
	
	public B getValue() {
		return value;
	}
	
	public static void main (String [] args) {
		
		AssociationGeneric<String, Double> stock1 = new AssociationGeneric<String, Double>("Apple", 190.0);
		AssociationGeneric<String, Double> stock2 = new AssociationGeneric<String, Double>("Google", 153.0);
		
		double price1 = stock1.getValue();
		double price2 = stock2.getValue();
		
		ArrayList<String> stringList = new ArrayList<String>();
		ArrayList<Dog> dogList = new ArrayList<Dog>();
	}
}

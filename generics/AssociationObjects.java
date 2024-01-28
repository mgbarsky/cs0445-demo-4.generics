package generics;

public class AssociationObjects {
	private Object key;
	private Object value;
	
	public AssociationObjects(Object key, Object val) {
		this.key = key;
		this.value = val;
	}
	
	public Object getKey() {
		return key;
	}
	
	public Object getValue() {
		return value;
	}
	
	public static void main (String [] args) {
		// storing stock price
		AssociationObjects stockPair = new AssociationObjects("Apple", 190.0);
		
		// storing relationship between friends
		AssociationObjects friendsPair = new AssociationObjects("Alice", "Bob");
		
		// storing relationship between a dog and its vet
		AssociationObjects dogVetPair = new AssociationObjects(new Dog("Fido", 5), new Vet("Douglas", "Green st."));
		
		// polymorphic array of associations
		AssociationObjects [] pairs = {stockPair, friendsPair, dogVetPair};
		
		for ( AssociationObjects pair: pairs) {
			Object key = pair.getKey();
			Object val = pair.getValue();
			
			if (val instanceof Double) {
				double price = (Double) val;
				System.out.println(price);
			}
		}
		
		
		
		
	}
}


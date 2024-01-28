package generics;

public class GenericBag<E> {
	//storage - array of elements of type E
	private E [] elements;
	int capacity;
	int size;
	
	// Constructor: allocate storage, sets capacity and size
	@SuppressWarnings("unchecked")
	public GenericBag(int capacity) {		
		this.elements = (E[]) new Object[capacity];
		this.capacity = capacity;
		this.size = 0;
	}		
	
	public boolean add(E element) {
		if (size == capacity) { // cannot add: array is out of capacity
			return false;
		}
		elements[size++] = element;
		return true;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i=0; i<this.size-1; i++) {
			sb.append(elements[i].toString() +", ");
		}
		if (this.size > 0)
			sb.append(elements[this.size-1].toString());
		sb.append("]");
		return sb.toString();
	}
	
	public static void main(String [] args)	{
		String [] STATES = {"PA", "OH", "NY", "WV", "NH", "MD", "NJ"}; 
		// Note the three variable declarations below.  Each is the same
		// fundamental type (GenericBag) but with different generic parameters.
		GenericBag<String> S = new GenericBag<String>(5);
		GenericBag<Integer> I = new GenericBag<Integer>(10);
		GenericBag<Dog> D = new GenericBag<Dog>(3);
		
		for (int i = 0; i < 4; i++)
			S.add(STATES[i]);
		System.out.println("Bag of Strings:");
		System.out.println(S);

		for (int i = 2; i < 12; i++)
			I.add(5*i);
		System.out.println("\nBag of ints:");
		System.out.println(I);
	
		D.add(new Dog("Ball", 1));
		D.add(new Dog("Fido", 3));
		D.add(new Dog("Rocky", 11));
		
		System.out.println("\nBag of dogs:");
		System.out.println(D);	
	}
}

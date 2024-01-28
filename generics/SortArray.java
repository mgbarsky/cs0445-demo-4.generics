package generics;


/**
Class for sorting an array of Comparable objects from smallest to 
largest.
*/
public class SortArray {
	/** Sorts the first n objects of an array into ascending order.
    @param a  an array of Comparable objects
    @param n  an integer > 0 */
	public static <T extends Comparable<T>>  void selectionSort (T[] a, int n){
		for (int index = 0; index < n - 1; index++) {
			int indexOfNextSmallest = getIndexOfSmallest(a, index, n - 1);
			swap(a, index, indexOfNextSmallest);
			// Assertion: a[0] <= a[1] <= . . . <= a[index] <= all other a[i]
		} // end for
   
	} // end selectionSort

	/** Finds the index of the smallest value in a portion of an array.
    @param a      an array of Comparable objects
    @param first  an integer >= 0 and < a.length that is the index of 
                  the first array entry to consider
    @param last   an integer >= first and < a.length that is the index 
                  of the last array entry to consider
    @return the index of the smallest value among
            a[first], a[first + 1], . . . , a[last] */
	private static <T extends Comparable<T>>
        int getIndexOfSmallest(T[] a, int first, int last){
		T min = a[first];
		int indexOfMin = first;
		for (int index = first + 1; index <= last; index++)   {
			if (a[index].compareTo(min) < 0)  {
				min = a[index];
				indexOfMin = index;
			} // end if
			// Assertion: min is the smallest of a[first] through a[index].
		} // end for

		return indexOfMin;
	} // end getIndexOfSmallest

	/** Swaps the array entries a[i] and a[j].
    @param a  an array of objects
    @param i  an integer >= 0 and < a.length
    @param j  an integer >= 0 and < a.length */
	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp; 
	} // end swap
	
	private static void printArray (Object [] arr) {
		for (int i=0; i< arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String [] args) {
		String [] states = {"PA", "OH", "NY", "WV", "NH", "MD", "NJ"}; 
		Integer [] numbers = {2, 4, 5, 2, 1, 66, 23, 12, 1, 3, 7};
		Product [] products = new Product [4];
		products[0] = new Product("Milk", 2.5);
		products[1] = new Product("Bread", 5.2);
		products[2] = new Product("Bread", 4.3);
		products[3] = new Product("Apple", 1.5);	
		
		selectionSort(states, states.length);
		System.out.println("String array sorted:");
		printArray(states);
		
		selectionSort(numbers, numbers.length);
		System.out.println("Integer array sorted:");
		printArray(numbers);
		
		selectionSort(products, products.length);
		System.out.println("Product array sorted:");
		printArray(products);
	}
} // end SortArray
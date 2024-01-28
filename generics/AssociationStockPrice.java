package generics;

public class AssociationStockPrice {
	private String key;
	private Double  value;
	
	public AssociationStockPrice(String company, double price) {
		this.key = company;
		this.value = price;
	}
	
	public String getKey() {
		return key;
	}
	
	public Double getValue() {
		return value;
	}
	
	public static double getAverageValue(String key, AssociationStockPrice[] data) {
		double total = 0;
		int count = 0;
		
		for (int i=0; i < data.length; i++) {
			if (data[i].getKey().equals(key)) {
				total += data[i].getValue();
				count ++;
			}
		}
		if (count > 0) return total/count;
		return 0;		
	}
	
	public static int getFrequency(String key, AssociationStockPrice[] data) {		
		int count = 0;
		
		for (int i=0; i < data.length; i++) {
			if (data[i].getKey().equals(key)) {
				
				count ++;
			}
		}
		if (count > 0) return count;
		return 0;		
	}
	
	public static void main (String [] args) {
		AssociationStockPrice pair = new AssociationStockPrice("Apple", 190);
		String company = pair.getKey();
		Double price = pair.getValue();
		
		System.out.println("Company "+ company + " has price "+ price);
		
		AssociationStockPrice [] stocks = new AssociationStockPrice [5];
		
		stocks[0] = new AssociationStockPrice("Apple", 190);
		stocks[1] = new AssociationStockPrice("Google", 153);
		stocks[2] = new AssociationStockPrice("Apple", 180);
		stocks[3] = new AssociationStockPrice("Google", 154);
		stocks[4] = new AssociationStockPrice("Apple", 170);
		
		double ave = getAverageValue("Apple", stocks);
		System.out.println("Average stock price for Apple is: "+ave);
		
		
	}

}

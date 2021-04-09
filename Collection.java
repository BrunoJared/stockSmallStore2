package Entities;


public class Collection extends ProductVariants{
	
	public Collection(String Color, int Size, String Gender) {
		super(Color, Size, Gender);
		// TODO Auto-generated constructor stub
	}

	public enum Product {
		TSHIRT, SNEAKEARS, PANTS;

		public static String Name;
		public static double Price;
		public static String Description;
		public static int Quantity;
	}
	
	public String TSHIRT;
	public String SNEAKEARS;
	public String PANTS;
	
	
	/*public Collection () {
		
	}
	
    public Collection(String TShirt, String Sneakers, String Pants) {
    	this.TSHIRT = TShirt;
    	this.SNEAKEARS = Sneakers;
    	this.PANTS = Pants;
    	
		
	}*/
	
	
	public String getTShirt() {
		return TSHIRT;
	}
	public void setTShirt(String tShirt) {
		TSHIRT = tShirt;
	}
	public String getSneakers() {
		return SNEAKEARS;
	}
	public void setSneakers(String sneakers) {
		SNEAKEARS = sneakers;
	}
	public String getPants() {
		return PANTS;
	}
	public void setPants(String pants) {
		PANTS = pants;
	}

	public static Collection valueOf(String next) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static void add(Collection collection) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return String.format("%.2f",TSHIRT)
				+ ", "
				+ String.format("%.2f",SNEAKEARS)
				+ ","
				+ String.format("%.2f",PANTS);
	}

}

package Entities;

import java.util.List;

public class Product extends ProductVariants{
	public Product(String Color, int Size, String Gender) {
		super(Color, Size, Gender);
		// TODO Auto-generated constructor stub
	}


	public static String Name;
	public static double Price;
	public static String Description;
	public static int Quantity;
	public String Color;
	public int Size;
	
	
	



	

	public String getName() {
		return Name;
	}


	public  void setName(String name) {
		Name = name;
	}


	public double getPrice() {
		return Price;
	}


	public void setPrice(double price) {
		Price = price;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public double getQuantity() {
		return Quantity;
	}


	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	public static double totalValueInStock() {
		return Price * Quantity;
		}
		public void addProducts(int quantity) {
		Product.Quantity += quantity;
		}
		public void removeProducts(int quantity) {
		Product.Quantity -= quantity;
		}
	
		public static void add(List<Product> product) {
			// TODO Auto-generated method stub
			
		}
	
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
	public  String toString() {
		return Name
		
			+ ", $ "
			+ String.format("%.2f", Price)
			+ ", "
			+ Quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock())
			+ ", "
			+ "Description: "
		    + Description
		    
		    ;
			
			}
			
		    


	

	


	
			
	}
	
    
	





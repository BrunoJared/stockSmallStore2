package Entities;

public class ProductVariants {
	
	public enum Collection{
		Color, Size, Gender
	}
	
	public String Color;
	public int Size;
	public String Gender;
	
	
	public ProductVariants(String color2, String size2, String gender2) {
		
	}
	
    public ProductVariants(String Color, int Size, String Gender) {
	    this.Color = Color;
	    this.Size = Size;
	    this.Gender = Gender;
		
	}
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	
	public static ProductVariants valueOf(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static void add(ProductVariants variants) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return 
				
			String.format("%.2f",Color)
			+ ", "
			+ String.format("%.2f",Size)
			+ ", "
			+ String.format("%.2f",Gender)
		    ;
			
			}
			
	}
	
	



package Application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Entities.Collection;
import Entities.Product;
import Entities.ProductVariants;

public class Program {

	

	private static final String Size = null;
	private static final String Color = null;
	private static final String Gender = null;





	public static void main(String[] args) {
		product();
		
	}
	
		
		
	
		
		private static void product() {
		
		
	




		
		
	




		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product(null, 0, null);
		//Collection collection = new Collection(null, 0, null);
		ProductVariants variant = new ProductVariants(Color, Size, Gender);
		int product2 = 0;
		
		
		
		
		
		do {
			
			System.out.println("# Choose one of the options bellow #");
			System.out.println(" Option 1 - Register products ");
			System.out.println(" Option 2 - Print registered products ");
			System.out.println(" Option 0 - Exit program ");
			System.out.println("_______________________");

	          System.out.print("Type your option: ");
	          product2 = Integer.parseInt(sc.next());
	          
	          if(product2 == 1) {
	        	  ArrayList<Product> product1 = new ArrayList<Product>();
	        	  ArrayList<ProductVariants> variant1 = new ArrayList<ProductVariants>();
	        	  
	        	  System.out.println("Enter product data: ");
	      		System.out.print("Name: ");
	      		product.setName(sc.next());
	      		
	      		System.out.print("Description: ");
	      		product.setDescription(sc.next());
	      		
	      		
	      		
	        	  System.out.print("Price: ");
	  			product.setPrice(sc.nextDouble());
	  			System.out.print("Quantity in stock: ");
	  			product.setQuantity(sc.nextInt());
	  			
	  			
	  			
	  			System.out.print("Type product Color: ");
	  			variant.setColor(sc.next());
	  			variant.getColor();
	  			
	  			System.out.print("Type product size (number): ");
	  			variant.setSize(sc.nextInt());
	  			variant.getSize();
	  			
	  			System.out.print("Type product Gender: ");
	  			variant.setGender(sc.next());
	  			variant.getGender();
	  			
	  			try {
	  			product1.add((Product) product);	  			
	  			System.out.println("Registered");
	  			System.out.println("_______________________");

	  			}catch(Exception error){
	  			
	  				System.out.println("Not registered!");
	  				System.out.println("_______________________");

	  				System.out.println();
	  			}
	  			try {
		  			variant1.add((Product) product);	  			
		  			System.out.println("Registered");
		  			System.out.println("_______________________");

		  			}catch(Exception error){
		  			
		  				System.out.println("Not registered!");
		  				System.out.println("_______________________");

		  				System.out.println();
		  			}
	  			
	  			}
	          else if(product2 == 2) {
	        	  if(product.isEmpty()){
	                  System.out.println("Product not registered!");
	                  System.out.println("_______________________");
	                  sc.nextLine();
	                  
	                }else{
	                  System.out.println(product.toString());
	                  System.out.println("_______________________");

	                  System.out.println("Press key to continue.");
	                  sc.nextLine();
	                }         }
	        } 
	        	
	      		
	        	  
	          
	          while(product2 != 0);
	        	  
	          sc.close();
		
		
		}
}


	              

	
	            
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	



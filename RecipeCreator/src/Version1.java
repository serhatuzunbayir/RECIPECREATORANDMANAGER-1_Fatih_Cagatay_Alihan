import java.util.Scanner;
import java.util.Date;
import java.util.UUID;

public class Version1 {
	
	private static Scanner takeInput;
	
	public static void main(String[] args){
		String name;
		String ID;
		String[] medicine = new String[5]; 
		double[] prices = new double[5];
		int totalPrice = 0;	
		Date today = new Date();
		
		String recipeID = UUID.randomUUID().toString();
		
		System.out.println("Enter patient's name and surname:");
		takeInput = new Scanner(System.in);
		name = takeInput.nextLine();
		
		System.out.println("Enter patient's ID:");
		takeInput = new Scanner(System.in);
		ID = takeInput.nextLine();
		
		for(int i=0 ; i<5 ; i++){
			System.out.println("Enter Medicine's name:");
			takeInput = new Scanner(System.in);
			medicine[i] = takeInput.nextLine();
			
			System.out.println("Enter Medicine's price:");
			takeInput = new Scanner(System.in);
			prices[i] = takeInput.nextDouble();
			
			totalPrice += prices[i];
		}
	
		System.out.println("------------------");
		System.out.println("Date: " +today.toString());
		System.out.println("Recipe ID: " +recipeID);
		System.out.println("Name: " +name);
		System.out.println("Patient ID: "+ID);
		for(int i=0 ; i<5 ;i++){
			System.out.println(i+1 +".Medicine: "+medicine[i]);
			System.out.println("Price: "+prices[i]);
		}
		System.out.println("Total Price: " +totalPrice);
	}

}

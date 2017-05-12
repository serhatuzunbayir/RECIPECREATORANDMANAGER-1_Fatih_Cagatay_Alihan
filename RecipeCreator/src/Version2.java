import java.util.*;

public class Version2 {
		
	public static void main(String[] args){
		
		Scanner takeInput;
		double totalPrice = 0;
		boolean check = false;
		Patient patient = new Patient();
		ArrayList<Medicine> m = new ArrayList<Medicine>();
		int counter = 1;
		takeInput = new Scanner(System.in);
		
		while(check == false){
			System.out.println("Enter Patient's name: ");
			patient.setName(takeInput.nextLine());
			check = patient.checkName();
		}
		check = false;
		while(check == false){
			System.out.println("Enter Patient's surname: ");
			patient.setSurname(takeInput.nextLine());
			check = patient.checkSurname();
		}
		
		System.out.println("Enter Patient's ID: ");
		patient.setPatientID(takeInput.nextLong());
		
		while(counter == 1){
			Medicine med = new Medicine();
			med.GenerateMedicineID();
			
			check = false;
			
			while(check == false){
				System.out.println("Enter medicine's name:");
				takeInput = new Scanner(System.in);
				med.setMedName(takeInput.nextLine());
				check = med.checkMedName();
			}
			
			
			System.out.println("Enter medicine's information:");
			med.setMedInfo(takeInput.nextLine());
			
			System.out.println("Enter medicine's price:");
			med.setPrice(takeInput.nextDouble());
			
			m.add(med);
			System.out.println("Enter '1' to Continue or 'Any key' to Exit");
			counter = takeInput.nextInt();
		}
		
		takeInput.close();
		
		Date today = new Date();
		System.out.println("---------------------------");
		System.out.println("Date: " +today.toString());
		System.out.println("Patient Name: " +patient.getName());
		System.out.println("Patient Surname: " +patient.getSurname());
		System.out.println("Patient ID: " +patient.getPatientID());
		System.out.println("---------");
		for(int i=0 ; i<m.size() ; i++){
			System.out.println("Medicine " +(i+1) +" ID: "+m.get(i).getMedID());
			System.out.println("Medicine " +(i+1) +" Name: "+m.get(i).getMedName());
			System.out.println("Medicine " +(i+1) +" Price: "+m.get(i).getPrice());
			System.out.println("Medicine " +(i+1) +" Info: "+m.get(i).getMedInfo());
			totalPrice += m.get(i).toplam(m);
			System.out.println("---------");
		}
		System.out.println("Total Price: " +totalPrice+" TL");
		System.out.println("---------------------------");
		
		
	}
	
	
}
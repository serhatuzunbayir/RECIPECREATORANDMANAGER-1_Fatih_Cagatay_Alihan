import java.util.ArrayList;
import java.util.UUID;

public class Medicine {
	public void setMedName(String _medName){
		medicineName = _medName;
	}
	public void setPrice(double _price){	
		price = _price;
	}	
	public void setMedInfo(String _medInfo){
		medicineInfo = _medInfo;
	}
	public void GenerateMedicineID(){
		medicineID = UUID.randomUUID().toString();
	}
	
	public String getMedName(){
		return medicineName;
	}
	public double getPrice(){
		return price;
	}
	public String getMedInfo(){
		return medicineInfo;
	}
	public String getMedID(){
		return medicineID;
	}	
	
	public double toplam (ArrayList <Medicine> m){
		double t=0;	
		for (int c=0; c<m.size();c++){
			t += m.get(c).getPrice();	
			}
		return t;
		}
	
	public boolean checkMedName(){
		if(medicineName.length()>1 && medicineName.length()<16){
			char[] chars = medicineName.toCharArray();

		    for (char c : chars) {
		        if(!Character.isLetter(c)) {
		        	System.out.println("Medicine name is invalid!");
		            return false;
		        }
		    }
			return true;		
		}
		else{
			System.out.println("Size is invalid!");
			return false;
		}
	}
	
	private	String medicineName;
	private String medicineInfo;
	private	double price;
	private	String medicineID;
}



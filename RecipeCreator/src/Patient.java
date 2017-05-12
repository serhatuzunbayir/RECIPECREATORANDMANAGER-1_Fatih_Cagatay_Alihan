

	public class Patient {
		
		public String getName(){
			return name;
		}
		public void setName(String _name){
			name = _name;
		}
		
		public String getSurname(){
			return surname;
		}	
		public void setSurname(String _surname){
			surname = _surname;
		}
		
		public long getPatientID(){
			return patientID;
		}
		public void setPatientID(long _ID){
			patientID = _ID;
		}
		
		public boolean checkName(){
			if(name.length()>1 && name.length()<16){
				char[] chars = name.toCharArray();

			    for (char c : chars) {
			        if(!Character.isLetter(c)) {
			        	System.out.println("Name is invalid!");
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
		public boolean checkSurname(){
			if(surname.length()>1 && surname.length()<31){
				char[] chars = surname.toCharArray();

			    for (char c : chars) {
			        if(!Character.isLetter(c)) {
			        	System.out.println("Surname is invalid!");
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
		
		private String name;
		private String surname;
		private long patientID;
	}


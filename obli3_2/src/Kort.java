


 abstract class Kort implements Comparable<Kort>, Cloneable {
	 
	 protected  String firstName;
	 protected  String lastName;
	 private int pinkode;
	 private static int  kortnummer;
	 private static int kort = 0;
	 private static boolean sperretKort = false;
	 

public Kort(String firstName, String lastName, int pinkode){
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.pinkode = pinkode;
		 kortnummer = kort++;
		
	 }
	 
	 public abstract boolean sjekkPin(int pinkodet);
	 

	 public Kort clone(){
		 try {
				return (Kort) super.clone();
			} catch (CloneNotSupportedException e) {		
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
	 
	 public int  compareTo(Kort k){
	 if (lastName.compareTo(k.lastName) > 0) return 1;
     else if (lastName.compareTo(k.lastName) < 0) return -1;
	 else if (firstName.compareTo(k.firstName) > 0) return 1;
     else if (firstName.compareTo(k.firstName) < 0) return -1;
	 else return 0;
	}
		

   public String getFirstName() {
	return firstName;
}

   public String getLastName() {
	return lastName;
}

   public int getPinkode() {
	return pinkode;
}

   public static int getKortnummer() {
	return kortnummer;
}

   public static int getKort() {
	return kort;
}

   public static boolean isSperretKort() {
	return sperretKort;
}

   public void setFirstName(String firstName) {
	this.firstName = firstName;
}

   public void setLastName(String lastName) {
	this.lastName = lastName;
}

   public void setPinkode(int pinkode) {
	this.pinkode = pinkode;
}

  public static void setKortnummer(int kortnummer) {
	Kort.kortnummer = kortnummer;
}

  public static void setKort(int kort) {
	Kort.kort = kort;
}

  public static void setSperretKort(boolean sperretKort) {
	Kort.sperretKort = sperretKort;
}

   public String toString(){
	   String temp;
	   if (isSperretKort())
		   temp = "gyldig";
	   else
		   temp = "ugyldig";
	   
	 return "First name: " + firstName + ", last name: " + lastName + ", pinkode: " + pinkode + ", kortnummer: "
			 + kortnummer + ". Kortet er " + temp + ".";
	
}


	
}






	
				
	
		
				
		
	

  
	



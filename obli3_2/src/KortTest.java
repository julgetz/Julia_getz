
import java.util.ArrayList;
import java.util.Collections;

public class KortTest {

	public static void main(String[] args) {	
	
		
		ArrayList<Kort> reg = new ArrayList<Kort>();
		
		Kort k1 = new Ansatt("Ole" , "Olsen" , 1234);
		Kort k2 = new Gjest("Marit" ,"Olsen", 9999);	
		Kort k3 = new Ansatt("Sandra","Nilsen", 8585);
		Kort k4 = new Gjest("Silje", " Eriksen", 1378);
		Kort k5 = new Ansatt("Lars", "Jhonnson", 4567);
		Kort k6 = new Ansatt("Jeanette", "Slyngen", 8888);
		
		
		reg.add(k1);
		reg.add(k2);
		reg.add(k3);
		reg.add(k4);
		reg.add(k5);
		reg.add(k6);
		
	
	for (int i = 0; i< reg.size(); i++){
		
         
		System.out.print(reg.get(i).toString());
		System.out.println("\nKortet utstedet til " + reg.get(i).getFirstName() + " " + reg.get(i).getLastName() + " er" + (reg.get(i).sjekkPin(1234) ?  " gyldig." :  " ugyldig." ) );
		System.out.println("\n");
	
	
	
	
	
		

	}
	}
}


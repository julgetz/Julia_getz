
import java.util.GregorianCalendar;


public class Gjest extends Kort {
	
	//private  GregorianCalendar kortGitt;
	private  GregorianCalendar kortfrist;
	
	
	public Gjest(String firstName, String lastName, int pinkode) {
		super(firstName, lastName, 9999);
		
		//GregorianCalendar kort_gitt = new GregorianCalendar();
		GregorianCalendar kort_frist = (GregorianCalendar)GregorianCalendar.getInstance();
	    //this.kortGitt = kort_gitt;
	    kort_frist.add((GregorianCalendar.DAY_OF_MONTH), 7);
		
	}
	
	public boolean isSperret() {
		GregorianCalendar today = new GregorianCalendar();
		return (today.compareTo(kortfrist) > 0) ? false : true;
		
	
	}
	

	public boolean sjekkPin(int pinkodet) {
		return (pinkodet == this.getPinkode()) ?  true :  false;
	}
	
	
	
	
		
		
		
		
		
	}


import java.util.GregorianCalendar;



public class Ansatt extends Kort implements Fast {
	
	private GregorianCalendar reg;
	private String fullName;
	
	
	
public Ansatt(String firstName, String lastName, int pinkode) {
		super(firstName, lastName, pinkode);
		this.reg = new GregorianCalendar();
	}
	
	
	public boolean sjekkPin ( int pinkodet){
		if (isSperret() == false)
			return true;
		else 
			
			return ( pinkodet == this.getPinkode()) ? true : false;
	}
	
	
	public boolean isSperret(){
		GregorianCalendar today = new GregorianCalendar();
		
		if ((today.get(GregorianCalendar.HOUR_OF_DAY) > 7) && (today.get(GregorianCalendar.HOUR_OF_DAY) < 17))
			return false;
		else
		return true;
	}

	
 public void setReg(GregorianCalendar reg) {
		this.reg = reg;
		
		
	}


	public GregorianCalendar getReg() {
		return reg;
	}
	
	
	

	@Override
	public String toString()
	{
		return super.toString();
		
	}


	@Override
	public void settForNavn(String forNavn) {
		this.firstName = forNavn;
		
	}


	@Override
	public String hentForNavn(String forNavn) {
		return firstName;
		
	}


	@Override
	public void settEtterNavn(String etterNavn) {
		this.lastName = etterNavn;
		
	}


	@Override
	public String hentEtterNavn(String etterNavn) {
		return lastName;
		
	}


	@Override
	public void settFulltNavn(String fulltNavn) {
		this.fullName = fulltNavn;
		
	}


	@Override
	public String hentFulltNavn(String fulltNavn) {
		return fullName;
		
	}


	@Override
	public double beregnKreditt(double kreditt) {
		return 1.1;
	}


	@Override
	public double beregnBonus(double bonus) {
		
return 1.0;
	}
}	
	
	
	
	



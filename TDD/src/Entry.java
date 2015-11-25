
public class Entry {
	
	private String hex;
	private String one;
	private String two;
	private int bitwiseInt;
	private String bitwiseNew;
	private int conValue;

	public Entry(){
		
	}

	public Entry( String hex, int bitwiseInt, String one, String two, String bitwiseNew, int conValue) {
		
		
		this.hex = hex;
		this.bitwiseInt = bitwiseInt;
	    this.one = one;
	    this.two = two;
	    this.bitwiseNew = bitwiseNew;
	    this.conValue = conValue;
	    
	    
	    
	}
	
	
	

	public String getBitwiseNew() {
		return bitwiseNew;
	}
	
	
	public int getConValue() {
		return conValue;
	}




	public String getHex() {
		return hex;
	}

	
	public String getOne() {
		return one;
	}

	
	public String getTwo() {
		return two;
	}


	public int getBitwiseInt() {
		return bitwiseInt;
	}


	}


    
    
    
	




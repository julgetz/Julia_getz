import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class DataClass  {
	
	
	private Map<String, Entry> map = new HashMap<String, Entry>();
	
	
	protected Map<String, Entry> getMap() {
		return map;
	}



	private List<String> logg = new ArrayList<String>();
	
	private Hex2BinConverter conv = new Hex2BinConverter();
	
	
	
	
	
	public void StoretoMap(String s){
		
		// kjører validerings metoder
		
		if(s == null)
			throw new IllegalArgumentException("String cannot be null");	
		
		if(s.isEmpty())
			throw new IllegalArgumentException("String cannot be empty");	
		
	
	   if(!CheckIfStringContains4Elements(s))
		   throw new IllegalArgumentException("String is incomplete");
	  
	  
	   if(splitString(s).get(0) == "0")
		   throw new IllegalArgumentException("Hex value cannt be 0");
		
		
		if(checkHexLength(s) && CheckBitwiseOperator(s) && CheckBitStringsInput(s) &&  CheckBitsStringValidChar(s)) {
			
		String input = s.toUpperCase();
		ArrayList<String> split = splitString(s);
		
		String hex = split.get(0);
		
		int bitwiseInt = Integer.parseInt(split.get(1));
		
		String one = split.get(2);
		String two = split.get(3);
		
		String bitwiseNew = "";
		
		if(bitwiseInt == 1 ){
			bitwiseNew = conv.BitWiseAnd(one, two);
		}
		
		if(bitwiseInt == 2 ){
			bitwiseNew = conv.BitwiseOR(one, two);
		}		
		
		int conValue = conv.BintoDec(bitwiseNew);
		
		if(!map.containsKey(hex))		
			map.put(hex, new Entry(hex, bitwiseInt, one, two, bitwiseNew, conValue));
		else 
			logg.add(s);
		
        
			
			
			
		}
		
		
	}
	
	public boolean CheckValidHexChar(String s){
		
//		String numRegex   = ".*[0-9].*";
//		String CharRegex = ".*[a-fA-F].*";
		String regex = "[0-9a-fA-F]{1,6}";
		

		if (s.matches(regex)) {
		
       return true;
   }
		
	
		return false;
		
	}
	
	
	public boolean checkHexLength(String s){
		
     ArrayList<String> split = splitString(s);
		
	       String hex = split.get(0);
	        
	       if(hex.length() >= 1 && hex.length() <= 6) {
	    	   
	    	   return true;
	    	   
	       }
		return false;
		
	
		
	}
	
	
	

	protected ArrayList<String> splitString(String s) {
		ArrayList<String> split = new ArrayList<String>();
			
			for (String retval: s.split(" ")){
				split.add(retval);
				
			}
		return split;
	}
	
	public boolean CheckBitwiseOperator(String s){
		
      ArrayList<String> split = splitString(s);
		  
		  
		  String bitwise = split.get(1);
		  
		  if(bitwise.length() > 1) {
			  return false;
		  }else{
			  if(bitwise.contains("1") || bitwise.contains("2")) {
				  return true;
			  }else{
		  // logg invalid bitwise
				  
		 logg.add(s);
		 
				  
				  
		  }
		  }
		return false;
		
	}
	
	
	 public boolean CheckBitStringsInput(String s){
		
		 ArrayList<String> split = splitString(s);
		  
		  String s1 = split.get(2);
		  String s2 = split.get(3);
		  
		  if(s1.length() >= 1 && s1.length() <= 24 && s2.length() >=1 && s2.length() <=24){
			  return true;
		  }
		  
		
		 return false;
		 
	 }
	 
	 
	 public boolean CheckBitsStringValidChar(String s){
		 
		    String numRegex   = ".*[0-1].*";
			
			if (s.matches(numRegex)) {
			
		
	       return true;
		
	 }
		 
		 return false;
		 
		 
	 }
	
	 
	 public boolean CheckIfStringContains4Elements(String s){
		 
		if(splitString(s).size() == 4)
			 return true;
		else
			return false;
	 
	 }
	 
	
	
	private static Måledata måledata;
	
	public DataClass(){
		
	}
	
	public DataClass(Måledata måledata){
		this.måledata = måledata;
	}
	
	
	public Object openFile(){
		return måledata.openFile();
		
	}
	
	public String readFile(){
		return måledata.ReadFile();
	}
	
	
	
	
	public boolean checkFile(){
		return måledata.checkfile();
	}
	
	
	
	
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	



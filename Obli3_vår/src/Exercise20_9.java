
public class Exercise20_9 {
	
	public static String reversedisplay (String value){
		
		int i, len = value.length();
		StringBuilder dest = new StringBuilder(len);

	    for (i = (len - 1); i >= 0; i--){
	        dest.append(value.charAt(i));
	    }

	    return dest.toString();
	}
		
          
        	  
        	 
        	  
          }
	



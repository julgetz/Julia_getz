
public class Exercise20_8 {
	
	public static int reverseDisplay(int value){

		long reversedNum = 0;
		
		long value_long = value;
		
		while (value_long !=0)
		{
			
		reversedNum = reversedNum * 10 + value_long % 10;
		value_long = value_long / 10;
		}
		
		if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE )
		{
		throw new IllegalArgumentException();	
		}
		return (int)reversedNum;
			
		}
		
		
	}



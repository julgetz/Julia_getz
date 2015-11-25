import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class Hex2BinConverterTest {
	
	private String input;
	private int expected;
	
	private Hex2BinConverter hb;
	
	
	@Parameters
	public static List<Object[]> hexToDec() {
		return Arrays.asList(new Object[][] {			
			{"1", 1},// min
			{"  " , 0 },
			{"ABCDEF", 11259375}, 		
			{"4E8735", 5146421}, 
			{"6F9", 1785} 
			
		});
	}
	
	// constructor
	public Hex2BinConverterTest(String input, int expected) {
		this.input = input;
		this.expected = expected;
	}

	@Before
	public void Setup()
	{	
		hb = new Hex2BinConverter();
	}
	
	@Test	
	public void convertHexToDec_ParameterizedTest()
	{
		assertEquals(expected, hb.HextoDec(input), 0.0);
	}
}
	
	
	


	


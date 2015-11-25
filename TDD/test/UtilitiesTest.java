
import static org.junit.Assert.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class UtilitiesTest {
	
	@Rule	
	public final ExpectedException ex = ExpectedException.none();
	
	private  Hex2BinConverter util;
	
	
	
	@Before 
	
	public void setUp(){
		
		util = new  Hex2BinConverter();
		
	}
	


	@Test
	public void BitWiseOR_given0101and0011_ShouldReturn0111() {
		
		assertEquals("", "0111", util.BitwiseOR("0101", "0011"));
	}
	
	
	@Test 
	public void BitWiseOr_given0nad0_ShouldReturn0(){
		
		assertEquals("", "0", util.BitwiseOR("0", "0"));
		
	}
	
	@Test 
	public void BitWiseOR_GivenStringsOfDiffrentlengths_ShouldThrowIllegalException() {
		
		ex.expect(IllegalArgumentException.class);
		ex.expectMessage("Length not the same");
		util.BitwiseOR("0101", "101010101");
		
	}
		
	@Test 
	public void DecToHex_Given19_ShouldReturn13(){
		
	assertEquals("", "13", util.DectoHex(19));	
		
	}
	
	
	
	@Test
	public void DecToHex_Given1_ShouldReturn1(){
		assertEquals("", "1", util.DectoHex(1));
	}
	
	@Test
	public void DecToHex_Given16777215_ShouldreturnFFFFFF(){
		assertEquals("", "FFFFFF", util.DectoHex(16777215));
	}
		
	@Test 
	public void DecToHex_Given0_ShouldReturn0(){
		assertEquals("", "0", util.DectoHex(0));
	}
	
	@Test 
	public void HexToDec_GivenAB905B_ShouldReutnr11243611(){
		assertEquals("", 11243611, util.HextoDec("AB905B"));
	}
	
	
	@Test
	public void BinToDec_Given0_ShouldReturn0(){
		assertEquals("",  0, util.BintoDec("0"));
		
	}
	
	@Test
	public void BinToDec_Given42_ShouldReturn101010(){
		assertEquals("", 5, util.BintoDec("000000000000000101"));
	}
	
	@Test
	public void DectoBin_Given00101010_ShouldReturn42(){
		assertEquals("", "101010", util.DectoBin(42));
	}
	
	
		
		
		
	}
	
	 
	

		
		
		
	
	



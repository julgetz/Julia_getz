import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.DCMPG;

import static org.mockito.Mockito.*;

public class DataClassTest {
	
	private DataClass data;
	private Måledata måledata;
	private DataClass dc;
	
	
	@Before 	
	public void setUp(){
		
		måledata = mock(Måledata.class);
		data = new DataClass(måledata);
		
		 dc = new DataClass();		
	}


	@Test
	public void DataClass_CheckIfHexString_OnlyContain0_6a_f(){
		
		assertThat(dc.CheckValidHexChar("abc123"), is(true));
		
	}
	
	
	@Test
	public void DataClass_CheckIfHexLength_is6(){
		assertTrue(dc.checkHexLength("abc123"));
	}
	
	@Test
	public void DataClass_CheckIfHecLenght_isNot6(){
		assertFalse(dc.checkHexLength("abcd1234"));
	}
	
	
@Test
	public void DataClass_ShouldOpenFile(){
		
		when(data.openFile()).thenReturn("ac0e1e 2 001000011110011101001111 000101010101010101111001");
		assertThat(data.openFile(), equalTo("ac0e1e 2 001000011110011101001111 000101010101010101111001"));
		
		verify(måledata, times(1)).openFile();
		
	}
	
	
	@Test
	public void DataClass_ReadFile_ShouldReturnStringOfmåledata(){
		
		when(data.readFile()).thenReturn("03ac0f");
		assertThat(data.readFile(), equalTo("03ac0f"));
		
		verify(måledata, times(1)).ReadFile();
	}
	
	
	@Test
	public void DataClass_Checkfile_ShouldReturnIfFileHasMoreData(){
		
		when(data.checkFile()).thenReturn(true);
		assertThat(data.checkFile(), is(true));
		
		verify(måledata, times(1)).checkfile();
	}
	
	
	@Test
	public void CheckValidHexChar_GivenHexStrings_ShouldReturnTrue(){
		 
		assertTrue(dc.CheckValidHexChar("AB123A"));
     	assertFalse(dc.CheckValidHexChar("101010101"));
		
		
     	
	}
	
	@Test
	public void StoretoMap_GivennondupString_MapShouldContainEntry(){
		
		dc.StoretoMap("ac0e1e 2 001000011110011101001111 000101010101010101111001");
		
		Map<String, Entry> map=dc.getMap();
		Entry e = new Entry();
		
		for (Map.Entry<String, Entry> entry : map.entrySet())
		{
			e = entry.getValue();
		}
     	
     	
     	
     	assertEquals("", "ac0e1e", e.getHex());
		assertEquals("", 2, e.getBitwiseInt());
		assertEquals("", "001000011110011101001111", e.getOne());
		assertEquals("", "000101010101010101111001", e.getTwo());
		assertEquals("", "001101011111011101111111", e.getBitwiseNew());
		assertEquals("", 3536767, e.getConValue());
     	
	} 
	
	
	
     	
	}
	
	
	
		

	
	



import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Stack;

public class Hex2BinConverter {

//	DataClass d = new DataClass();

	public int HextoDec(String hex) {

		if (hex == null)
			return 0;

		if (hex.isEmpty())
			return 0;

		if (hex.length() > 6)
			throw new IllegalArgumentException("Too long");

		
		hex.toUpperCase();
		
  	    int dec = 0;

		for (int i = 0; i < hex.length(); i++) {

			if (hex.charAt(i) >= '0' && hex.charAt(i) <= '9') {

				dec = (dec * 16) + hex.charAt(i) - '0';

			}

			if (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') {
				dec = (dec * 16) + 10 + hex.charAt(i) - 'A';
			}

		}

		return dec;

	}

	public String DectoHex(int decimal) {

		String hex = "";

		if (decimal == 0) {
			return "0";
		}

		while (decimal != 0) {

			int hexValue = decimal % 16;

			hex = toHexChar(hexValue) + hex;

			decimal = decimal / 16;

		}

		return hex;

	}

	/** Convert an integer to a singel hex digit in a char */

	private char toHexChar(int hexValue) {
		if (hexValue <= 9 && hexValue >= 0)
			return (char) (hexValue + '0');
		else
			return (char) (hexValue - 10 + 'A');
	}

	public int BintoDec(String bin) {

		if (bin == null)
			return 0;

		if (bin.isEmpty())
			return 0;

		if (bin.length() > 24)
			throw new IllegalArgumentException("Cant be shorter than 24 digits");

		// String til int

		int value = bin.charAt(0) - '0';
		for (int i = 1; i < bin.length(); i++) {
			value = value * 2 + bin.charAt(i) - '0';
		}

		return value;

	}

	public String DectoBin(int n) {

		StringBuffer buffer = new StringBuffer();

		while (n != 0) {
			int bin = n % 2;

			buffer.insert(0, bin);

			n = n / 2;

		}

		return buffer.toString();

	}

	public String BitwiseOR(String s1, String s2) {

		if (s1.isEmpty() || s2.isEmpty())
			return "0";

		if (s1 == null || s2 == null)
			return "0";

		// sjekker om begge om s1 og s2 er like lang

	if (s1.length() != s2.length()) {
		throw new IllegalArgumentException("Length not the same");

		}

		String temp = "";

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == '0' && s2.charAt(i) == '0') {

				temp += '0';
			} else {
				temp += '1';
			}

		}

		return temp;

	}

	public String BitWiseAnd(String s1, String s2) {

		if (s1.isEmpty() || s2.isEmpty())
			return "0";

		if (s1 == null || s2 == null)
			return "0";

		// sjekker om begge om s1 og s2 er like lang

		if (s1.length() != s2.length()) {
			throw new IllegalArgumentException("Length not the same");

		}

		String temp = "";

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == '1' && s2.charAt(i) == '1') {

				temp += '1';
			} else {
				temp += '0';
			}
		}

		return temp;

	}

}

import java.util.Scanner;

public class Test_Exercis20_8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter an integer: ");
		int i  = input.nextInt();
		reverseDisplay(i);
	}

	private static void reverseDisplay(int value) {
		if (value !=0){
			System.out.print(value % 10);
			value = value / 10;
			reverseDisplay(value);
			}
		
		
		
	}

}

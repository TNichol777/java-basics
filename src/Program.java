import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter days: ");

		int days = scanner.nextInt();


		int seconds = days * 24 * 60 * 60;
		System.out.println(seconds + " Seconds");

	}

}
/*
 * int days = scanner.nextInt();
 * 
 * System.out.println("Enter a number of days: ");
 * 
 * int seconds = days * 24 * 60 * 60; System.out.println(seconds + " Seconds");
 */

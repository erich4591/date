import java.util.Scanner;

public class date {

	private static int day, month, year;
	
	public static void main(String[] args) {
		readYear();
		System.out.println("The year is: " + year);
	}
	
	public static void readYear() {
		System.out.println("Give year (2000-3000)");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		while (year < 2000 || year > 3000) {
			System.out.println("Invalid Input: Give year (2000-3000)");
			year = sc.nextInt();
		}
	}
}

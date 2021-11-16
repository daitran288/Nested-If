import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number?");
		int x = input.nextInt();
		if (x < 1 || x > 4) {
			System.out.println("That ");
		}
	}
}
import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int check = 0;
		boolean lowercase = false;
		boolean uppercase = false;
		
		System.out.println("You will need to create a password that meets the following criteria:");
		System.out.println("At least one lowercase letter");
		System.out.println("At least one uppercase letter");
		System.out.println("Minimum 7 characters");
		System.out.println("Maximum 12 characters");
		System.out.println("An exlcamation point (!)");
		System.out.print("Please enter your passowrd: ");
		String password = input.nextLine();
		
			
		while (check == 0) {
			if (password.length() >= 7 && password.length() <= 12) {
				if (password.contains("!")) {
					for (int i = 0; i < password.length(); i++) {
						if (Character.isUpperCase(password.charAt(i))) {
							uppercase = true;
						} else if (Character.isLowerCase(password.charAt(i))) {
							lowercase = true;
						}
					}
					if (uppercase == true && lowercase == true) {
						System.out.println("Password valid and accepted.");
						check++;
					} else {
						System.out.print("Please enter a valid password: ");
						password = input.nextLine();
					}
				} else {
					System.out.print("Please enter a valid password: ");
					password = input.nextLine();
				}
			} else {
				System.out.print("Please enter a valid password: ");
				password = input.nextLine();
			}
		}
	}
}

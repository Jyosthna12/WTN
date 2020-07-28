package abstraction.exceptionHandling;


import java.util.*;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();
		System.out.println("Invalid age");
	}
}
	public class Exc_e5 {
		@SuppressWarnings("resource")
		public static void main(String[] args) throws InvalidAgeException {
			Scanner scan=new Scanner(System.in);
			String name = scan.next();
			int age = scan.nextInt();
			if (age < 18 || age >= 60) {
				throw new InvalidAgeException();
			}
			System.out.println("Name: " + name + "\nAge: " + age);
			scan.close();
		}

	}




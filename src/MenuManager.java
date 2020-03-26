import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num != 6) {
			System.out.println("*** Esf Management System Menu ***");
			System.out.println(" 1. Add member");
			System.out.println(" 2. Delate member");
			System.out.println(" 3. Edit member");
			System.out.println(" 4. Veiw member");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num  = input.nextInt(); 
			if (num == 1) {
				addmember();
			}
			else if (num == 2) {
				delatemember();
			}
			else if (num == 3) {
				editmember();
			}
			else if (num == 4) {
				viewmember();
			}
			else {
				continue;
			}
		}
	}
	public static void addmember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Membrt ID: ");
		int memberid = input.nextInt();
		System.out.print("Membrt name: ");
		String MemberName = input.next();
		System.out.println("Email address: ");
		String MemberEmail = input.next();
		System.out.println("Phone nember: ");
		String Memberphone = input.next();
		System.out.println(Memberphone);
	}

	public static void delatemember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Membrt ID: ");
		int memberid = input.nextInt();

	}

	public static void editmember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Membrt ID: ");
		int memberid = input.nextInt();

	}
	public static void viewmember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Membrt ID: ");
		int memberid = input.nextInt();

	}

}


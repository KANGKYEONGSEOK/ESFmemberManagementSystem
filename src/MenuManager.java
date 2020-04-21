import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberManager membermanager = new MemberManager(input);

		int num = 0;
		while (num != 5) {
			System.out.println("*** Esf Management System Menu ***");
			System.out.println(" 1. Add member");
			System.out.println(" 2. Delete member");
			System.out.println(" 3. Edit member");
			System.out.println(" 4. Veiw members"); //관리하는 멤버의 수가 2명이상이므로 members로 수정.
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1 - 5:");
			num = input.nextInt();
			if (num == 1) {
				membermanager.addmember();
			} 
			else if (num == 2) {
				membermanager.deletemember();
			} 
			else if (num == 3) {
				membermanager.editmember();
			} 
			else if (num == 4) {
				membermanager.viewmembers();
			} 
			else {
				continue;

			}
		}
	}

}

import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberManager membermanager = new MemberManager(input);

		int num = 0;
		while (num != 5) {
			showMenu();
			num = input.nextInt();
			
			switch(num) {
			case 1:
				membermanager.addmember();
				break;
			case 2:
				membermanager.deletemember();
				break;
			case 3:
				membermanager.editmember();
				break;
			case 4:
				membermanager.viewmembers();
				break;
			default:
				continue;
			}
		}
	}
	public static void showMenu() {
		System.out.println("*** Esf Management System Menu ***");
		System.out.println(" 1. Add member");
		System.out.println(" 2. Delete member");
		System.out.println(" 3. Edit member");
		System.out.println(" 4. Veiw members"); //�����ϴ� ����� ���� 2���̻��̹Ƿ� members�� ����.
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}

}

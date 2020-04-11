import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {
	ArrayList<Member> members = new ArrayList<Member>(); // ArrayList �� ������ Ŭ������ �迭�� ����Ʈ�� ����� �ٷ�ٴ� ��.

	Member member; // add member �� ����
	Scanner input; // input�� Ŭ���� ���������� �ʵ�� ����

	MemberManager(Scanner input) {
		this.input = input;
	}

	public void addmember() {
		Member member = new Member(); // Member class�� ���ο� �޸� ���� ����
		System.out.print("Member ID: ");
		member.id = input.nextInt(); // ��ü�� �ʵ忡 �Է��� ��
		System.out.print("Member name: ");
		member.name = input.next();
		System.out.println("Email address: ");
		member.email = input.next();
		System.out.println("Phone number: ");
		member.phone = input.next();
		System.out.println("Campus: ");
		member.campus = input.next();
		System.out.println("position: ");
		member.position = input.next();
		System.out.println("Attendding church: ");
		member.attenddingchurch = input.next();
		members.add(member); // ������ �Է¹��� member�� ������ members�� �߰� �ϰ� �ȴ�.

	}

	public void deletemember() {
		System.out.print("Member ID: ");
		int MemberID = input.nextInt();
		int index = -1; // array ���� �ε����� ��ã�Ѵٴ� ��(index�� 0���� ����)
		for (int i = 0; i < members.size(); i++) { // int i= 0 i�ʱ�ȭ
			if (members.get(i).id == MemberID) { // ember.id == MemberID�� ���)
				index = i;
				break;

			}
		}

		if (index >= 0) { // index ���� ã�Ҵ�.
			members.remove(index);
			System.out.println("the member " + MemberID + " is deleted");

		} else {
			System.out.println("the member has not been registered!!");
		}
	}

	public void editmember() {
		System.out.print("Membrt ID: ");
		int MemberID = input.nextInt();
		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if (member.id == MemberID) { // member.id == MemberID�� ���)
				int num = 0;
				while (num != 8) {
					System.out.println("** Esf Member Info Edit Menu **");
					System.out.println(" 1. Edit Id");
					System.out.println(" 2. Edit Name");
					System.out.println(" 3. Edit Email");
					System.out.println(" 4. Edit Phone");
					System.out.println(" 5. Edit Campus");
					System.out.println(" 6. Edit Position");
					System.out.println(" 7. Edit Attendding Church");
					System.out.println(" 8. Exit");
					System.out.println("Select one number between 1 - 8:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Member ID: ");
						member.id = input.nextInt();

					} else if (num == 2) {
						System.out.print("Member name: ");
						member.name = input.next();

					} else if (num == 3) {
						System.out.println("Email address: ");
						member.email = input.next();

					} else if (num == 4) {
						System.out.println("Phone number: ");
						member.phone = input.next();

					} else if (num == 5) {
						System.out.println("Campus: ");
						member.campus = input.next();

					} else if (num == 6) {
						System.out.println("position: ");
						member.position = input.next();

					} else if (num == 7) {
						System.out.println("Attendding church: ");
						member.attenddingchurch = input.next();

					} else {
						continue;
					} // if
				} // while
				break;
			} // if
		} // for
	} // public~

	public void viewmembers() {
		// System.out.print("Membrt ID: ");
		// int MemberID = input.nextInt();
		for (int i = 0; i < members.size(); i++) {
			members.get(i).printInfo();
		}

	}

}

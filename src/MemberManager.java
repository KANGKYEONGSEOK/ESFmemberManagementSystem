import java.util.ArrayList;
import java.util.Scanner;

import member.HighschoolMember;
import member.Member;

public class MemberManager {
	ArrayList<Member> members = new ArrayList<Member>(); // ArrayList �� ������ Ŭ������ �迭�� ����Ʈ�� ����� �ٷ�ٴ� ��.

	Member member; // add member �� ����
	Scanner input; // input�� Ŭ���� ���������� �ʵ�� ����

	MemberManager(Scanner input) {
		this.input = input;
	}

	public void addmember() {
		int kind = 0;
		Member member;
		while (kind != 1 && kind != 2) {
			System.out.print("1. for University ");
			System.out.print("2. for High school ");
			System.out.print("** Select num for Member Kind between 1 or 2 **");
			kind = input.nextInt();

			if (kind == 1) {
				member = new Member();
				member.getUserInput(input);
				members.add(member); // ������ �Է¹��� member�� ������ members�� �߰� �ϰ� �ȴ�.
				break;
			} else if (kind == 2) {
				member = new HighschoolMember();
				member.getUserInput(input);
				members.add(member); // ������ �Է¹��� member�� ������ members�� �߰� �ϰ� �ȴ�.
				break;
			} else {
				System.out.print("** Select num for Member	Kind between 1 or 2 **");
			}
		}

	}

	public void deletemember() {
		System.out.print("Member ID: ");
		int MemberID = input.nextInt();
		int index = -1; // array �� �� �ε����� ��ã�Ѵٴ� ��(index�� 0���� ����)
		for (int i = 0; i < members.size(); i++) { // int i= 0 i�ʱ�ȭ
			if (members.get(i).getId() == MemberID) { // member.id == MemberID�� ���)
				index = i;
				break; // **

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
			if (member.getId() == MemberID) { // member.id == MemberID�� ���)
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
						int id = input.nextInt();
						member.setId(id);

					} else if (num == 2) {
						System.out.print("Member name: ");
						String name = input.next();
						member.setName(name);

					} else if (num == 3) {
						System.out.println("Email address: ");
						String email = input.next();
						member.setEmail(email);

					} else if (num == 4) {
						System.out.println("Phone number: ");
						String phone = input.next();
						member.setPhone(phone);

					} else if (num == 5) {
						System.out.println("Campus: ");
						String campus = input.next();
						member.setCampus(campus);

					} else if (num == 6) {
						System.out.println("position: ");
						String position = input.next();
						member.setPosition(position);

					} else if (num == 7) {
						System.out.println("Attendding church: ");
						String attenddingchurch = input.next();
						member.setAttenddingchurch(attenddingchurch);

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
		System.out.println("# of registered member: " + members.size());
		for (int i = 0; i < members.size(); i++) {
			members.get(i).printInfo();
		}

	}

}

import java.util.ArrayList;
import java.util.Scanner;

import member.HighschoolMember;
import member.Member;

public class MemberManager {
	ArrayList<Member> members = new ArrayList<Member>(); // ArrayList 는 멤버라는 클래스를 배열로 리스트를 만들어 다룬다는 뜻.

	Member member; // add member 시 생성
	Scanner input; // input을 클래스 레벨에서의 필드로 선언

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
				members.add(member); // 위에서 입력받은 member의 정보를 members에 추가 하게 된다.
				break;
			} else if (kind == 2) {
				member = new HighschoolMember();
				member.getUserInput(input);
				members.add(member); // 위에서 입력받은 member의 정보를 members에 추가 하게 된다.
				break;
			} else {
				System.out.print("** Select num for Member	Kind between 1 or 2 **");
			}
		}

	}

	public void deletemember() {
		System.out.print("Member ID: ");
		int MemberID = input.nextInt();
		int index = -1; // array 에 서 인덱스값 못찾앗다는 뜻(index는 0부터 시작)
		for (int i = 0; i < members.size(); i++) { // int i= 0 i초기화
			if (members.get(i).getId() == MemberID) { // member.id == MemberID면 출력)
				index = i;
				break; // **

			}
		}

		if (index >= 0) { // index 값을 찾았다.
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
			if (member.getId() == MemberID) { // member.id == MemberID면 출력)
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

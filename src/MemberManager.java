import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {
	ArrayList<Member> members = new ArrayList<Member>(); // ArrayList 는 멤버라는 클래스를 배열로 리스트를 만들어 다룬다는 뜻.

	Member member; // add member 시 생성
	Scanner input; // input을 클래스 레벨에서의 필드로 선언

	MemberManager(Scanner input) {
		this.input = input;
	}

	public void addmember() {
		Member member = new Member(); // Member class에 새로운 메모리 값이 생성
		System.out.print("Member ID: ");
		member.id = input.nextInt(); // 객체의 필드에 입력이 됨
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
		members.add(member); // 위에서 입력받은 member의 정보를 members에 추가 하게 된다.

	}

	public void deletemember() {
		System.out.print("Member ID: ");
		int MemberID = input.nextInt();
		int index = -1; // array 에서 인덱스값 목찾앗다는 뜻(index는 0부터 시작)
		for (int i = 0; i < members.size(); i++) { // int i= 0 i초기화
			if (members.get(i).id == MemberID) { // ember.id == MemberID면 출력)
				index = i;
				break;

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
			if (member.id == MemberID) { // member.id == MemberID면 출력)
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

package member;

import java.util.Scanner;

public class HighschoolMember extends Member {

	public void getUserInput(Scanner input) {
		System.out.print("Member ID: ");
		int id = input.nextInt(); // ��ü�� �ʵ忡 �Է��� ��
		this.setId(id);

		System.out.print("Member name: ");
		String name = input.next();
		this.setName(name);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have an Email address? (Y/N)");
			answer = input.next().charAt(0); // ó������ ������ ��.
			if (answer == 'y' || answer == 'Y') {
				System.out.println("Email address: ");
				String email = input.next();
				this.setEmail(email);
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.setEmail("");
				break;
			} else {
			}
		}

		char answer1 = 'x';
		while (answer1 != 'y' && answer1 != 'Y' && answer1 != 'n' && answer1 != 'N') {
			System.out.println("Do you have an Phone number? (Y/N)");
			answer1 = input.next().charAt(0); // ó������ ������ ��.
			if (answer1 == 'y' || answer1 == 'Y') {
				System.out.println("Phone number: ");
				String phone = input.next();
				this.setPhone(phone);
				break;
			} else if (answer1 == 'n' || answer1 == 'N') {
				this.setPhone("");
				break;
			} else {

			}
		}

		System.out.println("Campus: ");
		String campus = input.next();
		this.setCampus(campus);

		System.out.println("position: ");
		String position = input.next();
		this.setPosition(position);

		System.out.println("Attendding church: ");
		String attenddingchurch = input.next();
		this.setAttenddingchurch(attenddingchurch);
	}
}

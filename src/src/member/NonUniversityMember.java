package member;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class NonUniversityMember extends Member {

	public NonUniversityMember(MemberKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:" + skind + " id:" + id + " name:" + name + " email:" + email + " phone:" + phone
				+ " campus:" + campus + " position:" + position + " attenddingchurch:" + attenddingchurch);
		System.out.println("The people of GOD!");
	}

	public void setMemberEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have an Email address? (Y/N)");
			answer = input.next().charAt(0); // 처음값을 가지고 옮.
			try {
				if (answer == 'y' || answer == 'Y') {
					setMemberEmail(input);
					break;
//					System.out.println("Email address: ");
//					String email = input.next();
//					this.setEmail(email);
//					break;
				} 
				
				else if (answer == 'n' || answer == 'N') {
					this.setEmail("");
					break;
				} 
				else {
				}
			}
			catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. Please put the e-mail adderess that contains @ ");
			}
		}
	}

	public void setMemberPhonewithYN(Scanner input) {
		char answer1 = 'x';
		while (answer1 != 'y' && answer1 != 'Y' && answer1 != 'n' && answer1 != 'N') {
			System.out.println("Do you have an Phone number? (Y/N)");
			answer1 = input.next().charAt(0); // 처음값을 가지고 옮.
			if (answer1 == 'y' || answer1 == 'Y') {
				setMemberPhone(input);
				break;
			} else if (answer1 == 'n' || answer1 == 'N') {
				this.setPhone("");
				break;
			} else {
			}
		}
	}
}

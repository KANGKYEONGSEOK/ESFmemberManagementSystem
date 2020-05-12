package member;

import java.util.Scanner;

import member.MemberKind;

public class Graduate extends NonUniversityMember {

	protected String mateEmail;
	protected String matePhone;

	public Graduate(MemberKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberEmailwithYN(input);
		setMemberPhonewithYN(input);
		setMateEmailwithYN(input);
		setMatePhonewithYN(input);
		setMemberCampus(input);
		setMemberPosition(input);
		setMemberAttenddingChurch(input);
	} // getUserInput

	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: " + skind + " id:" + id + " name:" + name + " email:" + email + " phone:" + phone
				+ " mateemail:" + email + " matephone:" + phone + " campus:" + campus + " position:" + position
				+ " attenddingchurch:" + attenddingchurch);
		System.out.println("The people of GOD!");
	} // printInfo

	public void setMateEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have a mate Email address? (Y/N)");
			answer = input.next().charAt(0); // 처음값을 가지고 옮.
			if (answer == 'y' || answer == 'Y') {
				setMemberEmail(input);
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.setEmail("");
				break;
			} else {
			}
		} // while
	}

	public void setMatePhonewithYN(Scanner input) {
		char answer1 = 'x';
		while (answer1 != 'y' && answer1 != 'Y' && answer1 != 'n' && answer1 != 'N') {
			System.out.println("Do you have a mate Phone number? (Y/N)");
			answer1 = input.next().charAt(0); // 처음값을 가지고 옮.
			if (answer1 == 'y' || answer1 == 'Y') {
				setMemberPhone(input);
				break;
			} else if (answer1 == 'n' || answer1 == 'N') {
				this.setPhone("");
				break;
			} else {
			}
		} // while
	}

} // class

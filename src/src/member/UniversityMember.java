package member;

import java.util.Scanner;

public class UniversityMember extends Member {

	public UniversityMember(MemberKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberEmail(input);
		setMemberPhone(input);
		setMemberCampus(input);
		setMemberPosition(input);
		setMemberAttenddingChurch(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:" + skind + " id:" + id + " name:" + name + " email:" + email + " phone:" + phone
				+ " campus:" + campus + " position:" + position + " attenddingchurch:" + attenddingchurch);
		System.out.println("The people of GOD!");
	}

}

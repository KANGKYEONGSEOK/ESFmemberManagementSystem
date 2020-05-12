package member;

import java.util.Scanner;

import member.MemberKind;

public class HighschoolMember extends NonUniversityMember {

	public HighschoolMember(MemberKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberEmailwithYN(input);
		setMemberPhonewithYN(input);
		setMemberCampus(input);
		setMemberPosition(input);
		setMemberAttenddingChurch(input);
	}

}

package member;

import java.util.Scanner;

public interface MemberInput {

	public int getId();

	public void setId(int id);

	public void setName(String name);

	public void setEmail(String email);

	public void setPhone(String phone);

	public void setCampus(String campus);

	public void setPosition(String position);

	public void setAttenddingchurch(String attenddingchurch);

	public void getUserInput(Scanner input);

	public void printInfo();

	public void setMemberID(Scanner input);

	public void setMemberName(Scanner input);

	public void setMemberEmail(Scanner input);

	public void setMemberPhone(Scanner input);

	public void setMemberCampus(Scanner input);

	public void setMemberPosition(Scanner input);

	public void setMemberAttenddingChurch(Scanner input);

}

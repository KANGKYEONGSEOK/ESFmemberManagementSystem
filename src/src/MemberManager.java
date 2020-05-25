import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import member.Graduate;
import member.HighschoolMember;
import member.MemberInput;
import member.MemberKind;
import member.UniversityMember;
 
public class MemberManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2641023388399356158L;

	ArrayList<MemberInput> members = new ArrayList<MemberInput>(); // ArrayList 는 멤버라는 클래스를 배열로 리스트를 만들어 다룬다는 뜻.
	transient Scanner input; // Scanner는 저장하지 않겠다 라는 뜻으로 transient. transient는 Serialize하는 과정에 제외하고 싶은 경우 선언하는 키워드입니다.
	

	MemberManager(Scanner input) {
		this.input = input;
	}

	public void addmember() {
		int kind = 0;
		MemberInput member;

		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1. for University ");
				System.out.println("2. for High school ");
				System.out.println("3. for Graduate ");
				System.out.println("** Select num 1 or 2 or 3 for Member Kind between **");
				kind = input.nextInt();

				if (kind == 1) {
					member = new UniversityMember(MemberKind.University);
					member.getUserInput(input);
					members.add(member); // 위에서 입력받은 member의 정보를 members에 추가 하게 된다.
					break;
				} else if (kind == 2) {
					member = new HighschoolMember(MemberKind.HighSchool);
					member.getUserInput(input);
					members.add(member); // 위에서 입력받은 member의 정보를 members에 추가 하게 된다.
					break;
				} else if (kind == 3) {
					member = new Graduate(MemberKind.Graduate);
					member.getUserInput(input);
					members.add(member); // 위에서 입력받은 member의 정보를 members에 추가 하게 된다.
					break;
				} else {
					System.out.print("** Select num 1 or 2 or 3 for Member Kind between  **");
				}
			} catch (InputMismatchException e) {
				System.out.println(" Please put an integer between 1 ~ 3 ");
				if (input.hasNext()) {
					input.next();
				}
				kind = 0;
			}
		}

	}

	public void deletemember() {
		System.out.print("Member ID: ");
		int MemberID = input.nextInt();
		int index = findIndex(MemberID);
		removefromMembers(index, MemberID);
	}

	public int findIndex(int MemberID) {
		int index = -1; // array 에 서 인덱스값 못찾앗다는 뜻(index는 0부터 시작)
		for (int i = 0; i < members.size(); i++) { // int i= 0 i초기화
			if (members.get(i).getId() == MemberID) { // member.id == MemberID면 출력)
				index = i;
				break; // **
			}
		}
		return index;
	}

	public int removefromMembers(int index, int MemberID) {
		if (index >= 0) { // index 값을 찾았다.
			members.remove(index);
			System.out.println("the member " + MemberID + " is deleted");
			return 1; // 정상적으로 찾았으므로 정상 처리
		} else {
			System.out.println("the member has not been registered!!");
			return -1; // 찾지 못하였으므로 비정상 처리
		}
	}

	public void editmember() {
		System.out.print("Membrt ID: ");
		int MemberID = input.nextInt();
		for (int i = 0; i < members.size(); i++) {
			MemberInput member = members.get(i);
			if (member.getId() == MemberID) { // member.id == MemberID면 출력)
				int num = 0;
				while (num != 8) {
					showEditMenu();
					num = input.nextInt();

					switch (num) {
					case 1:
						member.setMemberID(input);
						break;
					case 2:
						member.setMemberName(input);
						break;
					case 3:
						member.setMemberEmail(input);
						break;
					case 4:
						member.setMemberPhone(input);
						break;
					case 5:
						member.setMemberCampus(input);
						break;
					case 6:
						member.setMemberPosition(input);
						break;
					case 7:
						member.setMemberAttenddingChurch(input);
						break;
					default:
						continue;
					} // switch
				} // while
				break;
			} // if
		} // for
	} // public~

	public void viewmembers() {
		System.out.println("# of registered member: " + members.size());
		for (int i = 0; i < members.size(); i++) {
			members.get(i).printInfo();
		}
	}

	public void showEditMenu() {
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
	}
	
	public void setScanner(Scanner input) {
        this.input = input;
    }
	
}

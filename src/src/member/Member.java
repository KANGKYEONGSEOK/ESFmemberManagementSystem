package member;

import java.io.Serializable;
import java.util.Scanner;
import exception.EmailFormatException;
import member.MemberKind;

public abstract class Member implements MemberInput, Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5029920574387810301L;

	protected MemberKind kind;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	protected String campus;
	protected String position;
	protected String attenddingchurch; 

	public Member() {
	}

	public Member(MemberKind kind) {
		this.kind = kind;
	}
	public Member(String name, int id, String campus, String position) {
		this.id = id;
		this.name = name;
		this.campus = campus;
		this.position = position;
	}

	public Member(MemberKind kind,int id, String name, String email, String phone, String campus, String position,
			String attenddingchurch) {
		this.kind = kind; //
		this.id = id; // this의 뜻. 필드의 네임의~ 뒤에거는 파라미터 네임
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.campus = campus;
		this.position = position;
		this.attenddingchurch = attenddingchurch;
	}

	// getter % setter
	public MemberKind getKind() {
		return kind;
	}

	public void setKind(MemberKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException {
		if (!email.contains("@") && !email.equals("") ) { // 이메일 형식에 @가 포함되어 있지 않으면 if선언.
			throw new EmailFormatException();
		}
		this.email = email;
	}

	public String getPhone() {
		return phone; 
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAttenddingchurch() {
		return attenddingchurch;
	}

	public void setAttenddingchurch(String attenddingchurch) {
		this.attenddingchurch = attenddingchurch;
	}

	public abstract void printInfo();

	public void setMemberID(Scanner input) {
		System.out.print("Member ID: ");
		int id = input.nextInt();
		this.setId(id);
	}

	public void setMemberName(Scanner input) {
		System.out.print("Member name: ");
		String name = input.next();
		this.setName(name);
	}

	public void setMemberEmail(Scanner input) {
		String email = "";

		while(!email.contains("@")) {
			System.out.println("Email address: ");
			email = input.next();
			try {
				this.setEmail(email);
			} catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. Please put the e-mail adderess that contains @ ");
			}
		}
	}


	public void setMemberPhone(Scanner input) {
		System.out.println("Phone number: ");
		String phone = input.next();
		this.setPhone(phone);
	}

	public void setMemberCampus(Scanner input) {
		System.out.println("Campus: ");
		String campus = input.next();
		this.setCampus(campus);
	}

	public void setMemberPosition(Scanner input) {
		System.out.println("position: ");
		String position = input.next();
		this.setPosition(position);
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case University:
			skind = "Univ";
			break;
		case HighSchool:
			skind = "High";
			break;
		case Shepherd:
			skind = "Shepherd";
			break;	
		case Graduate:
			skind = "Graduate";
			break;
		default:			
		}
		return skind;
	}

	public void setMemberAttenddingChurch(Scanner input) {
		System.out.println("Attendding church: ");
		String attenddingchurch = input.next();
		this.setAttenddingchurch(attenddingchurch);
	}	

}


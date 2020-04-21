package member;

import java.util.Scanner;

public class Member {
	protected MemberKind kind;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	protected String campus;
	protected String position;
	protected String attenddingchurch; // protected는 상속받은 클래스까지도 접근을 가능케 해주는 접근제한자이다. (encapsulation). 자식한테는 상속이 가능한데이외
	// 외부 클래스 접근이 nono

	public Member() {
	}

	public Member(String name, int id, String campus, String position) {
		this.id = id;
		this.name = name;
		this.campus = campus;
		this.position = position;
	}

	public Member(int id, String name, String email, String phone, String campus, String position,
			String attenddingchurch) {
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

	public void setEmail(String email) {
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

	public void printInfo() {
		System.out.println("id:" + id + " name:" + name + " email:" + email + " phone:" + phone + " campus:" + campus
				+ " position:" + position + " attenddingchurch:" + attenddingchurch);
		System.out.println("The people of GOD!");
	}

	public void getUserInput(Scanner input) {
		System.out.print("Member ID: ");
		int id = input.nextInt(); // 객체의 필드에 입력이 됨
		this.setId(id);

		System.out.print("Member name: ");
		String name = input.next();
		this.setName(name);

		System.out.println("Email address: ");
		String email = input.next();
		this.setEmail(email);

		System.out.println("Phone number: ");
		String phone = input.next();
		this.setPhone(phone);

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


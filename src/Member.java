
public class Member {
	String name;
	int id;
	String email;
	String phone;
	String campus;
	String position;
	String attenddingchurch;

	public Member() {
	}

	public Member(String name, int id, String campus, String position) {
		this.id = id;
		this.name = name;
		this.campus = campus;
		this.position = position;
	}

	public Member(String name, int id, String email, String phone, String campus, String position,
			String attenddingchurch) {
		this.id = id; // this�� ��. �ʵ��� ������~ �ڿ��Ŵ� �Ķ���� ����
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.campus = campus;
		this.position = position;
		this.attenddingchurch = attenddingchurch;
	}

	public void printInfo() {
		System.out.println("id:" + id + " name:" + name + " email:" + email + " phone:" + phone + " campus:" + campus
				+ " position:" + position + " attenddingchurch:" + attenddingchurch);
		System.out.println("The people of GOD!");
	}

}

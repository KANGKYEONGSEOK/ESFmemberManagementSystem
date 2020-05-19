package member;

import java.util.Scanner;

import exception.EmailFormatException;
import member.MemberKind;

public class Graduate extends NonUniversityMember {

	protected String mateemail;
	protected String matephone;

	public Graduate(MemberKind kind) {
		super(kind);
	}

	public String getmateEmail() {
		return mateemail;
	}

	public void setmateEmail(String mateemail) throws EmailFormatException {
		if (!mateemail.contains("@") && !mateemail.equals("")) { // 이메일 형식에 @가 포함되어 있지 않으면 if선언.
			throw new EmailFormatException();
		}
		this.mateemail = mateemail;
	}

	public String getPhone() {
		return phone; 
	}

	public void setmatePhone(String matephone) {
		this.matephone = matephone;
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
	}  

	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: " + skind + " id:" + id + " name:" + name + " email:" + email + " phone:" + phone
				+ " mateemail:" + mateemail + " matephone:" + matephone + " campus:" + campus + " position:" + position
				+ " attenddingchurch:" + attenddingchurch);
		System.out.println("The people of GOD!");
	} // printInfo


	public void setMateEmail(Scanner input) {
		String mateemail = "";
		while(!mateemail.contains("@")) {
			System.out.println("Mate Email address: ");
			mateemail = input.next();
			try {
				this.setmateEmail(mateemail);
			} catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. Please put the e-mail adderess that contains @ ");
			}
		}
	}
	
	public void setMatePhone(Scanner input) {
		System.out.println("Mate Phone number: ");
		String matephone = input.next();
		this.setmatePhone(matephone);
	}

	public void setMateEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have a mate Email address? (Y/N)");
			answer = input.next().charAt(0); // 처음값을 가지고 옮.
			try {
				if (answer == 'y' || answer == 'Y') {
					setMateEmail(input);
					break;					
					//					System.out.println("Email address: ");
					//					String mateemail = input.next();
					//					this.setmateEmail(mateemail);
					//					break;

				} else if (answer == 'n' || answer == 'N') {
					this.setEmail("");
					break;
				} 
				else {
				}
			}
			catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. Please put the e-mail adderess that contains @ ");
			}
		} // while
	}

	public void setMatePhonewithYN(Scanner input) {
		char answer1 = 'x';
		while (answer1 != 'y' && answer1 != 'Y' && answer1 != 'n' && answer1 != 'N') {
			System.out.println("Do you have a mate Phone number? (Y/N)");
			answer1 = input.next().charAt(0); // 처음값을 가지고 옮.
			if (answer1 == 'y' || answer1 == 'Y') {
				setMatePhone(input);
				break;
			} else if (answer1 == 'n' || answer1 == 'N') {
				this.setmatePhone("");
				break;
			} else {
			}
		} // while
	}

} // class

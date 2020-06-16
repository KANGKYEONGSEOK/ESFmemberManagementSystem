package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		MemberManager membermanager = getObject("membermanager.ser"); // 가져옮.
		if(membermanager == null) {
			membermanager = new MemberManager(input);
		}
		else {
			membermanager.setScanner(input);
		}

		WindowFrame frame = new WindowFrame(membermanager); 
		
		selectMenu(input, membermanager);
		putObject(membermanager, "membermanager.ser");
	}

	public static void selectMenu(Scanner input, MemberManager membermanager ) {
		int num = 0;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					membermanager.addmember();
					logger.log("add a member");
					break;
				case 2:
					membermanager.deletemember();
					logger.log("delete a member");
					break;
				case 3:
					membermanager.editmember();
					logger.log("edit a member");
					break;
				case 4:
					membermanager.viewmembers();
					logger.log("view a list of member");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println(" Please put an integer between 1 ~ 5 ");
				if(input.hasNext()) {
					input.next();
				}
				num = 0;
			}

		}
	}

	public static void showMenu() {
		System.out.println("*** Esf Management System Menu ***");
		System.out.println(" 1. Add member");
		System.out.println(" 2. Delete member");
		System.out.println(" 3. Edit member");
		System.out.println(" 4. Veiw members"); 
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}

	public static MemberManager getObject(String filename) {
		MemberManager membermanager = null;


		try {
			FileInputStream file = new FileInputStream(filename); // 읽어드림.
			ObjectInputStream in = new ObjectInputStream(file);
			membermanager = (MemberManager) in.readObject(); // MemberManager로 형변환
			in.close();
			file.close();	
		} catch (FileNotFoundException e) {
			return membermanager;
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} 		
		return membermanager;
	}

	public static void putObject(MemberManager membermanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename); // 읽어드림.
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(membermanager);

			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 		
	}
}

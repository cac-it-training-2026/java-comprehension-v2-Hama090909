package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();

		Member m1 = Member.getInstance(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member m2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<>();
		members.add(m1);
		members.add(m2);

		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);

		try {
			System.out.println("input target id>>");
			int id = cr.inputNumber();

			System.out.println("input new password>>");
			String password = cr.inputString();

			MemberManager.updatePassword(members, id, password);

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			return;
		}

		System.out.println("---SHOW DATA---");
		System.out.println(members);
	}
}
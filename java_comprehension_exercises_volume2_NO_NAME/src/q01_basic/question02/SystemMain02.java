package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member m1 = new Member();

		m1.name = "Miura Manabu";
		m1.age = 24;
		m1.rank = 1;

		m1.showMember();

		m1.rankUp();
		System.out.println("newRank:" + m1.rank);

	}
}

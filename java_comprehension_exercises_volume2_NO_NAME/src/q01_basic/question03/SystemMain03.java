package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member nullMember = new Member();
		Member member = new Member();

		member.setName("Miura Manabu");
		member.setAge(28);
		member.setRank(2);

		nullMember.showMember();
		member.showMember();

	}

}

package q01_basic.question06;

public class Member extends AbstMember {
	int id;
	String password;
	String name;
	int age;
	int rank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPasword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public Member() {
	}

	@Override
	public void buyItem() {
		System.out.println();
	}

	@Override
	public void showMember() {
		System.out.println("---SHOW MEMBERS---");
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("Password:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}

}

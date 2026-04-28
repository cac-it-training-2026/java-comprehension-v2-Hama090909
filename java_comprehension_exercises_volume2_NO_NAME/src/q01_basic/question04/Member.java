package q01_basic.question04;

class Member {
	//TODO ここから実装する
	int id;
	String pasword;
	String name;
	int age;
	int rank;

	public Member() {
	}

	public Member(int id, String pasword, String name, int age, int rank) {
		this.id = id;
		this.pasword = pasword;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return pasword;
	}

	public void setPassword(String pas) {
		this.pasword = pas;
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

	void showMember() {
		System.out.println("---SHOW ALL MEMBERS---");
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("Password:" + pasword);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}

}

package hotel;

public class User {
	private String name;
	private int age;
	private char gen;
	public User(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGen() {
		return gen;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
	
}

package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class User{
	String name;
	int age;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +" : "+ age;
	}
	
}
public class HashSetEx {

	public static void main(String[] args) {
		Set<User> set = new HashSet<>();
		
		set.add(new User("park", 23));
		set.add(new User("kim", 13));
		set.add(new User("choi", 32));
		System.out.println(set);
		Iterator<User> iterator =set.iterator();
		while (iterator.hasNext()) {
			User user = (User) iterator.next();
			System.out.println(user);
		}
		System.out.println("====================================");
		
		for (User user : set) {
			System.out.println(user);
		}

	}

}

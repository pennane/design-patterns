package strategy.user;

import strategy.compare.IComparer;

public class User implements Comparable<User> {
	int age;
	String firstName;
	String lastName;
	IComparer<User> comparer;

	public User(UserBuilder b) {
		this.age = b.age;
		this.firstName = b.firstName;
		this.lastName = b.lastName;
		this.comparer = b.comparer;
	}

	@Override
	public int compareTo(User u) {
		return comparer.compare(this, u);
	}

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return age + " " + firstName + " " + lastName;
	}

}

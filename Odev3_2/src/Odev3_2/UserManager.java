package Odev3_2;

public class UserManager {
	public void add(User user) {
		System.out.println("Added user: " + user.getFirstName() + " " + user.getLastName());
	}

	public void delete(User user) {
		System.out.println("Deleted user: " + user.getFirstName() + " " + user.getLastName());
	}

	public void update(User user) {
		System.out.println("Updated user: " + user.getFirstName() + " " + user.getLastName());
	}
}

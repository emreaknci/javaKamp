package Odev3_2;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		super.add(user);
	}

	@Override
	public void delete(User user) {
		super.delete(user);
	}

	@Override
	public void update(User user) {
		super.delete(user);
	}

	public void RegisterCourse() {
		System.out.println("Registered is successful");
	}
}

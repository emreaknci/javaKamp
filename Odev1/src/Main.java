
public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
		Instructor instructor2 = new Instructor(2, "Emre", "Akýncý");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		instructorManager.getAll();
	}

}

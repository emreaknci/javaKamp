import java.util.List;
import java.util.ArrayList;

public class InstructorManager {
	private List<Instructor> instructors;

	public InstructorManager() {

		instructors = new ArrayList<Instructor>();
		;
	}

	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println("Egitmen " + instructor.name + " " + instructor.lastName + " eklendi.");
	}

	public void getAll() {
		for (Instructor instructor : instructors) {
			System.out.println("Egitmen: " + instructor.name + " " + instructor.lastName);
		}
	}

}

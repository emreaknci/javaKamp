import java.util.List;

public class CourseManager {
	List<Course> courses;
	public void add(Course course) {
		System.out.println("Kurs " + course.courseName + " eklendi");
	}

public void getAll() {
	for (Course course : courses) {
		System.out.println("Kurs Id: "+course.id);
		System.out.println("Egitmen Id: "+course.instructorId);
		System.out.println("Kurs Adý: "+course.courseName);
	}
}
}

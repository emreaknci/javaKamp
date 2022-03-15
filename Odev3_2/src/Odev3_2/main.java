package Odev3_2;

public class main {

	public static void main(String[] args) {
		Student student = new Student(1, "Yunus Emre", "Akinci", "emre1234", "12345678910");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.RegisterCourse();

		Instructor instructor = new Instructor(2, "Engin", "Demirog", "engin1234", "C#,Java,JS");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.createANewCourse("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		instructorManager.createANewCourse("Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)");
		instructorManager.createANewCourse("Yazýlým Geliþtirici Yetiþtirme Kampý (JavaScript)");
	}

}

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
		instructorManager.createANewCourse("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		instructorManager.createANewCourse("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)");
		instructorManager.createANewCourse("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JavaScript)");
	}

}

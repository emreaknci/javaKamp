package Odev3_2;

public class Instructor extends User {

	private String profession;

	public Instructor(int id, String firstName, String lastName, String password, String profession) {
		super(id, firstName, lastName, password);
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}

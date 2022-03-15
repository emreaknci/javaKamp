package Odev3_2;

public class Student extends User {

	private String creditCardNumber;

	public Student(int id, String firstName, String lastName, String password, String creditCardNumber) {
		super(id, firstName, lastName, password);
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

}

package eTradeDemo.google;

import java.util.List;

public class GoogleAuthManager {
	private List<String> verificatedEmails;

	public GoogleAuthManager(List<String> verificatedEmails) {
		this.verificatedEmails = verificatedEmails;
	}

	public void login(String email, String password) {
		if (verificatedEmails.contains(email)) {
			System.out.println("\nLogged in with Google -> " + email);
			return;
		}
		System.out.println("\nUser not found -> "+email);
	}

	public void register(String email, String password) {
		System.out.println("Registered with Google -> " + email);
	}

	public void sendToVerifyMail(String email) {
		System.out.println("\nA verification e-mail has been sent to " + email);
	}

	public boolean checkVerifyAccount(String email) {
		if (verificatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

	public void verifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email + " verified");
	}
}

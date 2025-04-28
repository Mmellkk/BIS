package login_pkg;

public class LoginValidation {
	public static boolean validate(String username, String password) {
		return username.equals("admin") && password.equals("1234");
	}
}

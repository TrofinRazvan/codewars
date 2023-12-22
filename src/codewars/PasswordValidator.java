package codewars;

import java.util.regex.Pattern;

public class PasswordValidator {

    public static void main(String[] args) {
        String password = "ThatIsAPassword@12";
        boolean isValid = validatePassword(password);

        if (isValid) {
            System.out.println("The password is valid");
        } else {
            System.out.println("The password does not meet the validation criteria.");
        }
    }

    public static boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        if (!Pattern.compile("[a-z]").matcher(password).find() || !Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }

        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            return false;
        }

        if (!Pattern.compile("[!@#$%^&*]").matcher(password).find()) {
            return false;
        }

        return true;
    }
}
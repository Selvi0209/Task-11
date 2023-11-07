public class LoginSystem {
    private static final String EXPECTED_PASSWORD = "securepassword";

    public void login(String enteredPassword) throws LoginException {
        if (!EXPECTED_PASSWORD.equals(enteredPassword)) {
            throw new LoginException("Incorrect password. Please try again.");
        }

        // Successful login logic
    }
}

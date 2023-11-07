public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();

        try {
            loginSystem.login("incorrectpassword");
        } catch (LoginException e) {
            System.out.println("Login Error: " + e.getMessage());
        }
    }
}

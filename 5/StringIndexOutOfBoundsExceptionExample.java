public class StringIndexOutOfBoundsExceptionExample {
	
    public static void main(String[] args) {
        String text = "Hello, World";

        try {
            int index = 15; // Invalid index, as the string has a length of 12
            char character = text.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out of Bounds Exception: " + e.getMessage());
        }
    }
	
}

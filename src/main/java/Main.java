public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Rectangle rectangle = userInput.getInput();
        System.out.println(rectangle.area());
    }
}

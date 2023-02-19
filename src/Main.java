import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        println("Please input your name: ");

        try (Scanner input = new Scanner(System.in)) {
            String name = input.next();
            String greetingStr = String.format("Hello, %s!", name);
            println(greetingStr);
        }
    }
}

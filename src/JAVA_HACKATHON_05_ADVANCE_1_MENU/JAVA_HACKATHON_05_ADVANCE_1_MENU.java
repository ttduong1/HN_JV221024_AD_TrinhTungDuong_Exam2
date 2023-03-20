package JAVA_HACKATHON_05_ADVANCE_1_MENU;

import java.util.Scanner;
import java.util.Stack;

public class JAVA_HACKATHON_05_ADVANCE_1_MENU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> history = new Stack<>();
        int choice = 0;

        while (choice != 3) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Enter the URL you want to access: ");
            System.out.println("2. Come back");
            System.out.println("3. Exit");

            System.out.print("Inviting you to choose: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the URL you want to access: ");
                    scanner.nextLine(); // clear the input buffer
                    String url = scanner.nextLine();
                    history.push(url);
                    break;
                case 2:
                    if (history.isEmpty()) {
                        System.out.println("Blank history! ");
                    } else {
                        history.pop();
                        if (history.isEmpty()) {
                            System.out.println("Blank history! ");
                        } else {
                            System.out.println("Next URL: " + history.peek());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using our browser! ");
                    break;
                default:
                    System.out.println("Warning! Invalid selection! ");
                    break;
            }
        }
    }
}
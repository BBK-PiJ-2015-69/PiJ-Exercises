
import java.util.Scanner;

public class Ex2 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n Please enter your first number:");
        String input1 = in.nextLine();
        double operand1 = Double.parseDouble(input1);
        System.out.println("\n Please enter your second number: ");
        String input2 = in.nextLine();
        double operand2 = Double.parseDouble(input2);
        System.out.println("\n You chose "+operand1+" and "+operand2+" \n \n -- MENU -- \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division \n * Please chose a menu option *");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println(operand1 + operand2);
                break;
            case 2:
                System.out.println(operand1 - operand2);
                break;
            case 3:
                System.out.println(operand1 * operand2);
                break;
            case 4:
                System.out.println(operand1 / operand2);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        while (age < 0 || age > 100) {
            System.out.print("Please enter your age: ");
            age = input.nextInt();
        }
        int age1;
        do {
            System.out.print("Please enter your age1: ");
            age1 = input.nextInt();
        } while (age1 < 0 || age1 > 100);
        System.out.println("Your age is: " + age);
    }
}

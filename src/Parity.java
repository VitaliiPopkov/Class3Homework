import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        int nun;
        String even;
        System.out.println("Input number: ");
        Scanner scNum = new Scanner(System.in);
        int num = scNum.nextInt();
        if ( num % 2 == 0) {
            System.out.println("Number " + num + ". It is even number.");
        }else {
            System.out.println("Number " + num + ". It isn't even number.");
        }

        even = ((num % 2) == 0 ? "is even number" : "It is not even number");
        System.out.println(even);

        if ((num & 1) == 0) {
            System.out.println("Number " + num + ". It is even number.");
        } else {
            System.out.println("Number " + num + ". It isn't even number.");
        }

    }
}

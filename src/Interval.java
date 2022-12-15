import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Checking the number in the digital interval. Input a number from 0 to 100: ");

        int a = 0, b = 14; //first interval
        int c = 15, d = 35; //second interval
        int e = 36, f = 50; //third interval
        int g = 51, h = 100; //fourth interval
        Scanner scNum = new Scanner(System.in);
        int num = scNum.nextInt();
        if (num >= a && num <= b) {
            System.out.println("You entered a number " + num + ". This number is in the range from " + a + " to " + b + ".");
        } else if (num >= c && num <= d) {
            System.out.println("You entered a number " + num + ". This number is in the range from " + c + " to " + d + ".");
        } else if (num >= e && num <= f) {
            System.out.println("You entered a number " + num + ". This number is in the range from " + e + " to " + f + ".");
        } else if (num >= g && num <= h) {
            System.out.println("You entered a number " + num + ". This number is in the range from " + g + " to " + h + ".");
        } else {
            System.out.println("Incorrect input. Input a number from 0 to 100: ");
        }

    }
}

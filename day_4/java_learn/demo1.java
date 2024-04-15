package java_learn;

/**
 * demo1
 */
import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {
        System.out.println("tasks 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String a = sc.nextLine();
        System.out.println("enter your age");
        int b = sc.nextInt();
        System.out.println("Name : " + a + "\nage :" + b);
        sc.close();
    }
}
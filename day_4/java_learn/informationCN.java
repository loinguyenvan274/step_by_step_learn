package java_learn;
import java.util.Scanner;
public class informationCN {
    public static void main(String[] args) {
        System.out.println("Enter rectangle Information");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter edge length a :");
        int a = sc.nextInt();
        System.out.print("enter edge length b :");
        int b = sc.nextInt();
        System.out.println("rectangle acreage : " + a*b);
        System.out.println("rectangle perimeter : " + (a+b)*2);
        System.out.println("Min edge length is : " + Math.min(a,b));
        sc.close();

    }
}

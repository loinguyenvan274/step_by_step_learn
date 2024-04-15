package java_learn;
import javax.swing.JOptionPane;
import java.util.Random;
public class gui {
    public static void main(String[] args){
        print("anh","yeu",1);
    }
    static void print(String a, String b, String c){
        System.out.println("method 2");
        System.out.println(a+" "+b+" "+c);
    }
    static void print(String a, String b,int c){
        System.out.println("method 1");
        System.out.println(a+" "+b);
    }
}

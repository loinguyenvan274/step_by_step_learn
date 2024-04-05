/**
 * demo
 */
import java.util.Scanner;
public class die88mo {
    public static int pow(int a, int i){
        int result = 1;
        for(int j = 1 ; j <= i; j++){
            result *= a;
        }
        return result;
    }
    public static void init(int a[]){
        for(int i = 0; i < a.length ; i++){
            a[i] = 0;
        }
    }
    public static void printAr(int a[]){
        for(int i = 0; i< a.length ; i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void print(int a[] ){
       int i = pow(2,a.length);
       int count = 0;
       while(i!=0){ 
        System.out.print(++count +" : ");
        printAr(a);
            int j = a.length-1;
            for(; j>= 1; j--){
                if(a[j] == 0)
                    break;
                else
                    a[j] = 0;
            }
                a[j] = 1;
        i--;
       }
    }
    public static void main(String[] args) {
        try( Scanner cin = new Scanner(System.in)){;
            int n = cin.nextInt(); 
            int[] b = new int[n];
            init(b);
            print(b);
        }catch(ArithmeticException e){
            System.out.println("ENTER VALUE ISN'T SUCCCESS");
        }
    }
}

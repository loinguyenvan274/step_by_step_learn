package java_learn;
import java.util.Scanner;
public class narowingWindeningCatsing {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String papergrap = "The ";
        String tempWord = "";
        for(int i = 0; i<=papergrap.length(); i++){
           char c = papergrap.charAt(i);
           tempWord += (c == ' ' || c == '\0' ) ? "" :  c;
           if(c == ' ' || c == '\0' ){
                boolean check = true;
                while(check){
                    System.out.print(tempWord +" -> ");
                    String comparing = sc.nextLine();
                    System.out.println();
                    if(tempWord.equals(comparing))
                    check = false;
                }
                tempWord = "";
           } 
        }
        sc.close();
    }
}

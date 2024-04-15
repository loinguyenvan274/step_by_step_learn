package hello;
import hello1.*;
import java.util.Scanner;
public class hello {
    public void Stack(){
    Scanner cs = new Scanner(System.in);
    System.out.println("init max size for stack");
    int x  = cs.nextInt();
    nello Stack = new nello(x);
    
    boolean check = true;
    System.out.println("#1 push for Stack\n#2 pop for Stack\n#3 Print on Stack Struct\n#4 Exit");
    while(check){
        int i = cs.nextInt();
        System.out.println((cs.nextLine()!= ""));
        switch(i){
            case 1:
                System.out.println("Enter String");
                
                Stack.push(cs.nextLine());
                break;
            case 2: 
                Stack.pop();
                break;
            case 3:
                Stack.printStack();
                break;
            case 4:
                check = false;
                break;
            default:
                System.out.println("Enter again!");  
        }        

    }
    cs.close();
   }
    public void main(String args[]) {
        hello st = new hello();
        st.Stack();;
    }
} 




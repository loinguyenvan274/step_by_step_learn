package hello1;
import java.util.ArrayList;
public class nello {
    ArrayList<String> Name = new ArrayList<>();
    int Max,top;
    public nello(int Maxtop){
        Max = Maxtop;
        top = -1;
    }
    boolean checkEmpty(){
        if(top ==  -1){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }
    boolean checkFull(){
        if(top == Max - 1){
            System.out.println("stack is Full");
            return true;
        }
        return false;
    }
    public void push(String input){
        if(!checkFull()){
            top++;
            Name.add(input);
        }
    }
    public void pop(){
        if(!checkEmpty()){
            Name.remove(top);
            top--;
        }
    }
    public void printStack(){
        for(int i = 0 ; i<= top; i++){
            System.out.print(Name.get(i)+" ");
        }
        System.out.println();
    }
}
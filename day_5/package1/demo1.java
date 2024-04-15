package package1;
// package DAY_5;
import java.util.*;
public class demo1{
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> A2 = new ArrayList<>();
        ArrayList<String> Monday = new ArrayList<>();
        ArrayList<String> Sunday  = new ArrayList<>();
        ArrayList<String> Tuesday = new ArrayList<>();
        ArrayList<String> Wednesday = new ArrayList<>();
        ArrayList<String> Thursday = new ArrayList<>();
        ArrayList<String> Friday  = new ArrayList<>();
        ArrayList<String> Saturday = new ArrayList<>();
        int maxDay;
        int dayStart  = 0;
        for(int t = 1 ; t<= 12 ; t++){
            A2.add(Sunday);
            A2.add(Monday);
            A2.add(Tuesday);
            A2.add(Wednesday);
            A2.add(Thursday);
            A2.add(Friday);
            A2.add(Saturday);
            if(t == 4 || t == 6 || t== 9 || t == 11 )
                maxDay = 30;
            else if( t == 2)
                maxDay = 29;
            else
                maxDay = 31;
            A2.get(0).add("Sunday");
            A2.get(1).add("Monday");
            A2.get(2).add("Tuesday");
            A2.get(3).add("wednesday");
            A2.get(4).add("Thursday");
            A2.get(5).add("Friday");
            A2.get(6).add("Saturday");
            Integer i;
            for(i = dayStart*-1; i <=maxDay; i++){
                if(i>=1)
                    A2.get((i+dayStart)%7).add(i.toString());
                else
                    A2.get((i+dayStart)%7).add(" ");
            }
            dayStart = (i+dayStart-1)%7;
            System.out.println("Month " + t+ " :\n" +A2);
            A2.clear();
            Monday.clear();
            Sunday.clear();
            Tuesday.clear();
            Wednesday.clear();
            Thursday.clear();
            Friday.clear();
            Saturday.clear();
        }
          
    }
}
// int startDay = 1;
//         for(Integer i = 1 - startDay;i<=30; i++){
//             if(i>= 1)
//                  A2.get((i+startDay-1)%7).add(i.toString());
//             else
//                 A2.get((i+startDay-1)%7).add(" ");
//         }
//         System.out.println(A2);
//         int count = 0;
//         for(int i = 1-startDay ;i<=30 ;i++){

            
//             System.out.print(A2.get((i+startDay-1)%7).get(count) + "  ");
//             if(i+startDay < 10)
//             System.out.print(" ");
//             if((i + startDay )% 7 == 0 ){
//                 count++;
//                 System.err.println();
//             }
                
//         }
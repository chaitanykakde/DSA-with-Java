import java.util.*;
 
public class ArrayListDemo{
    public static void main(String[ ] args) {
        Scanner in=new Scanner(System.in);
        //syntax
       ArrayList<Integer> list=new ArrayList<>(10);
       
       list.add(45); list.add(45); list.add(45); list.add(45);
       list.add(45); list.add(45); list.add(45); list.add(45);
       list.add(45); list.add(45); list.add(45); list.add(45);
       list.add(45); list.add(45); list.add(45); list.add(45);


       System.out.println(list);
       System.out.println(list.contains(45));
       list.set(0, 99);
       list.remove(8);

       for (int i = 0; i < 5; i++) {
        list.add(in.nextInt());
           
       }
       for (int i = 0; i <5; i++) {
        System.out.println(list.get(i));
           
       }
    }
}

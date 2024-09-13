package listoperation1;
import java.util.*;
public class ListOperation1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        arrayList.add(04);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        linkedList.add(50);
        linkedList.add(60);
        linkedList.add(70);
        linkedList.add(80);
        arrayList.set(1, 22); 
        linkedList.set(2, 10); 
        arrayList.remove(3); 
        linkedList.remove(1); 
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Contents of arrayList:");
        for (Integer num : arrayList)
        {
            System.out.println(num);
        }
        System.out.println("Contents of linkedList:");
        for (Integer num : linkedList) 
        {
            System.out.println(num);
        }
    }
}
package ch_CollectionFrameWork.iterable_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        Iterator<Integer> it = arr.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

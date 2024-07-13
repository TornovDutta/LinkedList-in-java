import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(23);
        System.out.println(list);
        LinkedList<Integer> list2=new LinkedList<>();
        list2.add(12);
        list2.add(23);
        System.out.println(list2);
        list.remove(0);
        list2.remove(0);
        System.out.println(list+"\n"+list2);

//        for (Week day:Week.values()){
//            System.out.print(day+" ");
//
//        }
        Vector<Integer> arr=new Vector<>();

        System.out.println(Arrays.toString(new int[]{12,34}));
    }
}

package CollectionFreamWork;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(1,56);
        list.remove(1);
        System.out.println(list.getFirst());;
        System.out.println(list);
    }
}

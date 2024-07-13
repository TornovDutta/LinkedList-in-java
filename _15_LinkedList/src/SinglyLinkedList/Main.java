package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL list =new LL();
        list.insertFirst(12);
        list.insert(1,23);
        System.out.println(list.find(12));
        list.insertLast(34);
        list.Display();
        System.out.println(list.get(1));
        list.size();

        list.deleteFirst();
        list.deleteLast();
        list.delete(0);
        list.Display();
    }
}

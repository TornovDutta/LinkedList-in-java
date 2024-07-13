package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(12);
        list.insertFirst(23);
        list.insertFirst(34);
//        list.Display();
        list.insertLast(67);
        list.insertLast(90);
//        list.Display();

        list.Insert(1,108);
        list.Display();
    }
}

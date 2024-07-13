public class MainLL {
    public static void main(String[] args) {
        LL list=new LL();
        list.insetFirst(12);
        list.insetFirst(23);
        list.insetFirst(34);
        list.insert(1,78);
        list.Display();
        System.out.println(list.removefirst());
        list.Display();
    }
}

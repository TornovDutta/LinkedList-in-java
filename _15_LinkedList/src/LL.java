public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int data) {
            this.value = data;
        }

        public Node(int data, Node next) {
            this.value = data;
            this.next = next;
        }
    }

//    inset value in first of linkedlist
    public void insetFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }


    //Display the LinkedList
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    //Add at lat of Linked list
    public void insertLast(int val){
        if(tail==null){
            insetFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;

    }

    //Add value in index
    public void insert(int idx,int val){
        if(idx==0){
            insetFirst(val);
            return;
        }
        if (idx==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i <idx ; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;

    }

    //get Node
    public Node getNode(int idx){
        Node node=head;
        for (int i = 0; i < idx; i++) {
            node=node.next;
        }
        return node;
    }

    //get value
    public int get(int idx){
        Node node=head;
        for (int i = 0; i < idx; i++) {
            node=node.next;
        }
        return node.value;
    }

    //Deletion First node
    public int removefirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;

        return val;
    }

    //Deletion Last node
    public int removeLast(){
        if(size<=1){
            removefirst();
        }
        Node secondLast=getNode(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    //deletion by index number
    public int remove(int idx){
        if(idx==0){
            removefirst();
        }
        if(idx==size-1){
            removeLast();
        }

        Node pre=getNode(idx-1);
        int val=pre.next.value;
        pre.next=pre.next.next;
        size--;

        return val;
    }

    //find
    public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            node=node.next;
        }


        return null;
    }


}

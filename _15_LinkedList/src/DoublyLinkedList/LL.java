package DoublyLinkedList;

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
        private Node pre;


        private  Node(int value) {
            this.value = value;
            this.next = null;
            this.pre = null;
        }

        private Node(int value, Node next,Node pre) {
            this.value = value;
            this.next = next;
            this.pre=pre;
        }
    }


    //insert first Node
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.pre=null;
        if(head!=null){
            head.pre=node;
        }
        head=node;
        size++;

    }

    //Display Node
    public void Display(){
        Node temp=head;
        Node last=null;

        while(temp!=null){
            last=temp;
            System.out.print(temp.value+"  -> ");
            temp=temp.next;
        }
        System.out.println("End");
        System.out.println("print Linked list in Reverse ");
        while(last!=null){
            System.out.print(last.value+" <- ");
            last=last.pre;
        }
        System.out.println("Start");
    }

    //insert last Node
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        if (head == null) {
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.pre = last;
        size++;
    }

    //Get Node
    private Node GetNode(int idx){
        Node temp=head;
        for (int i = 0; i < idx; i++) {
            temp=temp.next;
        }

        return temp;
    }


    //Insert in index
    public void Insert(int idx,int val){
        if(idx==0){
            insertFirst(val);
        }

        if(idx==size){
            insertLast(val);
        }

        Node temp = GetNode(idx - 1);
        Node node = new Node(val, temp.next, temp);
        temp.next.pre = node;
        temp.next = node;
        size++;
    }
}

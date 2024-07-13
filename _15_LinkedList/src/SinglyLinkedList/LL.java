package SinglyLinkedList;

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

        private Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    //Insert Node


    //inset first

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        size+=1;
        if(tail==null){
            tail=head;
        }
    }

    //insert last
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }

    //insert in idx
    public void insert(int idx,int val){
        if (idx==0){
            insertFirst(val);
            return;
        }
        if(idx==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 0; i < idx; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size+=1;
    }


    //display
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    //Find
    public boolean find(int val){
        if(head.value==val){
            return true;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.value==val){
                return true;
            }
            temp=temp.next;
        }

        return false;
    }

    //Get
    public int get(int idx){
        Node temp=head;
        for (int i = 0; i < idx; i++) {
            temp=temp.next;
        }

        return temp.value;
    }

    //getNode
    public Node getNode(int idx){
        Node temp=head;
        for (int i = 0; i < idx; i++) {
            temp=temp.next;
        }

        return temp;
    }

    //Delete


    //Delete first
    public void deleteFirst(){
        head=head.next;
        size--;
    }

    //Delete last
    public void deleteLast(){
        Node SecondLast=getNode(size-2);
        tail=SecondLast;
        SecondLast.next=null;
        size--;
    }

    //delete idx value
    public void delete(int idx){
        if(idx==0){
            deleteFirst();
            return;
        }
        if(idx==size-1){
            deleteLast();
            return;
        }
        Node pre=getNode(idx-1);
        pre.next=pre.next.next;
        size--;
    }
    public int size(){
        return size;
    }

}

package CircularLinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.head = null;
        this.tail = null;
    }

    private class Node{
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    //insert value
    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;

            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    //Display Linked List
    public void Display(){
        Node node=head;
        if(head!=null){
            do{
                System.out.print(node.value+" -> ");
                node=node.next;
            }while (node!=head);
            System.out.println("End");
        }
    }

}

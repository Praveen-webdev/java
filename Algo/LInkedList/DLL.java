package Algo.LInkedList;

public class DLL {
    Node head;
    Node tail;
    int size;

    private void create(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        size = 1;
    }
    public void insertAt(int value,int location){
        if(head==null){
            create(value);
            return;
        }
        Node node=new Node(value);
        if(location==0){
            node.next=head;
            head.prev=node;
            head=node;
        }else if(location>=size){
            node.prev=tail;
            tail.next=node;
            tail=node;
        }else{
            Node current=head;
            for(int i=0;i<location-1;i++){
                current=current.next;
            }
            Node nextNode=current.next;
            current.next=node;
            node.prev=current;
            nextNode.prev=node;
            node.next=nextNode;
        }
        size++;
    }

    public void print() {
        Node traverse=head;
        for(int i=0;i<size;i++){
            System.out.print(traverse.value+" ");
            traverse=traverse.next;
        }
        System.out.println();
    }
}

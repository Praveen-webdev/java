package Algo.Queue;

public class LQueue {
    Node head;
    Node tail;

    public void enQueue(int data){
        Node node=new Node(data);
        if (head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }
    public void deQueue(){
        if(head==null){
            System.out.println("Queue is empty!");
            return ;
        }
        System.out.println(head.value+" has been removed...");
        head=head.next;
    }
    public int peek(){
        if(head==null){
            return -1;
        }
        return head.value;
    }
    public void delete(){
        head=tail=null;
    }
}

package Algo.LInkedList;

public class LinkedList {
    Node head;
    Node tail;
    public int size; 
    public void create(int value){
        head=new Node(); //* Resetting purpose
        Node node=new Node();
        node.value=value;
        node.next=null;
        head=node;
        tail=node;
        size=1;
    }
    public void insertAtBegin(int value){
        if(head==null){
            create(value);
            return;
        }
            Node node=new Node();
            node.value=value;
            node.next=head;
            head=node;
            size++;
    }
     public void insertAtEnd(int value){
         if(head==null){
             create(value);
         }
         Node node=new Node();
         node.value=value;          
         node.next=null;        
         tail.next=node;
         tail=node;
     }
     public void insert(int value,int location){
         Node node=new Node();
         node.value=value;
         if(head==null){
             create(value);
             return;
         }else if(location ==0){
             node.next=head;
             head=node;
             size++;
         }else if(location >=size){
            node.next=null;
            tail.next=node;
            tail=node;
            size++;
         }else {
             Node current =head;
             int index=1;
             while(index<=location-1){
                 current=current.next;
                 index++;
             }
             Node nextNode=current.next;
             nextNode.next=node;
             node.next=nextNode;
             size++;
         }
     }
     public void print(){
        Node node=head;
        while(node!=null){
            System.out.print(node.value);
            node=node.next;
        }
     }
}

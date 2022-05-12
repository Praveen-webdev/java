package Algo.Stack;

public class LStack {
    Node head;
    public void push(int data){
        if(head==null){
            Node node=new Node(data);
            head= node;
        }else{
            Node node=new Node(data);
            node.next=head;
            head=node;
        }
    }
    private boolean isEmpty(){
        if(head==null){
            System.out.println("List is empty!");
            return true;
        }
        return false;
    }
    public void pop(){
        if(!isEmpty()){
            System.out.println(head.value+" has been removed...");
            head=head.next;
        }
    }
    public int peek(){
        if(!isEmpty()){
            return head.value;
        }
        return -1;
    }
    public void delete(){
        head=null;
        System.out.println("Stack is deleted...");
    }
    public void print(){
        int index=0;
        Node traverse=head;
        while(traverse!=null){
            System.out.println(index+"=>"+traverse.value);
            traverse=traverse.next;
            index++;
        }
    }
}

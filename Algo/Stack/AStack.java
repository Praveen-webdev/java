package Algo.Stack;

public class AStack {
    private int[] arr;
    private int topOfStack;

    public AStack(int size) {
        arr = new int[size];
        topOfStack=0;
    }
    public int size(){
        return topOfStack;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full!");
            return ;
        }
        arr[topOfStack]=data;
        topOfStack++;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        topOfStack--;
        int data=arr[topOfStack];
        arr[topOfStack]=0;
        System.out.println(data +" is removed...");
    }
    public boolean isEmpty(){
        return topOfStack<=0;
    }
    public boolean isFull(){
        return topOfStack>=arr.length;
    }
    public void print(){
        for(int i=0;i<topOfStack;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

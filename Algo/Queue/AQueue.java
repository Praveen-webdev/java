package Algo.Queue;

public class AQueue {
    int arr[]; // ArrayList implementation
    int rear;

    public AQueue(int size){
        arr=new int[size];
        rear=0;
    }
    public void enQueue(int value){
        if(rear==arr.length){
            System.out.println("Queue is full!");
            return ;
        }
        arr[rear]=value;
        rear++;
    }
    public void deQueue(){
        if(rear<=1){
            arr[0]=0;
            rear=0;
            return ;
        }
        for(int i=0;i<rear-1;i++){
            arr[i]=arr[i+1];
        }
        rear--;
    }
    public int peek(){
        return arr[0];
    }
    public void delete(){
        arr=null;
    }
}

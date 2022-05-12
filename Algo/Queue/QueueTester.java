package Algo.Queue;

public class QueueTester {
    public static void main(String[] args) {
        AQueue ds = new AQueue(6);
        ds.enQueue(1);
        ds.enQueue(2);
        ds.enQueue(3);
        ds.enQueue(4);
        ds.enQueue(4);
        ds.enQueue(5);
        ds.enQueue(4);
        ds.enQueue(6);
        System.out.println(ds.peek());
    }
}

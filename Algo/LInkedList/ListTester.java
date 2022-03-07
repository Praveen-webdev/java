package Algo.LInkedList;

public class ListTester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(3);
        list.insertAtBegin(2);
        list.insertAtBegin(1);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        System.out.println(list.size);
        list.print();
    }
}

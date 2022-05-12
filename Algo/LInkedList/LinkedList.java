package Algo.LInkedList;

public class LinkedList {
    Node head;
    Node tail;
    public int size;

    private void create(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        size = 1;
    }

    public void insertAtBegin(int value) {
        if (head == null) {
            create(value);
            return;
        }
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public void insertAtEnd(int value) {
        if (head == null) {
            create(value);
            return;
        }
        Node node = new Node(value);
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int location) {
        Node node = new Node(value);
        if (head == null) {
            create(value);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            size++;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        } else {
            Node current = head;
            int index = 1;
            while (index <= location - 1) {
                current = current.next;
                index++;
            }
            Node nextNode = current.next;
            current.next = node;
            node.next = nextNode;
            size++;
        }
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value);
            node = node.next;
        }
        System.out.println();
    }

    public void search(int value) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == value) {
                System.out.println("Found at " + i);
                break;
            }
            temp = temp.next;
        }

    }

    public void delete() {
        if (head == null) {
            System.out.println("list not found!");
            return;
        }
        head = null;
        tail = null;
        size = 0;
        System.out.println("List successfully deleted...");
    }

    public void deleteAt(int location) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else {

            if (location == 0) {
                head = head.next;
            } else if (location >= size - 1) {
                Node beforeLast = head;
                for (int i = 0; i < size - 2; i++) {
                    beforeLast = beforeLast.next;
                }
                beforeLast.next = null;
                tail = beforeLast;
            } else {
                Node current = head;
                int index = 0;
                while (index < location - 1) {
                    current = current.next;
                    index++;
                }
                current.next = current.next.next;
            }

        }
        size--;
    }
}

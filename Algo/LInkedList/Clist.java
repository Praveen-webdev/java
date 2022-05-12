package Algo.LInkedList;

public class Clist {
    Node head;
    Node tail;
    int size;

    private void create(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        size = 1;
    }

    public void insertAt(int value, int position) {
        if (head == null) {
            create(value);
            return;
        }
        Node node = new Node(value);
        node.value = value;
        if (position == 0) {
            node.next = head;
            head = node;
            tail.next = node;
        } else if (position >= size) {
            tail.next = node;
            node.next = head;
            tail = node;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            Node nextNode = current.next;
            current.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void modifyAt(int value, int position) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (position >= size) {
            System.out.println("Position not found!");
            return;
        }
        if (position == size - 1) {
            tail.value = value;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        temp.value = value;

    }

    public void search(int nodeValue) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == nodeValue) {
                System.out.println("Value found at " + i);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Node value not found!");
    }

    public void deleteAt(int location) {
        if (head == null) {
            System.out.println("list is empty!");
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        if (location == 0) {
            head = head.next;
            tail.next = head;
        } else if (location >= size - 1) {
            Node temp = head;
            for (int i = 0; i < size - 1; i++) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        } else {
            Node temp = head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    public void print() {
        if (head == null) {
            System.out.println("list is empty!");
            return;
        }
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void print(int times) {
        if (head == null) {
            System.out.println("list is empty!");
            return;
        }
        Node temp = head;
        for (int i = 0; i < size * times; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}

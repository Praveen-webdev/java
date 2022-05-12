package Algo.LInkedList;

import java.util.HashSet;

public class ListTester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(4);
        list.insertAtEnd(3);
        list.insertAtEnd(2);
        list.insertAtEnd(1);
        list.insertAtEnd(0);
        list.print();
        System.out.println("List size => " + list.size);
        Node result = rotate(list.head, 3);
        print(result);
        // list.head=result;
        // list.print();

    }

    public static Node rotate(Node head, int k) {
        int size = 1;
        Node create = new Node(head.value);
        Node outHead = create;
        Node outTail=create;
        Node traverse = head.next;
        while (traverse != null) {
            size++;
            if (size <= k) {
                Node end = new Node(traverse.value);
                outTail.next=end;
                outTail=end;
            } else {
                if (size == k + 1) {
                    Node prepend = new Node(traverse.value);
                    prepend.next = outHead;
                    outHead = prepend;
                }else{
                    Node temp=outHead;
                    Node node =new Node(traverse.value);
                    for(int i=0;i<size-k-2;i++){
                        temp=temp.next;
                    }
                    node.next=temp.next;
                    temp.next=node;
                }
            }
            traverse = traverse.next;
        }
        return outHead;
    }

    public static boolean detectLoop(Node head) {
        HashSet<Node> hs = new HashSet<>();
        while (head != null) {
            if (hs.contains(head)) {
                return true;
            }
            hs.add(head);
            head = head.next;
        }
        return false;
    }

    static void findMiddle(Node head) {
        Node p1 = head;
        Node p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        System.out.println(p1.value);
    }

    static void fromLast(Node head, int n) {
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < n; i++) {
            if (p2 == null) {
                System.out.println("Exceeds limit");
                return;
            }
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        System.out.println(p1.value);
    }

    static Node reverseList(Node head) {
        Node traverse = head.next;
        Node node = new Node(head.value);
        Node out = node;
        while (traverse != null) {
            Node prepend = new Node(traverse.value);
            prepend.next = out;
            out = prepend;
            traverse = traverse.next;
        }
        return out;
    }

    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.value);
            node = node.next;
        }
        System.out.println();
    }

}

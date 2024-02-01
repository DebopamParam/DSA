package CustomLL;

public class DLL {
    private int size = 0;
    private Node head;

    void insertFirst(int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            head = new Node(val, head, null);
        }
        size++;
    }

    void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(val, null, temp);
        size++;
    }

    void reverse() {
        Node curr = head;
        Node temp = new Node(-999);
        while (curr != null) {
            if (curr.next == null) {
                head = curr;
            }
            // Saving the next node in temp.next
            // temp.prev is used for swapping box
            temp.next = curr.next;
            // swap prev and next
            temp.prev = curr.next;
            curr.next = curr.prev;
            curr.prev = temp.prev;
            // Move temp one Node ahead
            curr = temp.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

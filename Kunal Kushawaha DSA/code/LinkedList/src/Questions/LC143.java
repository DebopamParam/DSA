package Questions;

public class LC143 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i <= 7; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        print(head);
        reorderList(head);
        print(head);
    }

    static void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        // 3 steps: find middle, reverse second half, and merge first and second lists

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // reverse second half

        ListNode prev = null, current = slow, temp;

        while (current != null) {
            temp = current.next;
            current.next = prev;

            prev = current;
            current = temp;
        }

        // Merge two lists

        ListNode first = head, second = prev;

        while (second.next != null) {
            temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
    }

    static void print(ListNode temp) {
        while (temp != null) {
            System.out.print(temp.val + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

public class Add {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        int carry = 0;
        ListNode current = dummy;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        ListNode l1 = null, tail1 = null;
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);
            if (l1 == null) {
                l1 = tail1 = node;
            } else {
                tail1.next = node;
                tail1 = node;
            }
        }

        int n2 = sc.nextInt();
        ListNode l2 = null, tail2 = null;
        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);
            if (l2 == null) {
                l2 = tail2 = node;
            } else {
                tail2.next = node;
                tail2 = node;
            }
        }

        ListNode result = addTwoNumbers(l1, l2);
        printList(result);

        sc.close();
    }
}
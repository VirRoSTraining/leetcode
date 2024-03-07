package solved;

import special.ListNode;

public class Main876 {

    public static void main(String[] args) {

        ListNode t6 = new ListNode(6);
        ListNode t5 = new ListNode(5, t6);
        ListNode t4 = new ListNode(4, t5);
        ListNode t3 = new ListNode(3, t4);
        ListNode t2 = new ListNode(2, t3);
        ListNode t1 = new ListNode(1, t2);

        System.out.println(middleNode(t1).val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head.next, slow = head;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast == null) return slow;
            fast = fast.next;
        }
        return slow;
    }
}

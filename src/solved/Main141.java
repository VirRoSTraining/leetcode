package solved;

import special.ListNode;

public class Main141 {

    public static void main(String[] args) {

        ListNode t4 = new ListNode(-4);
        ListNode t3 = new ListNode(0, t4);
        ListNode t2 = new ListNode(2, t3);
        ListNode t1 = new ListNode(3, t2);
        t4.next = t2;

        System.out.println(hasCycle(t1));
    }

    public static boolean hasCycle(ListNode head) {

        ListNode fast = head, slow = head;

        while (fast != null) {
            fast = fast.next;
            if (fast == null) break;
            if (fast == slow) return true;
            fast = fast.next;
            slow = slow.next;
        }

        return false;
    }
}

package solved;

import special.ListNode;

public class Main2 {

    public static void main(String[] args) {
        ListNode t13 = new ListNode(3);
        ListNode t12 = new ListNode(4, t13);
        ListNode t11 = new ListNode(2, t12);

        ListNode t23 = new ListNode(4);
        ListNode t22 = new ListNode(6, t23);
        ListNode t21 = new ListNode(5, t22);

        System.out.println(addTwoNumbers(t11, t21).val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode previousNode = null, firstNode = null;
        int overflow = 0;

        while (l1 != null || l2 != null || overflow > 0) {

            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;
            int sum = num1 + num2 + overflow;
            overflow = sum / 10;

            ListNode node = new ListNode(sum % 10);
            if (firstNode == null) firstNode = node;
            if (previousNode == null) {
                previousNode = node;
            } else {
                previousNode.next = node;
                previousNode = node;
            }

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return firstNode;
    }
}

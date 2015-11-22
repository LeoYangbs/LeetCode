public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode l3 = result;
        int add = 0;
        while (l1 != null || l2 != null || add == 1) {
            l3.next = new ListNode(0);
            l3 = l3.next;
            int a = 0, b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            l3.val = (a + b + add) % 10;
            add = (a + b + add) / 10;

        }
        return result.next;
    }
}

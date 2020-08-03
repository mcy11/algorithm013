package homework;

/**
 * @author mcy
 * @version 1.0
 * @date 2020-07-31 09:24
 */
public class MergeTwoList {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode end = head;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                end.next = l1;
                l1 = l1.next;
            }else {
                end.next = l2;
                l2 = l2.next;
            }
            end = end.next;
        }
        end.next = l1 == null? l2: l1;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        mergeTwoLists(l1, l2);
    }

}

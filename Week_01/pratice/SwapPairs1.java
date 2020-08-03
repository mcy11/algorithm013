package pratice;

/**
 * @author mcy
 * @version 1.0
 * @date 2020-07-29 17:22
 */
public class SwapPairs1 {

    /**
     * 现在看到的比较经典的递归求解
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

}

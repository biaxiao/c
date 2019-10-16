package leetcode;


public class 移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        while(cur!=null&&cur.next!=null){
            ListNode next =cur.next;
            if(next.val==val){
                cur.next=next.next;
            }else {
                cur=next;
            }
        }
        return dummy.next;
    }
}

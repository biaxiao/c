package leetcode;

public class 两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp=dummy;
        int carried=0;
        while(l1!=null||l2!=null||carried!=0){
            int a=0;
            int b=0;
            if(l1!=null) a=l1.val;
            if(l2!=null) b=l2.val;
            int sum = a+b+carried;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            carried=sum/10;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return dummy.next;
    }
}

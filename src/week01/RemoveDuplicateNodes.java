package week01;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicateNodes {
    public static void main(String[] args) {
       int k = 3;
       while (k-->0){
           System.out.println(k);
       }
        System.out.println(k);
       k=3;
       while(--k>0){
           System.out.println(k);
       }
    }
    public static ListNode removeDuplicateNodes(ListNode head){
    if (head==null){
        return head;
    }
    Set<Integer> onceSet = new HashSet<>();
    onceSet.add(head.val);
    ListNode pos = head;
    while(pos.next!=null){
        ListNode cur = pos.next;
        if (onceSet.add(cur.val)){
            pos = pos.next;
        }else{
            pos = pos.next.next;
        }
    }
    pos.next = null;
    return head;
    }
    class Solution {
        public ListNode removeDuplicateNodes(ListNode head) {
            if (head == null) {
                return head;
            }
            Set<Integer> occurred = new HashSet<Integer>();
            occurred.add(head.val);
            ListNode pos = head;
            // 枚举前驱节点
            while (pos.next != null) {
                // 当前待删除节点
                ListNode cur = pos.next;
                if (occurred.add(cur.val)) {
                    pos = pos.next;
                } else {
                    pos.next = pos.next.next;
                }
            }
            pos.next = null;
            return head;
        }
    }

}

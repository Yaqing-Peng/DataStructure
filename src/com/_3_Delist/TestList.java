package com._3_Delist;


import com._1_lists.ListUtils;

public class TestList {
    static ListFunction listFunction = new ListFunction();//类的L大写

    public static void testAddNode() {
        ListNode head=creatList();
        // 打印原来的链表
        printList(head);
        listFunction.addNode(head,8);//对象l小写
        printList(head);
    }

    public static void testAddNode2(){
        ListNode head=creatList();
        // 打印原来的链表
        printList(head);
        listFunction.addNode2(head,3,8);
        printList(head);
    }

    public static void testDeleteNode(){
        ListNode head=creatList();
        printList(head);
        listFunction.deleteNode(head,3);
        printList(head);
    }

    public static ListNode creatList(){
        ListNode head = new ListNode(-1);
        head.next  = new ListNode(1);
        head.next.prior=head;
        head.next.next = new ListNode(2);
        head.next.next.prior=head.next;
        head.next.next.next = new ListNode(3);
        head.next.next.next.prior=head.next.next;
        return head;
    }

    private static void printList(ListNode head) {
        ListNode p = head;
        while (p.next != null) {
            p = p.next;
            System.out.print(p.value + " ");
        }
        //打印换行
        System.out.println();
    }

    public static void testUpdateNote(){
        ListNode head=creatList();
        printList(head);
        listFunction.updateNode(head,3,8);
        printList(head);
    }

    public static void testFindPos(){
        ListNode head=creatList();
        printList(head);
        int res=listFunction.targetPos(head,3);
        System.out.println(res);;
    }

    public static void main(String[] args) {
       // testAddNode();
        //testAddNode2();
        //testDeleteNode();
       // testUpdateNote();
        testFindPos();
    }
}

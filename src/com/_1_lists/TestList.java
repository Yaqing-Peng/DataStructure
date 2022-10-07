package com._1_lists;

class TestList {

    static ListUtils listUtils = new ListUtils();
    //test add
    public static void testAddNode() {
        ListNode head = new ListNode(-1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        // 打印原来的链表
        printList(head);
        listUtils.addNode(head, 5);
        // 打印新链表
        printList(head);
    }
    public static void testAddNode2(){
        ListNode head=creatList();
        // 打印原来的链表
        printList(head);
        listUtils.addNode2(head,2,9);
        printList(head);
    }

    public static void testDeleteNode(){
        ListNode head=creatList();
        printList(head);
        listUtils.deleteNode(head,2);
        printList(head);
    }

    public static void testFindPos(){
        ListNode head=creatList();
        printList(head);
        int pos=listUtils.findPos(head,3);//先接收pos的值，再打印
        System.out.println(pos);
    }
    public static void testUpdateNote(){
        ListNode head=creatList();
        printList(head);
        listUtils.updateNode(head,2,5);
        printList(head);
    }


    public static void main(String[] args) {
        //testAddNode();
        //testAddNode2();
        //testDeleteNode();
        //testUpdateNote();
        testFindPos();

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

    public static ListNode creatList(){
        ListNode head = new ListNode(-1);
        ListNode son = new ListNode(1);
        head.next = son;
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        return head;
    }


}

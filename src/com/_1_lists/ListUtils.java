package com._1_lists;

public class ListUtils {

    // 增加一个链表节点
    // head->1->2->3->4
    //             p
    public ListNode addNode(ListNode head, int newValue) {
        ListNode p = head;
        while (p.next != null) {//找到最后的节点
            p = p.next;
        }
        p.next = new ListNode(newValue);//指向新的节点
        return head;
    }


    //在指定位置插入节点
    public ListNode addNode2 (ListNode head, int pos, int newValue){
        ListNode p=head;
        int step=1;
        while(step<pos){//找到指定的位置
            p=p.next;
            step++;
        }
        ListNode q=new ListNode(newValue); //  把要插入的数据转化为节点
        q.next=p.next;
        p.next=q;
        return head;
    }


    // 删除一个链表节点
    public ListNode deleteNode(ListNode head, int targetValue){
        ListNode p=head;
        while(p.next.value!=targetValue){
            p=p.next;
        }
        p.next=p.next.next;
        return head;
    }


    // 修改一个节点的值
    public ListNode updateNode(ListNode head, int targetPos, int targetValue){
        ListNode p=head;
        int step=0; //step用于记录节点的位置，注意它和p的关系是否同步
        while(step<targetPos){
            p=p.next;
            step++;
        }
        p.value=targetValue;
        return head;
    }

    // 查询某个节点属于第几个
    public int findPos(ListNode head, int targetValue){
        ListNode p=head;
        int pos=0;
        while(p.value != targetValue){
            p=p.next;
            pos++;
        }
        return pos;
    }

}



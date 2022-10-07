package com._3_Delist;


public class ListFunction {
    //在末尾增加一个节点
    public ListNode addNode(ListNode head, int newValue) {
        ListNode p = head;
        while (p.next != null) {//找到最后的节点
            p = p.next;
        }
        p.next = new ListNode(newValue);//指向新的节点
        p.next.prior=p;
        return head;
    }


    //在指定位置增加一个节点
    public ListNode addNode2 (ListNode head, int pos, int newValue){
        ListNode p=head;
        int step=1;
        while(step<pos){//找到指定的位置
            p=p.next;
            step++;
        }
        ListNode q=new ListNode(newValue); //  把要插入的数据转化为节点
        q.next=p.next;
        p.next.prior=q;
        q.prior=p;
        p.next=q;
        return head;
    }


    //删除指定位置的节点
    public ListNode deleteNode(ListNode head, int targetValue){
        ListNode p=head;
        while(p.next.value!=targetValue){
            p=p.next;
        }
        if (p.next.next==null){
            p.next.prior=null;//先删除后指针，否则找不到后一个节点
            p.next=null;
        }else {
            p.next=p.next.next;//这句话已经改变了p.next的值了
            p.next.prior=p;//这里要用上面的新值
        }
        return head;
    }


    //修改一个节点的值
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


    //查找一个节点的位置
    public int targetPos(ListNode head, int targetValue){
        ListNode p= head;
        int pos=0;
        while (p.value!=targetValue){
          pos++;
          p=p.next;
      }
      return pos;
    }

}

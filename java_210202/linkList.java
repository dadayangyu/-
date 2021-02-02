package java_210202;

public class linkList {
    /*
    //单向链表
    int val;  //链表中要保存的元素
    Node next;  //链表的下一个节点的引用，到尾结点next=null；
    //双向链表:代价多一个引用
    int val;
    Node next;
    Node prev;
    //链表本质上为了解决顺序表中“搬运”的问题，中间插入/中间删除，直接跳转
    //链表的付出的额外代价就是额外的空间
    //链表的其他形式：带傀儡节点的链表：带头结点的链表，不实际存储数据，只是用来占个位置；不带傀儡节点的链表
    //带环的链表和不带环的链表
    //引入傀儡节点的目的是为了让代码写起来更加简单
    //单向不带傀儡节点不带环的链表和双向带傀儡节点带环的链表在开发和面试中用的较多
    //只要知道链表的头结点，就可以获取到链表的所有元素，在笔试题中特别喜欢用头结点代指整个链表
    //链表实现再抽象一层。通过一个类。表示“链表”概念，再通过一个类，表示节点的概念，has -a/n
     */
    public static class Node{
        public int val;
        public Node next=null;
        public Node(int val){
            this.val=val;
        }
        @Override
        public String toString(){
            return "["+val+"]";
        }
    }
}

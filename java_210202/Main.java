package java_210202;
public class Main {
    public static linkList.Node createList() {
        //链表操作中很多都是基于引用操作
        linkList.Node a = new linkList.Node(1);
        linkList.Node b = new linkList.Node(2);
        linkList.Node c = new linkList.Node(3);
        linkList.Node d = new linkList.Node(4);
        //给引用进行赋值；.操作就是“解引用”，根据地址找到对象的本地，对对象本体进行操作。
        //解引用的操作主要就是.和[],而[]只针对数组，像Node这样的类型，只有.的解引用
        //abcd都是局部变量，方法结束后这四个局部变量就都没了
        //a就是头节点的引用
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;//这个代码可以不写，Node的构造方法，默认就是把next写成null
        return a;
    }

    public static void main(String[] args) {
        linkList.Node head = createList();
        /*
        //1、遍历链表操作，打印链表的每个元素
        for(linkList.Node cur=head ;cur!=null;cur=cur.next){
            System.out.println(cur.val);
        }
        */
        //2、通过遍历找到链表的最后一个节点（这个代码中还有个重要缺陷：空指针异常解决方法判空检查）head有可能为空（表示一个空链表，一个节点都没有）
        linkList.Node cur=head;
        while(cur!=null&&cur.next!=null){
            cur=cur.next;//解引用的时候，必须保证引用指向的是有效对象
        }
        //一旦循环结束就cur就指向链表的最后一个节点
        System.out .println(cur.val);
        /*
        //3、通过遍历找到倒数第二个节点（next.next为null）
        linkList.Node cur=head;
        while(cur!=null&&cur.next!=null&&cur.next.next!=null){
            cur=cur.next;
        }
        System.out.println(cur.val);
        //4、取链表的第N个节点
        int N=2;
        linkList.Node cur=head;
        for(int i=0;i<N;i++) {
            cur=cur.next;
        }
            System.out.println(cur.val);
        }
        //5.获取链表的长度
        int count = 0;
        for (linkList.Node cur = head; cur != null; cur = cur.next)
            count++;
        System.out.println(count);
        //6、遍历链表，查找链表上是否存在某个元素
        int toFind=-1;
        linkList.Node cur=head;
        for(;cur!=null;cur=cur.next){
            if(cur.val==toFind){
                break;
            }
    }
        if(cur!=null){
        System.out.println("找到了");
        }else {
            System.out.println("没找到");
        }
         */
    }
}



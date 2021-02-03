package java_210203;

public class linkListOfInsertAndDelete {
    public static Node createList(){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return a;
    }
    //不带傀儡节点的链表，插入中间位置和插入头部位置，是两个不同的代码
    //带傀儡节点的链表将插入中间和插入头部两个操作统一在一起
    //傀儡链表里面的链表认为长度就是4
    public static Node createListWithDummy() {
        Node dummy = new Node(0);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        dummy.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return dummy;
    }
    // 遍历一个不带傀儡节点的链表
    public static void print(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.val);
        }
    }
    // 遍历一个带傀儡节点的链表
    public static void printWithDummy(Node head) {
        for (Node cur = head.next; cur != null; cur = cur.next) {
            System.out.println(cur.val);
        }
    }
    // 尾插一个节点
    public static Node insertTail(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            return newNode;
        }
        // 1. 先找到末尾节点
        Node prev = head;
        while (prev.next != null) {
            prev = prev.next;
        }
        // 循环结束,  prev 就是最后一个节点了~
        newNode.next = prev.next;
        prev.next = newNode;
        return head;
    }
    // 删除节点, 此处是按照值来删除
    public static void remove(Node head, int value) {
        // 1. 先找到 val 这个值对应的位置
        //    同时也要找到 val 的前一个位置
        Node prev = head;
        while (prev != null
                && prev.next != null
                && prev.next.val != value) {
            prev = prev.next;
        }
        // 循环结束之后, prev 就指向待删除节点的前一个节点了.
        if (prev == null || prev.next == null) {
            // 没有找到值为 val 的节点
            return;
        }
        // 2. 真正进行删除了, toDelete 指向要被删除的节点
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }
    // 删除节点, 按照位置来删除.
    public static void remove(Node head, Node toDelete) {
        // 1. 先需要找到 toDelete 的前一个节点
        Node prev = head;
        while (prev != null && prev.next != toDelete) {
            prev = prev.next;
        }
        if (prev == null) {
            // 没找到
            return;
        }
        // 2. 进行删除
        prev.next = toDelete.next;
    }

    public static void remove2(Node head, Node toDelete) {
        Node nextNode = toDelete.next;
        toDelete.val = nextNode.val;
        toDelete.next = nextNode.next;
    }

    public static int size(Node head) {
        int size = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }
    // 给定节点下标来删除.
    public static void remove3(Node head, int index) {
        if (index < 0 || index >= size(head)) {
            return;
        }
        // 如果 index 为 0, 意味着要删除头结点(一会再考虑)
        if (index == 0) {
            // TODO
        }
        // 1. 还是要先找到待删除节点的前一个位置. index - 1 这个节点就是前一个位置
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        // 循环结束之后, prev 就指向了待删除节点的前一个位置
        // 2. 真正进行删除
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }


    public static void main(String[] args){
        /*
        Node head=creatList();
        //1、把新节点插入节点1和2之间
        Node one=head;
        //先把newNode的next指向one的next
        newNode.next=one.next;
        //再把one的next指向newNode
        one=one.next;
        //2、把节点插入到头节点之前
        //让newNode的next指向head
        newNode.next=head;
        //再让head指向新节点
        head=newNode;
        //创建带傀儡节点的链表
        Node head=createListWithDummy();
        Node newNode=new Node(100);
        //在傀儡节点里分别在头部和中间插入
        // 1. 往中间某个位置插入. 需要知道待插入位置的前一个位置.
        //    例如, 还是往 1 和 2 之间插入
        //    prev 就是指向 1 的位置. prev 名字的由来, 表示前一个元素
        Node prev = head.next;
        newNode.next = prev.next;
        prev.next = newNode;
        // 2. 往链表头部插入. (由于是带傀儡节点, 其实是插入到 head 的后面)
        Node prev = head;
        newNode.next = prev.next;
        prev.next = newNode;
        Node head = createList();
        Node head = null;
        head = insertTail(head, 100);
        print(head);
         */
        Node head = createList();
        // toDelete 指向 3 这个节点了.
        Node toDelete = head.next.next;
        remove(head, toDelete);
        print(head);
    }
}

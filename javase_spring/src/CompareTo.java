//用implements comparable声明才具有比较大小的能力
class Teacher implements Comparable<Teacher>{
    String name;
    int age;
    int height;
    int weight;
    public Teacher(String name,int age, int height, int weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int compareTo(Teacher o) {
       /*重写equals方法 //检查是不是null
        if(obj==null){
            return false;
        }
        //检查类型是不是同一类型
        if(!(obj instanceof Teacher)){
            return false;
        }
        //根据设计类的目的,来判断对象是否代表同一个现实事物,设计思路:主要是名字一样,就代表同一个现实事物
        Teacher o=(Teacher)obj;
        return  this.name.equals(o.name);*/
        if (this.age < o.age) {
            return -1;
        }
        else if (this.age == o.age) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
public class CompareTo {
    /**
     * 题目:实现方法compareto
     * 题目描述:实现方法compareTo,能够实现按照字典序比较字符串的大小
     * 
    * */
    public static void main(String args[]) {
        Teacher t1 = new Teacher("高博", 18, 190, 80);
        Teacher t2 = new Teacher("陈沛鑫", 38, 170, 100);
        //对两个对象进行"比较"
        /*int r=t1.compareTo(t2);
        if(r<0){
            System.out.println("高博小于陈沛鑫");
        }
        else if(r==0){
            System.out.println("高博等于陈沛鑫");
        }
        else{
            System.out.println("高博大于陈沛鑫");
        }*/
        int r = t2.compareTo(t1);
        if (r < 0) {
            System.out.println("陈沛鑫小于高博");
        }
        else if (r == 0) {
            System.out.println("陈沛鑫等于高博");
        }
        else {
            System.out.println("陈培鑫老师大于高博");
        }

    }
}

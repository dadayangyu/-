import java.util.Comparator;
class ByHeightComparator implements Comparator<Teacher>{

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.height-o2.height;

    }
}
class ByWeightComparator implements Comparator<Teacher>{

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.weight-o2.weight;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("高博", 18, 190, 80);
        Teacher t2 = new Teacher("陈沛鑫", 38, 170, 100);
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
        Comparator<Teacher> byHeight=new ByHeightComparator();
        Comparator<Teacher> byWeight=new ByWeightComparator();
        System.out.println(r);
    }
}

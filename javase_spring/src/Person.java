//写一个泛型类
public class Person <T>{
    public String name;
    public int age;
    public T special;//把T当成一个类型去用
    Person(String name,int age,T special){
        this.name=name;
        this.age=age;
        this.special=special;
    }

    public static void main(String[] args) {
        Person<String> p1=new Person<>("String",18,"String");

    }

}

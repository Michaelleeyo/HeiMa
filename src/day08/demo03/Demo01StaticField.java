package day08.demo03;
/*
如果一个成员变量用来static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享一份数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("A",12);
        Student two = new Student("B",14);
        two.room = "101教室";
        System.out.println("姓名"+one.getName()+",学号"+one.getId()+",年龄"+one.getAge()+"，教室"+two.room);
        System.out.println("姓名"+two.getName()+",学号"+two.getId()+",年龄"+two.getAge()+"，教室"+one.room);
    }
}

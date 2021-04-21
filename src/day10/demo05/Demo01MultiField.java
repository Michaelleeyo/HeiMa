package day10.demo05;
/*
方法成员变量两种方式：
1.直接通过对象名称访问成员方法：等号左边是谁，优先用谁，没有往上找
2.间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有往上找
 */
public class Demo01MultiField {

    public static void main(String[] args) {
        //用了多态的写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);
        //System.out.println(obj.age);//错误写法

        //子类没有覆盖重写就是父：10
        //子类覆盖重写就是子：20
        obj.showNum();
    }
}

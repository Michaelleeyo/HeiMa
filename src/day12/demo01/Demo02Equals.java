package day12.demo01;

import java.util.ArrayList;

/*
Person类默认继承了Object类，所以可以使用Object类的equals方法
boolean equals(Object obj)指示其他某个对象是否与此对象“相等”。
equals方法源码：
public boolean equal(Object obj){
return ( this == obj );
}
参数：
    Object obj：可以传递任意的对象
    == 比较运算符，返回的是一个布尔值 true false
    基本数据类型比较的是值
    引用数据类型比较的是两个对象的地址值
    this是谁？哪个对象调用的方法，方法中的this就是哪个对象；p1调用的equals方法this就是p1
    obj是谁？传递过来的参数p2
    this == obj -->p1 == p2
 */
public class Demo02Equals {

    public static void main(String[] args) {
        Person p1 = new Person("张三",12);
        Person p2 = new Person("李四",15);
        System.out.println("p1地址值："+p1);
        System.out.println("p2地址值："+p2);

        ArrayList<String> list = new ArrayList<>();

        boolean b = p1.equals(list);
        System.out.println(b);
    }
}

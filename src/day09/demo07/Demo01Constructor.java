package day09.demo07;
/*
继承关系中，父子类构造方法的访问特点
1.子类构造方法当中有一个默认隐含"super()"调用，所以一定要先调用父类构造方法，再执行子类构造方法
2.子类构造可以用super来调用父类重载构造
3.super的父类构造调用，必须是子类构造方法的第一个语句。不能一个子类构造调用多次super构造
4.子类必须调用父类构造方法，不写则赠送super(),写了则用写的指定super调用，super只能有一个，还必须是第一个
 */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}

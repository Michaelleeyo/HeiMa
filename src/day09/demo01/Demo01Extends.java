package day09.demo01;
/*
在继承的关系中，“子类就是一个父类”。也就是说子类可以被看做父类来看

定义符类的格式：（一个普通类的定义）
public class 父类名称{
...
}

定义子类的格式：
public class 子类名称 extends 父类名称{
...
}

 */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher = new Teacher();
        //子类Teacher虽然没有写任何东西，但是会继承父类的method方法
        teacher.method();
    }
}

package day11.demo01;
/*
当final关键字修饰一个类的时候。格式：
public final class 类名称{
...
}
含义：这个类不能有任何子类，一定有父类
注意：一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写（因为没儿子）
 */
public final class MyClass {

    public void method(){
        System.out.println("方法执行");
    }
}

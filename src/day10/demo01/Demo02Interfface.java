package day10.demo01;
/*
1.接口的默认方法，可以通过接口实现类对象，直接调用
2.接口的默认方法：也可以被接口实现类进行覆盖重写
 */
public class Demo02Interfface {
    public static void main(String[] args) {
        //创建实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();

        a.methodDefault();
        System.out.println("=============");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}

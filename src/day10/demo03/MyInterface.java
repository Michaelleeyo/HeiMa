package day10.demo03;
/*
这个子接口有几种方法呢？答：4个
methodA来源A
methodB来源B
methodCommom来源A,B
method来源自己
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB{

    public abstract void method();

    @Override
    public default void methodDefault() {

    }
}

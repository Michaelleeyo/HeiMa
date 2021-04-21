package day10.demo01;
/*
从JAVA 8开始，接口中允许定义默认方法
格式：
public default 返回值类型 方法名称（参数列表）{
方法体
}

备注：接口当中的默认方法，可以解决接口升级问题
 */
public interface MyInterfaceDefault {
    //这是一个抽象方法
    public abstract void methodAbs();
    //新添加一个抽象方法
    //public abstract void methodAbs2();

    //新添加方法：改成默认方法
    public default void methodDefault(){
        System.out.println("这是一个默认方法");
    }
}

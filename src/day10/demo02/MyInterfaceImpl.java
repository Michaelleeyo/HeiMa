package day10.demo02;

import day10.demo01.MyInterfacePrivateB;

public  class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA(){
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodB(){
        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void methodAbs(){
        System.out.println("覆盖重写了A,B接口都有的Abs方法");
    }

    @Override
    public void methodDefault(){
        System.out.println("对多个接口当中冲突的默认方法进行覆盖重写");
    }
}

package day11.demo01;
/*
当final关键字修饰一个方法，这个方法就是最终方法，不能覆盖重写
格式：
修饰符 final 返回值类型 方法名称(参数列表){
方法体
}
注意事项：
对于类，方法来说，abstract关键字和final不能同时使用，因为矛盾
 */
public abstract class Fu {

    public final void method(){
        System.out.println("父类方法执行");
    }

    public abstract void methodAbs();
}

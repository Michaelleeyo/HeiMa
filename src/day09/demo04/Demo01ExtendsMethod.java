package day09.demo04;
/*
在父子类的继承关系中，创建子类对象，访问成员方法规则：
创建的对象是谁，就优先用谁，没有则向上找

注意事项：
无论成员方法还是成员变量，如果没有都是向上找父类，不会向下找子类

重写（override)
概念：在继承关系中，方法的名称一样，参数列表也一样。
重写（override）：方法名称一样，参数列表也一样。覆盖，重写。
重载（overload）：方法名称一样，参数列表不一样。

方法的覆盖重写的特点：创建的时子类对象，则优先用子类方法。
 */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {

    Zi zi = new Zi();

    zi.methodFu();
    zi.methodZi();

    //创建的时new了子类对象，所以优先子类方法
        zi.method();
    }
}

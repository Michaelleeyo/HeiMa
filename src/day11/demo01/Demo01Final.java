package day11.demo01;
/*
final关键字代表最终，不可改变

常见四种用法：
1.可以用来修饰一个类
2.可以用来修饰一个方法
3.可以用来修饰一个局部变量
4.可以用来修饰一个成员变量

 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);//10
        num1 = 20;
        System.out.println(num1);//20

        //一旦使用final来修饰局部变量，那么这个变量就不能进行更改
        final int num2 = 200;
        System.out.println(num2);

        //正确写法，只要保证有唯一一次赋值即可
        final int num3;
        num3 = 30;

        //对于基本类型来说，不可变说的是当中的数据不可改变
        //对于应用类型来说，不可变说的是当中的地址值不可改变
        Student stu1 = new Student("张");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("王");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        final Student stu2 = new Student("赵");
        System.out.println(stu2.getName());
        //错误写法，final的引用类型变量，其中的地址不可改变
        //stu2 = new Student("李");
        stu2.setName("孙");
        System.out.println(stu2.getName());

    }
}

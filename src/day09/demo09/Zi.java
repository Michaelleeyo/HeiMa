package day09.demo09;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容。用法三种：
1.本类的成员方法中，访问本类的成员变量
2.在本类的成员方法中，访问呢本类的另一个成员方法
3.在本类的构造方法中，访问本类的另一个构造方法
在第三中用法中要注意：
1.this(...)调用必须时构造方法的第一个语句，唯一语句
2.super和this两种构造调用，不能同时使用
 */
public class Zi extends Fu{
    int num = 20;

    public Zi(){
        this(124);//本类的无参构造，调用本类的有参构造
        //this(1,2);//错误写法！
    }

    public Zi(int n){
        this(1,2);
    }

    public Zi(int n,int m){

    }

    public void showNum(){
        int sum = 10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类中的成员变量
        System.out.println(super.num);
    }

    public void methodA(){
        System.out.println("AAA");
    }

    public void methodB(){
        this.methodA();
        System.out.println("BBB");
    }
}

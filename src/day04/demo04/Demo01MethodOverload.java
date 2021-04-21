package day04.demo04;

/*
对于功能类似的方法来说，因为参数列表不同，要记住不同的方法名称，太麻烦

方法的重载：Overload  多个方法的名称一样，但是参数列表不同
只需要记住唯一一个方法的名称，就可以实现多个功能

方法重载与下列因素相关：
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同

方法重载与下列方法无关：
1.与参数的名称无关
2.与方法的返回值类型无关
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
/*        System.out.println(sumThree(10,20,30));
        System.out.println(sumTwo(10,20));*/
        System.out.println(sum(10, 30, 30));
        System.out.println(sum(10, 30));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}

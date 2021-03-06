package day04.demo03;

/*
使用方法的时候，注意事项：
1.方法应该定义在类当中，但是不能在方法当中再定义方法，不能嵌套
2.方法的前后顺序无所谓
3.方法定义之后不会执行，如果要执行，必须调用方法
4.如果方法有返回值数据，必须和方法的返回值类型，对应起来
5.return后面的返回值数据，必须和方法的返回值类型，对应起来
6.对于void没有返回值的方法，不能写return后面的返回值，只能return自己
7.对于void方法当中最后一行的return可以省略不写
8.一个方法当中可以有多个return语句，但必须要保证同时只有一个会被执行到，两个return不能连写
 */
public class Demo04MethodNotice {
    public static int method1() {
        return 10;
    }

    public static void method2() {
        //return 10;错误的写法！方法没有返回值，return后面就不能写返回值
        return;//没有返回值，只是结束方法的执行
    }

    public static void method3() {
        System.out.println("AAAA");
        System.out.println("BBBB");
    }

    public static int getMax(int a, int b) {
/*        int max;
        if(a>b){
            max = a;
        }
        else {
            max = b;
        }
        return max;*/
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

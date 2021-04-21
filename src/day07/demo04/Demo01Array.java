package day07.demo04;
/*
数组有个缺点，一旦创建，程序运行期间长度不可发生变化
 */
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("张",12);
        Person two = new Person("王",22);
        Person three = new Person("李",32);
//将one当中的地址值赋值到数组的0号元素
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);//地址值
        System.out.println(array[1]);//地址值
        System.out.println(array[2]);//地址值

        System.out.println(array[1].getName());
    }
}

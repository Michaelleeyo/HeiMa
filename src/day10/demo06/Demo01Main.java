package day10.demo06;
/*
向上转型一定是安全的
对象一旦向上转型为父类，那么就无法调用原本子类特有方法

解决方法：用对象的向下转型【还原】
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是：父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();

        //animal.catchFish();//错误写法
        Cat cat = (Cat)animal;
        ((Cat) animal).catchFish();

        //错误的向下转型，
        //Dog dog = (Dog)animal;//错误写法，编译不会报错，运行异常
        //java.lang.ClassCastException
    }
}

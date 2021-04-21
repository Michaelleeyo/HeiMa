package day10.demo06;
/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象 instanceOf 类名称
者将得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例。
 */
public class Demo02InstanceOf {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        //如果希望调用子类特有方法，需要向下转型
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchFish();
        }
    }

    public static void GiveMeAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchFish();
        }
    }
}

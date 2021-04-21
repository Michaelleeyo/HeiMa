package day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据Phone类，创建一个名为one的对象
        //格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.broad);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null

        one.broad = "苹果";
        one.price = 8382;
        one.color = "黑色";
        System.out.println(one.broad);
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("乔布斯");
        one.sendMessage();

    }
}

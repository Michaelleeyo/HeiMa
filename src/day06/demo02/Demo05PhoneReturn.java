package day06.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.broad);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.broad = "苹果";
        one.price = 8388;
        one.color = "玫瑰金";
        return one;
    }
}

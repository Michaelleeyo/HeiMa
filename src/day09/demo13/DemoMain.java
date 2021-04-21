package day09.demo13;

public class DemoMain {
    public static void main(String[] args) {
        Dog2Ha ha = new Dog2Ha();//这是普通类可以直接new
        ha.sleep();
        ha.eat();
        System.out.println("============");

        DogGolden golden = new DogGolden();
        golden.sleep();
        golden.eat();
    }
}

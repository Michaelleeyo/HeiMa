package day10.demo07;

public class DemoMain {

    public static void main(String[] args) {
        //先创建一个电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用
        USB mouse = new Mouse();//多态
        //参数是USB类型，我正好传递进去的就是USB鼠标
        computer.useDevice(mouse);

        //准备一个键盘，供电脑使用
        Keyboard keyboard = new Keyboard();//没有用多态
        //方法参数是usb类型，传递进去的是实现类对象
        computer.useDevice(keyboard);//正确写法，也发生了向上转型
        //使用子类对象，匿名对象，也可以
        computer.useDevice(new Keyboard());//也是正确写法



        computer.powerOff();

    }


}

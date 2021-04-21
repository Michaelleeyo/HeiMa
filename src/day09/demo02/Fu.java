package day09.demo02;

public class Fu {
    int numFu = 10;
    int num = 100;
    public void methodWho(){
        //使用的时本类当中的，不会向下找子类的
        System.out.println(num);
    }
}

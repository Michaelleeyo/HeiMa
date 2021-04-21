package day08.demo02;
/*
分割字符串的方法：
public String[] split(String regex):按住参数的规则，将字符串切分为若干个部分
 注意事项：
 split方法的参数其实是正则表达式
 注意：如果按照应为句点"."，进行切分，必须写"\\."
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
        }

        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}

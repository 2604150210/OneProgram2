package bag;

import java.util.Scanner;

/**
 * Created by c on 2017/7/23.
 */
public class TestInput {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入您的姓名： ");
        String name = s.nextLine();

        System.out.println("请输入您的年龄： ");
        int age = s.nextInt();

        System.out.println("请输入您的工资：");
        double salary = s.nextDouble();

        System.out.println("您的个人情况如下： ");
        System.out.println("姓名：" + name + ", 年龄： " + age + ", 工资：" + salary);
    }
}

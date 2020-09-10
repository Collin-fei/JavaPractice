package Chapter3;


import java.io.Console;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/9/10.
 */
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入你的名字：");
        String name = in.nextLine();
        System.out.println("你的名字是：" + name);

    }
}

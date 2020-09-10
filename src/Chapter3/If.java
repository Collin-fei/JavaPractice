package Chapter3;



import java.util.Scanner;

/**
 * Created by Administrator on 2020/9/10.
 */
public class If {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入你的年龄：");
        int age = in.nextInt();
        if(age > 4){
            System.out.println("欢迎加入Java幼儿园");
        }else{
            System.out.println("再玩两年泥巴");
        }
    }
}

package Chapter3;

/**
 * Created by Administrator on 2020/9/10.
 */
public class While {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <= 100){
             sum = sum + i;
             ++i;
        }
        System.out.println(sum);
    }
}

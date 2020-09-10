package Chapter3;

/**
 * Created by Administrator on 2020/9/10.
 */
public class For {
    public static void main(String[] args) {
        int sum = 0;
        int end = 101;
        //从1加到100
        for(int i = 1;i < end;++i){
            sum = sum + i;

        }
        System.out.println(sum);

        for(int j = 10 ; j>=0;--j){
            System.out.println("倒计时" + j);
            if(j==0){
                System.out.println("Game Over!");
            }
        }
    }

}

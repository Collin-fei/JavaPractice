package Chapter3;

/**
 * Created by Administrator on 2020/9/10.
 */
public class Switch {
    public static void main(String[] args) {
        int day = 6;
        int week = 25;
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5 :
                System.out.println("今天要上班");
                break;
            case 6:
                if(week % 2 == 0){
                    System.out.println("这周双周放假");
                }else{
                System.out.println("这周是单周好好加班");

                }
                break;
            case 7:
                System.out.println("今天放假");
                break;


        }
    }
}

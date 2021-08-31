import org.junit.Test;

import java.util.*;

public class demo1 {
    public static void main(String[] args) {

    }

    @Test
    public void findNum(){
        //输入一个数，计算这个是以内的所有奇数和偶数的和
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println("请输入一个数字：");
            num = Integer.parseInt(sc.nextLine());
            if(num > 2){
                break;
            }else{
                System.out.println("请输入比2大的数字！");
            }
        }

        int jNum = 0;
        int oNum = 0;
        for (int i = 1; i <= num; i++) {
            if(i%2 == 0){
                jNum += i;
            }else{
                oNum += i;
            }
        }
        System.out.println("奇数和为:" + jNum);
        System.out.println("偶数和为:" + oNum);
    }


    @Test
    public void addNum(){
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for(int j = 1; j<=i;j++){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}

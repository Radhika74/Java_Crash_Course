import java.util.*;
public class sum_odd{
    public static int fuc_odd(int num){
        int sum = 0;
        for (int i=0; i<=num; i++){
            if (i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = fuc_odd(num);
        System.out.println(res);
    }
}
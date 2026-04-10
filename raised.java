import java.util.*;
public class raised {
    public static int raised(int x, int n){
        int res = (int)(Math.pow(x,n));
        return res;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n =sc.nextInt();
        int res = raised(x,n);
        System.out.println(res);
    }
}

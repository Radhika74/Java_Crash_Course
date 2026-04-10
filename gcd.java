import java.util.*;
public class gcd{
    public static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = gcd(a,b);
        System.out.println(res);
    }

}
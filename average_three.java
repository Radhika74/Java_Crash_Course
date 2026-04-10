import java.util.*;
public class average_three {
    public static int average_fuc(int a, int b, int c){
        int res = (a+b+c)/3;
        return res;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = average_fuc(a,b,c);
        System.out.println(result);
    }
}
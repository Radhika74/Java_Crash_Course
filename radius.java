import java.util.*;
public class radius {
    public static double rad(int num1){
        double res = 2*3.14*num1;
        return res;
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double cir= rad(a);
        System.out.println(cir);

    }
}

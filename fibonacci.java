import java.util.*;
public class fibonacci {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a=0, b=1;
        if (n >= 1)
            System.out.print(a);

        if (n >= 2)
            System.out.print(" " + b);
        for (int i=3; i<=n;i++){
            long res = a+b;
            System.out.print(" "+res);
            a=b;
            b=res;
        }
    }
}
